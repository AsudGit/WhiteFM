package com.mnilsy.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.mnilsy.bean.AttentionList;
import com.mnilsy.bean.MessageBean;
import com.mnilsy.dao.MessageMapper;
import com.mnilsy.pojo.MessagePojo;
import com.mnilsy.service.MessageService;
import com.mnilsy.socket.SocketManage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by MNILSY on 2018/12/24.
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService {
    @Resource(name = "messageMapper")
    private MessageMapper messageMapper;

    @Override
    public boolean sendText() {
        return false;
    }

    @Override
    public ArrayList<AttentionList> getAttention(String u_Id) {
        //获取关注的人
        ArrayList<AttentionList> list = messageMapper.getAttention(u_Id);
        return list;
    }

    @Override
    public ArrayList<AttentionList> selectAttention(String key, String u_Id) {
        ArrayList<AttentionList> list;
        if (key.matches("^@.*$")) {
            key = key.substring(1);
            list = messageMapper.selectAttention_all(key);
            return list;
        } else {
            list = messageMapper.selectAttention_attention(u_Id, key);
            return list;
        }
    }

    @Override
    public String sendMessage(MessagePojo messagePojo) {
        int i = messageMapper.putMessage(messagePojo);
        if (i != 1) {
            return "500";
        }
        if (!SocketManage.isOnline(messagePojo.getM_Recipient())){
            return "200";
        }
        //待改，昵称
        MessageBean messageBean=new MessageBean(messageMapper.getHead(messagePojo.getM_Sender()),null,messagePojo);
        SocketManage.sendMessage(messageBean);
        return "200";
    }

    @Override
    public String getMessage(String u_Id) {
        ArrayList<MessageBean> list=messageMapper.getMessage(u_Id);
        if (list==null)return null;
        return JSON.toJSONString(list);
    }

    @Override
    public void read(String m_Sender, String m_Recipient, String m_Time) {
        messageMapper.read(m_Sender,m_Recipient,m_Time);
    }
}
