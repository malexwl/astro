package com.atom.bean;

public class Pair {
    private final String key;
    private final Object val;

    public Pair(String key, Object val) {
        this.key = key;
        this.val = val;
    }

    public String getKey() {
        return key;
    }

    public Object getVal() {
        return val;
    }
}
