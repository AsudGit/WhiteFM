package com.mnilsy.pojo;

import java.io.Serializable;

/**
 * Created by MNILSY on 2018/12/22.
 */
public class UsersPojo implements Serializable{
    private String u_Id;
    private String u_Password;
    private String u_Name;
    private String u_Idcode;
    private String u_Phone;
    private String u_Birthday;
    private String u_Head;
    private String u_Sex;
    private String u_Nickname;
    private boolean u_Stale;
    private String u_Header;

    public UsersPojo() {
    }

    public UsersPojo(String u_Id, String u_Password, String u_Name, String u_Idcode, String u_Phone, String u_Birthday, String u_Head, String u_Sex, String u_Nickname, boolean u_Stale, String u_Header) {
        this.u_Id = u_Id;
        this.u_Password = u_Password;
        this.u_Name = u_Name;
        this.u_Idcode = u_Idcode;
        this.u_Phone = u_Phone;
        this.u_Birthday = u_Birthday;
        this.u_Head = u_Head;
        this.u_Sex = u_Sex;
        this.u_Nickname = u_Nickname;
        this.u_Stale = u_Stale;
        this.u_Header = u_Header;
    }

    public String getU_Header() {
        return u_Header;
    }

    public void setU_Header(String u_Header) {
        this.u_Header = u_Header;
    }

    public String getU_Id() {
        return u_Id;
    }

    public void setU_Id(String u_Id) {
        this.u_Id = u_Id;
    }

    public String getU_Password() {
        return u_Password;
    }

    public void setU_Password(String u_Password) {
        this.u_Password = u_Password;
    }

    public String getU_Name() {
        return u_Name;
    }

    public void setU_Name(String u_Name) {
        this.u_Name = u_Name;
    }

    public String getU_Idcode() {
        return u_Idcode;
    }

    public void setU_Idcode(String u_Idcode) {
        this.u_Idcode = u_Idcode;
    }

    public String getU_Phone() {
        return u_Phone;
    }

    public void setU_Phone(String u_Phone) {
        this.u_Phone = u_Phone;
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

    public boolean isU_Stale() {
        return u_Stale;
    }

    public void setU_Stale(boolean u_Stale) {
        this.u_Stale = u_Stale;
    }
}
