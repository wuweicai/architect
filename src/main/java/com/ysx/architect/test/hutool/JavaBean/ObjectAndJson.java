package com.ysx.architect.test.hutool.JavaBean;

import com.alibaba.fastjson.JSONArray;

/**
 * @ProjectName: architect
 * @Package: com.ysx.architect.test.hutool.JavaBean
 * @ClassName: ObjectAndJson
 * @Author: wuweicai
 * @Description:
 * @Date: 2019/12/11 15:55
 * @Version: 1.0
 */
public class ObjectAndJson<T> {
    private static final long serialVersionUID = 4893280118017319080L;

    //Object to json
    public static <T> String objectToJson(T object){
        Object obj = JSONArray.toJSON(object);
        String json = obj.toString();
        return json;
    }

    public static <T> T jsonToObject(String json,Class<T> object){
         T result = JSONArray.parseObject(json,object);
         return result;
    }
}
