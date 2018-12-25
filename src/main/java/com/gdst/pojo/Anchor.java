package com.gdst.pojo;

/**
 * Created by jake on 2018/12/23.
 */
public class Anchor {
     private  int anchor_id;
     private String anchor_name;   //主播名
     private  int attention_num;  //关注数
     private int transpond_num; //转发数
     private  int listener_num;   //听总数
     private  int breachRule_num; //违规数

    public int getAnchor_id() {
        return anchor_id;
    }

    public void setAnchor_id(int anchor_id) {
        this.anchor_id = anchor_id;
    }

    public String getAnchor_name() {
        return anchor_name;
    }

    public void setAnchor_name(String anchor_name) {
        this.anchor_name = anchor_name;
    }



    public int getAttention_num() {
        return attention_num;
    }

    public void setAttention_num(int attention_num) {
        this.attention_num = attention_num;
    }

    public int getTranspond_num() {
        return transpond_num;
    }

    public void setTranspond_num(int transpond_num) {
        this.transpond_num = transpond_num;
    }

    public int getListener_num() {
        return listener_num;
    }

    public void setListener_num(int listener_num) {
        this.listener_num = listener_num;
    }

    public int getBreachRule_num() {
        return breachRule_num;
    }

    public void setBreachRule_num(int breachRule_num) {
        this.breachRule_num = breachRule_num;
    }
}
