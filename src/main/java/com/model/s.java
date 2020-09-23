package com.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class s {
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date s;

    public s() {
    }

    public s(Date s) {
        this.s = s;
    }

    public Date getS() {
        return s;
    }

    public void setS(Date s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "s{" +
                "s=" + s +
                '}';
    }
}
