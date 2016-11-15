package com.atom.common;

public class StringUtils {
    public static final String EMPTY = "";

    private StringUtils() {
    }

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }
}
