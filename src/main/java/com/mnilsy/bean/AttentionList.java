package com.mnilsy.bean;

import java.io.Serializable;

/**
 * Created by MNILSY on 2018/12/24.
 */
public class AttentionList implements Serializable{
    private String u_Id;
    private String u_Head;
    private String u_Nickname;

    public AttentionList() {
    }

    public AttentionList(String u_Id, String u_Head, String u_Nickname) {
        this.u_Id = u_Id;
        this.u_Head = u_Head;
        this.u_Nickname = u_Nickname;
    }

    public String getU_Id() {
        return u_Id;
    }

    public void setU_Id(String u_Id) {
        this.u_Id = u_Id;
    }

    public String getU_Head() {
        return u_Head;
    }

    public void setU_Head(String u_Head) {
        this.u_Head = u_Head;
    }

    public String getU_Nickname() {
        return u_Nickname;
    }

    public void setU_Nickname(String u_Nickname) {
        this.u_Nickname = u_Nickname;
    }
}
