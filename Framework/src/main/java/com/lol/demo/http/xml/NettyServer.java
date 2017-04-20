package com.lol.demo.http.xml;

import hk.hkjc.yzh.schema.test.jibx.shiporderv1.CTshiporder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NettyServer {
    private final Logger logger = LoggerFactory.getLogger(NettyServer.class);

    public static void main(String[] args) throws Exception {
        new NettyServer().bind(8107);
    }

    public void bind(int port) {
        // handle server receive client link thread group
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        // handle io thread group
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 3000)
                    .option(ChannelOption.SO_SNDBUF, 2048)
                    .option(ChannelOption.SO_KEEPALIVE, true)
                    .option(ChannelOption.SO_REUSEADDR, true)
                    .option(ChannelOption.ALLOW_HALF_CLOSURE, true)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch)
                                throws Exception {
                            ch.pipeline().addLast("http-request-decoder", new HttpRequestDecoder());
                            ch.pipeline().addLast("http-aggregator", new HttpObjectAggregator(65536));
                            ch.pipeline().addLast("xml-request-decoder", new HttpXmlRequestDecoder(CTshiporder.class, true));
                            ch.pipeline().addLast("http-response-encoder", new HttpResponseEncoder());
                            ch.pipeline().addLast("xml-response-encoder", new HttpXmlResponseEncoder());
                            ch.pipeline().addLast("xmlClientHandle", new HttpXmlServerHandle());
                        }
                    });

            ChannelFuture f = serverBootstrap.bind(port).sync();
            logger.info("server start up...");
            f.channel().closeFuture().sync();

        } catch (Exception e) {
            logger.error("server({}) start error : {}", port, e.getMessage(), e);
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
            logger.info("Server(" + port + ")  freed thread group RAM.");
        }
    }

}