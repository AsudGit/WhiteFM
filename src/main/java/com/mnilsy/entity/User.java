package com.mnilsy.entity;

/**
 * Created by MNILSY on 2018/11/8.
 */
public class User {
    private String u_Name;
    private String u_Sex;
    private int u_Age;
    public User(){}

    public User(String u_Name, String u_Sex, int age) {
        this.u_Name = u_Name;
        this.u_Sex = u_Sex;
        this.u_Age = age;
    }

    public String getU_Name() {
        return u_Name;
    }

    public void setU_Name(String u_Name) {
        this.u_Name = u_Name;
    }

    public String getU_Sex() {
        return u_Sex;
    }

    public void setU_Sex(String u_Sex) {
        this.u_Sex = u_Sex;
    }

    public int getU_Age() {
        return u_Age;
    }

    public void setU_Age(int u_Age) {
        this.u_Age = u_Age;
    }
}
