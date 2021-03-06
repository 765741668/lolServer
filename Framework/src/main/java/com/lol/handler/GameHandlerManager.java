package com.lol.handler;

import io.netty.channel.ChannelHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * 业务逻辑管理类
 *
 * @author Randy
 *         2015-2-3
 */
public class GameHandlerManager {

    /**
     * 业务逻辑集合
     */
    private Map<String, GameProcessor> processorMap = new HashMap<>();

    private Map<Integer, ChannelHandler> channelHandlerMap = new HashMap<>();

    public static GameHandlerManager getInstance() {
        return GameHandlerManagerHolder.instance;
    }

    /**
     * 注册业务逻辑
     *
     * @param protocol
     * @param channel
     * @throws Exception
     */
    public void registerHandler(int protocol, ChannelHandler channel) throws Exception {
        channelHandlerMap.put(protocol, channel);
    }

    /**
     * 获取业务逻辑
     *
     * @return
     */
    public ChannelHandler getHandler(int protocol) {
        return channelHandlerMap.get(protocol);
    }

    /**
     * 获取业务逻辑
     *
     * @return
     */
    public Map<Integer, ChannelHandler> getAllHandler() {
        return channelHandlerMap;
    }

    /**
     * 注册业务逻辑
     *
     * @param cls
     * @param msgType
     * @param aera
     * @throws Exception
     */
    public void registerProcessor(GameProcessor cls, int msgType, int aera) throws Exception {
        processorMap.put(msgType + "-" + aera, cls);
    }

    /**
     * 获取业务逻辑
     *
     * @param msgType_aera
     * @return
     */
    public GameProcessor getProcessor(String msgType_aera) {
        for (Map.Entry<String, GameProcessor> map : processorMap.entrySet()) {
            System.out.println(map.getKey());
        }
        return processorMap.get(msgType_aera);
    }

    private static class GameHandlerManagerHolder {
        private static GameHandlerManager instance = new GameHandlerManager();
    }
}
