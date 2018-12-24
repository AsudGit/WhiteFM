package com.gdst.pojo;

import java.util.Date;

/**
 * Created by jake on 2018/12/23.
 */
public class AnchorWorks {
    private  int anchor_worksId;
    private  String  works_name;
    private  String works_type;
    private String author;
    private  int anchor_id;
    private  int like_num;
    private String works_cover;
    private Date release_time;
    private  String  works_label;
    private  String  works_describe;
    private  int isBreachRule;
    private  int isCheck;
    private  int modi_num;

    public int getAnchor_worksId() {
        return anchor_worksId;
    }

    public void setAnchor_worksId(int anchor_worksId) {
        this.anchor_worksId = anchor_worksId;
    }

    public String getWorks_name() {
        return works_name;
    }

    public void setWorks_name(String works_name) {
        this.works_name = works_name;
    }

    public String getWorks_type() {
        return works_type;
    }

    public void setWorks_type(String works_type) {
        this.works_type = works_type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAnchor_id() {
        return anchor_id;
    }

    public void setAnchor_id(int anchor_id) {
        this.anchor_id = anchor_id;
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

    public Date getRelease_time() {
        return release_time;
    }

    public void setRelease_time(Date release_time) {
        this.release_time = release_time;
    }

    public String getWorks_label() {
        return works_label;
    }

    public void setWorks_label(String works_label) {
        this.works_label = works_label;
    }

    public String getWorks_describe() {
        return works_describe;
    }

    public void setWorks_describe(String works_describe) {
        this.works_describe = works_describe;
    }

    public int getIsBreachRule() {
        return isBreachRule;
    }

    public void setIsBreachRule(int isBreachRule) {
        this.isBreachRule = isBreachRule;
    }

    public int getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(int isCheck) {
        this.isCheck = isCheck;
    }

    public int getModi_num() {
        return modi_num;
    }

    public void setModi_num(int modi_num) {
        this.modi_num = modi_num;
    }
}
