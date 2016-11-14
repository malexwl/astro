package com.atom.bean;

/**
 * Created by atom on 14.11.16.
 */
public class Pair {
    private String key;
    private Object val;

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
