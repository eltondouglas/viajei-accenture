package com.accenture.gama.viajei.configurations;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import springfox.documentation.spring.web.json.Json;

public class SpringfoxJsonToGsonAdapter implements JsonSerializer<Json> {

    @Override
    public JsonElement serialize(Json src, Type typeOfSrc, JsonSerializationContext context) {
        return JsonParser.parseString(src.value()).getAsJsonObject();
    }
} 
