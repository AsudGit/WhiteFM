package com.mnilsy.socket;

import com.mnilsy.bean.MessageBean;
import com.mnilsy.pojo.MessagePojo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by MNILSY on 2018/11/18.
 */

public class SocketManage {
    private static Map<String, SocketServer> socketServers = new ConcurrentHashMap<String, SocketServer>();

    public static void add(String id, SocketServer socketServer) {
        socketServers.put(id, socketServer);
    }

    public static void remove(String id) {
        socketServers.remove(id);
    }

    public static int getSessionSize() {
        return socketServers.size();
    }

    public static boolean isOnline(String u_Id){
        return socketServers.get(u_Id)!=null;
    }

    public static void sendMessage(MessageBean messageBean){
        SocketServer socketServer=socketServers.get(messageBean.getM_Recipient());
        socketServer.sendMessage(messageBean);
    }
}
