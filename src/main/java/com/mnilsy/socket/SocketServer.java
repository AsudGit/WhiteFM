package com.mnilsy.socket;

import com.mnilsy.DecoderEncoder.MessageDecoder;
import com.mnilsy.DecoderEncoder.MessageEncoder;
import com.mnilsy.bean.MessageBean;
import com.mnilsy.pojo.MessagePojo;

import javax.servlet.http.HttpSession;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;


/**
 * Created by MNILSY on 2018/11/18.
 */

@ServerEndpoint(value = "/ws/messageSocket", configurator = GetHttpSession.class, decoders = {MessageDecoder.class}, encoders = {MessageEncoder.class})
public class SocketServer {
    private Session session;
    private HttpSession httpSession;

    @OnOpen
    public void open(Session session, EndpointConfig config) {
        this.session = session;
        this.httpSession = (HttpSession) config.getUserProperties().get(HttpSession.class.getName());
        SocketManage.add((String) httpSession.getAttribute("u_Id"), this);
        System.out.println((String) httpSession.getAttribute("u_Id")+"进入");
    }

    @OnClose
    public void close() {
        SocketManage.remove((String) httpSession.getAttribute("u_Id"));
    }

    @OnMessage
    public void message(MessageBean message) {

    }

    @OnError
    public void error(Throwable error) {
        error.printStackTrace();
    }

    public void sendMessage(MessageBean messageBean){
        try {
            session.getBasicRemote().sendObject(messageBean);
        } catch (IOException | EncodeException e) {
            e.printStackTrace();
        }
    }
}
