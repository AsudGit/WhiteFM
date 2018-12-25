
package com.mnilsy.DecoderEncoder;

import com.alibaba.fastjson.JSON;
import com.mnilsy.bean.MessageBean;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;


/**
 * Created by MNILSY on 2018/11/18.
 */

public class MessageEncoder implements Encoder.Text<MessageBean> {
    @Override
    public String encode(MessageBean object) throws EncodeException {
        return JSON.toJSONString(object);
    }

    @Override
    public void init(EndpointConfig config) {

    }

    @Override
    public void destroy() {

    }
}

