package com.atom.common;

import com.atom.bean.Pair;

import java.util.Date;

public class Helper {
    private Helper() {
    }

    public static String getTimeXXX() {
        long time = new Date().getTime() / 1000;
        return time + StringUtils.EMPTY;
    }

    public static String generateUrl(String startUrl, Pair... params) {
        String result = startUrl;
        if (isEmpty(params)) {
            StringBuilder sb = new StringBuilder(startUrl);
            boolean first = true;
            for (Pair param : params) {
                if (first) {
                    sb.append(NameConstants.P_QUESTION);
                    first = false;
                } else {
                    sb.append(NameConstants.P_AND);
                }
                sb.append(param.getKey());
                sb.append(NameConstants.P_EQUALS);
                sb.append(param.getVal());
            }
            result = sb.toString();
        }
        return result;
    }

    public static boolean isEmpty(Object[] data) {
        return data == null || data.length == 0;
    }

    public static boolean isNotEmpty(Object[] data) {
        return !isEmpty(data);
    }
}
