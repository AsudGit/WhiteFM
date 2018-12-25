package com.mnilsy.service;

import com.mnilsy.bean.AttentionList;
import com.mnilsy.pojo.MessagePojo;

import java.util.ArrayList;

/**
 * Created by MNILSY on 2018/12/24.
 */
public interface MessageService {
    boolean sendText();
    ArrayList<AttentionList> getAttention(String u_Id);
    ArrayList<AttentionList> selectAttention(String key, String u_Id);
    String sendMessage(MessagePojo messagePojo);
    String getMessage(String u_Id);
    void read(String m_Sender,String m_Recipient,String m_Time);
}
