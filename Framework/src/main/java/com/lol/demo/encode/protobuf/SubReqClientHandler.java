package com.lol.demo.encode.protobuf;

import com.lol.demo.encode.protobuf.SubscribeReqProto.ProtoBody;
import com.lol.demo.encode.protobuf.SubscribeReqProto.ProtoHeader;
import com.lol.demo.encode.protobuf.SubscribeRespProto.SubscribeResp;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SubReqClientHandler extends ChannelHandlerAdapter {

    private static final Logger logger = Logger.getLogger(SubReqClientHandler.class.getName());

    public SubReqClientHandler() {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        for (int i = 0; i < 10; i++) {
            ctx.write(req(i));
        }
        ctx.flush();
    }

    private SubscribeReqProto.SubscribeReq req(int i) {
        ProtoHeader.Builder header = ProtoHeader.newBuilder();
        header.setSubReqID(i);
        header.setMsgType(ProtoHeader.MsgType.LOGIN_OK);

        List<String> address = new ArrayList<String>();
        address.add("Nanjing");
        address.add("Beijing");

        ProtoBody.Builder body = ProtoBody.newBuilder();
        body.setProductName("Netty Book" + i);
        body.setUserName("leeka");
        body.addAllAddress(address);
        body.getMutableHeaderMap().put("head1", header.build());

        SubscribeReqProto.SubscribeReq.Builder r = SubscribeReqProto.SubscribeReq.newBuilder();
        r.setHeader(header);
        r.setBody(body);

        return r.build();
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        // super.channelReadComplete(ctx);
        ctx.flush();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        SubscribeResp resp = (SubscribeResp) msg;
        System.out.println("receive server response:[");
        System.out.println(resp);
        System.out.println("]");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        logger.warning("unexpected exception from downstream:" + cause.getMessage());
        ctx.close();
    }

}