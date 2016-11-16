package com.atom.common;

import com.atom.bean.Pair;

import java.util.Date;
import java.util.List;

public class Helper {
    private Helper() {
    }

    public static String getTimeXXX() {
        long time = new Date().getTime() / 1000;
        return time + StringUtils.EMPTY;
    }

    public static String generateUrl(String startUrl, Pair... params) {
        String result = startUrl;
        if (isNotEmpty(params)) {
            StringBuilder sb = new StringBuilder(result);
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

    public static String generateUrl(String startUrl, List<Pair> params) {
        Pair[] paramsArray = null;
        if (isNotEmpty(params)) {
            paramsArray = new Pair[params.size()];
            paramsArray = params.toArray(paramsArray);
        }
        return generateUrl(startUrl, paramsArray);
    }

    public static boolean isEmpty(Object[] data) {
        return data == null || data.length == 0;
    }

    public static boolean isNotEmpty(Object[] data) {
        return !isEmpty(data);
    }

    public static boolean isEmpty(List data) {
        return data == null || data.size() == 0;
    }

    public static boolean isNotEmpty(List data) {
        return !isEmpty(data);
    }
}
