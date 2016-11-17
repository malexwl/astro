package com.atom.bean.json;

import com.atom.bean.json.data.Data;

public class Response {

    private Integer r;
    private String rc;
    private String err;
    private Info info;
    private transient Data data;

    public Integer getR() {
        return r;
    }

    public String getRc() {
        return rc;
    }

    public String getErr() {
        return err;
    }

    public Info getInfo() {
        return info;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
