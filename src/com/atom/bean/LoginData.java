package com.atom.bean;

import com.atom.common.StringUtills;

public class LoginData {
    private String uuid = StringUtills.EMPTY;
    private String gid = StringUtills.EMPTY;
    private String token = StringUtills.EMPTY;
    private String key;
    private String eid;

    public LoginData() {
    }

    public LoginData(String uuid, String gid, String token) {
        this.uuid = uuid;
        this.gid = gid;
        this.token = token;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uudi) {
        this.uuid = uuid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }
}
