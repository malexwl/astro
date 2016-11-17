package com.atom.builders;

import com.atom.bean.json.Response;
import com.atom.bean.json.data.Data;
import com.atom.bean.json.data.Data1;
import com.atom.bean.json.data.Data2;
import com.atom.common.RequestType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class ResponseParser {

    public static Response parse(RequestType requestType, String response) {
        Gson gson = null;

        switch (requestType) {
            case READ:
                gson = getGson(new Data1Deserializer());
                break;
            case WAR:
                gson = getGson(new Data2Deserializer());
                break;
        }
        if (gson == null) {
            gson = new Gson();
        }
        return gson.fromJson(response, Response.class);
    }

    private static Gson getGson(DataDeserializer deserializer) {
        return new GsonBuilder().registerTypeAdapter(Response.class, deserializer).create();
    }

    public static abstract class DataDeserializer implements JsonDeserializer<Response> {
        public Response deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Response response = new Gson().fromJson(jsonElement, Response.class);
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (jsonObject.has("data")) {
                JsonElement elem = jsonObject.get("data");
                if (elem != null && !elem.isJsonNull()) {
                    String valueString = elem.toString();
                    Data data = convertDataValue(valueString);
                    response.setData(data);
                }
            }
            return response;
        }

        protected abstract Data convertDataValue(String valueString);
    }

    public static class Data1Deserializer extends DataDeserializer {
        protected Data convertDataValue(String valueString) {
            return new Gson().fromJson(valueString, Data1.class);
        }
    }

    public static class Data2Deserializer extends DataDeserializer {
        protected Data convertDataValue(String valueString) {
            return new Gson().fromJson(valueString, Data2.class);
        }
    }
}
