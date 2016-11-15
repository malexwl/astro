package com.atom.common;

import com.atom.bean.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class NetworkHelper {

    public static final int TIMEOUT = 2000;
    public static final String UTF_8 = "UTF-8";
    public static final int HTTP_OK = 200;


    public static String sendGetRequest(String url) {
        String result = StringUtils.EMPTY;
        try {
            HttpURLConnection con = getHttpURLConnection(url);
            con.setRequestMethod(NameConstants.RQ_GET);

            int responseCode = con.getResponseCode();
            if (responseCode == HTTP_OK) {
                StringBuffer readData = readData(con);
                result = readData.toString();
            }
//            String responseMessage = con.getResponseMessage();
        } catch (IOException e) {
            processException(e);
        }
        return result;
    }

    public static String sendPostRequest(String url, Pair... params) {
        String result = StringUtils.EMPTY;
        try {
            HttpURLConnection con = getHttpURLConnection(url);
            con.setRequestMethod(NameConstants.RQ_POST);
            con.setDoOutput(true);

            StringBuilder postData = new StringBuilder();
            for (Pair param : params) {
                if (postData.length() != 0) {
                    postData.append(NameConstants.P_AND);
                }
                postData.append(URLEncoder.encode(param.getKey(), UTF_8));
                postData.append(NameConstants.P_EQUALS);
                postData.append(URLEncoder.encode(String.valueOf(param.getVal()), UTF_8));
            }

            OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
            writer.write(postData.toString());
            writer.flush();

            int responseCode = con.getResponseCode();
            if (responseCode == HTTP_OK) {
                StringBuffer readData = readData(con);
                result = readData.toString();
            }

        } catch (IOException e) {
            processException(e);
        }
        return result;
    }

    private static HttpURLConnection getHttpURLConnection(String url) throws IOException {
        URL urlObj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
        con.setReadTimeout(TIMEOUT);
        return con;
    }

    private static StringBuffer readData(HttpURLConnection con) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line;
        StringBuffer response = new StringBuffer();

        while ((line = in.readLine()) != null) {
            response.append(line);
        }
        in.close();
        return response;
    }

    private static void processException(Exception exc) {
        if (exc instanceof MalformedURLException) {
            // TODO: 11/15/2016 process incorrect url
        } else if (exc instanceof IOException) {
            // TODO: 11/15/2016 process IO
        }
    }
}
