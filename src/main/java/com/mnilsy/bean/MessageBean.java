package com.mnilsy.bean;


import com.mnilsy.pojo.MessagePojo;

import java.io.Serializable;

/**
 * Created by MNILSY on 2018/12/25.
 */
public class MessageBean implements Serializable{
    private String m_Recipient;
    private String m_Sender;
    private String m_Context;
    private String m_Time;
    private int m_Isread;
    private String u_Head;
    private String u_Nickname;

    public MessageBean() {
    }

    public MessageBean(String u_Head,String u_Nickname, MessagePojo messagePojo) {
        this.m_Recipient = messagePojo.getM_Recipient();
        this.m_Sender = messagePojo.getM_Sender();
        this.m_Context = messagePojo.getM_Context();
        this.m_Time = messagePojo.getM_Time();
        this.u_Head = u_Head;
        this.u_Nickname = u_Nickname;
        this.m_Isread = messagePojo.getM_Isread();
    }
    public MessageBean(String m_Recipient, String m_Sender, String m_Context, String m_Time, int m_Isread) {
        this.m_Recipient = m_Recipient;
        this.m_Sender = m_Sender;
        this.m_Context = m_Context;
        this.m_Time = m_Time;
        this.m_Isread = m_Isread;
    }

    public MessageBean(String m_Recipient, String m_Sender, String m_Context, String m_Time, String u_Head,String u_Nickname, int m_Isread) {
        this.m_Recipient = m_Recipient;
        this.m_Sender = m_Sender;
        this.m_Context = m_Context;
        this.m_Time = m_Time;
        this.u_Head = u_Head;
        this.u_Nickname = u_Nickname;
        this.m_Isread = m_Isread;
    }

    public String getU_Nickname() {
        return u_Nickname;
    }

    public void setU_Nickname(String u_Nickname) {
        this.u_Nickname = u_Nickname;
    }

    public String getM_Recipient() {
        return m_Recipient;
    }

    public void setM_Recipient(String m_Recipient) {
        this.m_Recipient = m_Recipient;
    }

    public String getM_Sender() {
        return m_Sender;
    }

    public void setM_Sender(String m_Sender) {
        this.m_Sender = m_Sender;
    }

    public String getM_Context() {
        return m_Context;
    }

    public void setM_Context(String m_Context) {
        this.m_Context = m_Context;
    }

    public String getM_Time() {
        return m_Time;
    }

    public void setM_Time(String m_Time) {
        this.m_Time = m_Time;
    }

    public String getU_Head() {
        return u_Head;
    }

    public void setU_Head(String u_Head) {
        this.u_Head = u_Head;
    }

    public int getM_Isread() {
        return m_Isread;
    }

    public void setM_Isread(int m_Isread) {
        this.m_Isread = m_Isread;
    }
}
