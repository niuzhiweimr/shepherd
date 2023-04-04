package org.shepherd.common.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

/**
 * @author niuzhiwei
 */
@Slf4j
public class JSONUtil {

    private final static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
    }

    public static <T> T toObject(String jsonStr, Class<T> classType) {

        if (StringUtils.isEmpty(jsonStr)) {
            throw new RuntimeException("Json string is empty");
        }

        try {
            return mapper.readValue(jsonStr, classType);
        } catch (IOException e) {
            log.error("json to entity error.", e);
            throw new RuntimeException(e);
        }
    }

    public static String toJson(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        try {
            return mapper.writeValueAsString(obj);
        } catch (IOException e) {
            log.error("obj to json error.", e);
            throw new RuntimeException(e);
        }
    }

    public static String toJsonWithFormat(Object obj) {
        if (obj == null) {
            throw new RuntimeException("object is empty");
        }

        if (obj instanceof String) {
            return (String) obj;
        }

        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (IOException e) {
            log.error("obj to json error.", e);
            throw new RuntimeException(e);
        }
    }
}
