package com.gdst.util;

/**
 * Created by 我的样子平平无奇 on 2018/12/20.
 */
public class Page {
    private int start=0;
    private int count=5;
    private int last=0;

    public void caculateLast(int total){
        last=total%count==0?(total-count):(total-total%count);
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }
}

