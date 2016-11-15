package com.atom.bean.json.login;

import java.util.List;

public class ServersData {
    private String key;
    private List<Server> server_list;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Server> getServer_list() {
        return server_list;
    }

    public void setServer_list(List<Server> server_list) {
        this.server_list = server_list;
    }
}
