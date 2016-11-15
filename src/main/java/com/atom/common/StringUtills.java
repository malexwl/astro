package com.atom.common;

/**
 * Created by atom on 14.11.16.
 */
public class StringUtills {
    public static final String EMPTY = "";

    private StringUtills() {
    }

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }
}
