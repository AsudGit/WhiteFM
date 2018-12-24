package com.gdst.pojo;

import java.util.Date;

/**
 * Created by jake on 2018/12/23.
 */
public class Offical_works {
    private int works_id;
    private  String works_name;
    private   String works_author;
    private  String works_path;
    private   int   like_num;     //喜欢数
    private    String works_cover;   //封面
    private     String works_label; //作品标签
    private Date  release_time;  //发布时间
    private int  listen_num;


    public int getWorks_id() {
        return works_id;
    }

    public void setWorks_id(int works_id) {
        this.works_id = works_id;
    }

    public String getWorks_name() {
        return works_name;
    }

    public void setWorks_name(String works_name) {
        this.works_name = works_name;
    }

    public String getWorks_path() {
        return works_path;
    }

    public void setWorks_path(String works_path) {
        this.works_path = works_path;
    }

    public String getWorks_author() {
        return works_author;
    }

    public void setWorks_author(String works_author) {
        this.works_author = works_author;
    }

    public int getLike_num() {
        return like_num;
    }

    public void setLike_num(int like_num) {
        this.like_num = like_num;
    }

    public String getWorks_cover() {
        return works_cover;
    }

    public void setWorks_cover(String works_cover) {
        this.works_cover = works_cover;
    }

    public String getWorks_label() {
        return works_label;
    }

    public void setWorks_label(String works_label) {
        this.works_label = works_label;
    }

    public Date getRelease_time() {
        return release_time;
    }

    public void setRelease_time(Date release_time) {
        this.release_time = release_time;
    }

    public int getListen_num() {
        return listen_num;
    }

    public void setListen_num(int listen_num) {
        this.listen_num = listen_num;
    }


}
