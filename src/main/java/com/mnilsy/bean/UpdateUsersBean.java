package com.mnilsy.bean;

import java.io.Serializable;

/**
 * Created by MNILSY on 2018/12/22.
 */
public class UpdateUsersBean implements Serializable{
    private String u_Birthday;
    private String u_Head;
    private String u_Sex;
    private String u_Nickname;

    public UpdateUsersBean() {
    }

    public UpdateUsersBean(String u_Birthday, String u_Head, String u_Sex, String u_Nickname) {
        this.u_Birthday = u_Birthday;
        this.u_Head = u_Head;
        this.u_Sex = u_Sex;
        this.u_Nickname = u_Nickname;
    }

    public String getU_Birthday() {
        return u_Birthday;
    }

    public void setU_Birthday(String u_Birthday) {
        this.u_Birthday = u_Birthday;
    }

    public String getU_Head() {
        return u_Head;
    }

    public void setU_Head(String u_Head) {
        this.u_Head = u_Head;
    }

    public String getU_Sex() {
        return u_Sex;
    }

    public void setU_Sex(String u_Sex) {
        this.u_Sex = u_Sex;
    }

    public String getU_Nickname() {
        return u_Nickname;
    }

    public void setU_Nickname(String u_Nickname) {
        this.u_Nickname = u_Nickname;
    }
}
