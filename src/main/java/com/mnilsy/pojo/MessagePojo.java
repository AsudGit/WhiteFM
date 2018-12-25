package com.mnilsy.pojo;


import java.io.Serializable;

/**
 * Created by MNILSY on 2018/12/22.
 */
public class MessagePojo implements Serializable{
    private String m_Recipient;
    private String m_Sender;
    private String m_Context;
    private String m_Time;
    private int m_Isread;

    public MessagePojo() {
    }

    public MessagePojo(String m_Recipient, String m_Sender, String m_Context, String m_Time, int m_Isread) {
        this.m_Recipient = m_Recipient;
        this.m_Sender = m_Sender;
        this.m_Context = m_Context;
        this.m_Time = m_Time;
        this.m_Isread = m_Isread;
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

    public int getM_Isread() {
        return m_Isread;
    }

    public void setM_Isread(int m_Isread) {
        this.m_Isread = m_Isread;
    }
}