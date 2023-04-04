package org.shepherd.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

/**
 * 序列化dubbo返回对象中包含的 class属性
 *
 * @author zhiwei.niu
 */
public class DubboSerializableUtil {

    private static final SimplePropertyPreFilter CLASS_NAME_PRE_FILTER = new SimplePropertyPreFilter(HashMap.class);

    static {
        CLASS_NAME_PRE_FILTER.getExcludes().add("class");
    }


    public static Object serialize(Object object) {
        if (object == null) {
            return StringUtils.EMPTY;
        }
        String serialize = JSON.toJSONString(object, CLASS_NAME_PRE_FILTER, SerializerFeature.WriteMapNullValue);
        return JSON.parseObject(serialize, Object.class);
    }
}
