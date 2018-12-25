
package com.mnilsy.DecoderEncoder;

import com.alibaba.fastjson.JSON;
import com.mnilsy.bean.MessageBean;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;


/**
 * Created by MNILSY on 2018/11/18.
 */

public class MessageDecoder implements Decoder.Text<MessageBean> {
    @Override
    public MessageBean decode(String s) throws DecodeException {
        return JSON.parseObject(s, MessageBean.class);
    }

    @Override
    public boolean willDecode(String s) {
        return true;
    }

    @Override
    public void init(EndpointConfig config) {

    }

    @Override
    public void destroy() {

    }
}

