package com.mnilsy.socket;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;

/**
 * Created by MNILSY on 2018/11/18.
 */
public class GetHttpSession extends ServerEndpointConfig.Configurator {
    @Override
    public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
        super.modifyHandshake(sec, request, response);
        sec.getUserProperties().put(HttpSession.class.getName(), request.getHttpSession());
    }
}
