package com.ysx.architect.common;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * @author zhanghong
 * @Title:
 * @Description: 验证值是否是空
 * @date 2016/10/12
 */
public class ValidationUtil {

    public static boolean equals(Object obj1, Object obj2) {
        if (obj1 == obj2) return true;
        if (obj1 == null || obj2 == null) return false;
        return obj1.equals(obj2);
    }

    public static boolean isNotEmpty(Object object) {
        return !isEmpty(object);
    }

    public static boolean isNotEmpty(Object[] objects) {
        return !isEmpty(objects);
    }

    /**
     * 验证值是否是空
     * @param object 验证值
     * @return 验证值是否是空
     */
    public static boolean isEmpty(Object object) {
        boolean isEmpty = false;

        if (object == null) {
            isEmpty = true;
        }
        //验证字符串类型
        else if (object instanceof String) {
            String validatedObject = (String) object;
            if (validatedObject == null || "".equals(validatedObject.trim())) {
                isEmpty = true;
            }
        }
        // 验证集合类型
        else if (object instanceof Collection) {
            Collection validatedObject = (Collection) object;
            if (validatedObject == null || validatedObject.size() == 0) {
                isEmpty = true;
            }
        }
        // 验证Map类型
        else if (object instanceof Map) {
            Map validatedObject = (Map) object;
            if (validatedObject == null || validatedObject.size() == 0) {
                isEmpty = true;
            }
        }
        // 验证日期类型
        else if (object instanceof Date) {
            Date validatedObject = (Date) object;
            if (validatedObject == null) {
                isEmpty = true;
            }
        }
        // 验证日期类型
        else if (object instanceof Timestamp) {
            Timestamp validatedObject = (Timestamp) object;
            if (validatedObject == null) {
                isEmpty = true;
            }
        }
        // 验证Set类型
        else if (object instanceof Set) {
            Set validatedObject = (Set) object;
            if (validatedObject == null || validatedObject.size() == 0) {
                isEmpty = true;
            }
        }

        return isEmpty;
    }

    /**
     * 验证数组是否为空
     * @param objects 对象数组
     * @return
     */
    public static boolean isEmpty(Object[] objects) {
        boolean isEmpty = false;

        if (objects == null || objects.length == 0) {
            isEmpty = true;
        }

        return isEmpty;
    }
}
