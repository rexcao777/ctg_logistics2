package com.ctgstw.logisticsmic.config;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能: webSocket连接
 * 创建日期:2018/9/21-15:26
 * 创建人:薛陈
 */
@ServerEndpoint(value = "/socketServer/{userId}")
@Component
public class SocketServer {

    private Session session;
    private static Map<String, Session> sessionPool = new HashMap<>();
    private static Map<String, String> sessionIds = new HashMap<>();

    /**
     * 用户连接时触发
     *
     * @param session
     * @param userId
     */
    @OnOpen
    public void open(Session session, @PathParam(value = "userId") String userId) {
        this.session = session;
        sessionPool.put(userId, session);
        sessionIds.put(session.getId(), userId);
    }

    /**
     * 收到信息时触发
     *
     * @param message
     */
    @OnMessage
    public void onMessage(String message) {
        System.out.println("当前发送人sessionid为" + session.getId() + "发送内容为" + message);
    }

    /**
     * 连接关闭触发
     */
    @OnClose
    public void onClose() {
        sessionPool.remove(sessionIds.get(session.getId()));
        sessionIds.remove(session.getId());
    }

    /**
     * 发生错误时触发
     *
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        error.printStackTrace();
    }

    /**
     * 信息发送的方法
     *
     * @param message
     * @param userId
     */
    public static void sendMessage(String message, String userId) {
        Session s = sessionPool.get(userId);
        if (s != null) {
            try {
                s.getBasicRemote().sendText(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

