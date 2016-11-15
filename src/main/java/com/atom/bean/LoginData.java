package com.atom.bean;

import com.atom.common.StringUtils;

public class LoginData {
    private String uuid = StringUtils.EMPTY;
    private String gid = StringUtils.EMPTY;
    private String token = StringUtils.EMPTY;
    private String key;
    private String eid;

    public LoginData(String uuid, String gid, String token) {
        this.uuid = uuid;
        this.gid = gid;
        this.token = token;
    }

    public String getUuid() {
        return uuid;
    }

    public String getGid() {
        return gid;
    }

    public String getToken() {
        return token;
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
