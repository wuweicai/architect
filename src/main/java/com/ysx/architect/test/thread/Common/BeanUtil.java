package com.ysx.architect.test.thread.Common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoader;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.*;

public class BeanUtil {
    private static ApplicationContext ctx = null;
    private static Object lockObject = new Object();
    public static volatile boolean beanUtilSystemFinishInit = false;

    public BeanUtil() {
    }

    /*public static Object getBean(String beanId) {
        if (ctx == null) {
            Object var1 = lockObject;
            synchronized(lockObject) {
                if (ctx == null) {
                    ContextLoader contextLoader = StartListener.getContextLoader();
                    if (contextLoader == null) {
                        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
                    } else {
                        ctx = ContextLoader.getCurrentWebApplicationContext();
                    }

                    if (contextLoader == null) {
                        beanUtilSystemFinishInit = true;
                    } else if (StartListener.systemFinishInit) {
                        beanUtilSystemFinishInit = true;
                    }
                }
            }
        }

        if (!beanUtilSystemFinishInit && StartListener.systemFinishInit) {
            beanUtilSystemFinishInit = true;
        }

        return ctx.getBean(beanId);
    }

    public static <T> T getBean(Class<T> clazz) throws Exception {
        String className = clazz.getSimpleName();

        try {
            return getBean(className);
        } catch (Exception var5) {
            try {
                className = ("" + className.charAt(0)).toLowerCase() + className.substring(1);
                return getBean(className);
            } catch (Exception var4) {
                throw var5;
            }
        }
    }*//*

    public static String getProjectAbsRootPath() {
        URL thisFilePath = BeanUtil.class.getResource("");
        Package thisPackage = BeanUtil.class.getPackage();
        String packageUrl = thisPackage.getName();
        packageUrl = packageUrl.replaceAll("\\.", "/");
        String absRoot = thisFilePath.getPath().substring(0, thisFilePath.getPath().indexOf(packageUrl));
        absRoot = absRoot.substring(1);
        return absRoot;
    }

    public static Map<String, Object> bean2Map(Object bean) throws Exception {
        Map<String, Object> mapObjects = new HashMap();
        Field[] beanFields = ClassRefUtil.getFields(bean.getClass());
        Field[] arr$ = beanFields;
        int len$ = beanFields.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            Field field = arr$[i$];
            if (!"serialVersionUID".equals(field.getName()) && !"__".startsWith(field.getName())) {
                if (!field.getType().getName().equals(List.class.getName())) {
                    Object value = ClassRefUtil.getFieldValue(bean, field.getName());
                    mapObjects.put(field.getName(), value);
                } else {
                    List<Object> listValues = (List)ClassRefUtil.getFieldValue(bean, field.getName());
                    List<Map<String, Object>> _list = new ArrayList();
                    if (listValues != null && listValues.size() > 0) {
                        Iterator i$ = listValues.iterator();

                        while(i$.hasNext()) {
                            Object object = i$.next();
                            Map<String, Object> _mapListObjects = bean2Map(object);
                            _list.add(_mapListObjects);
                        }
                    }

                    mapObjects.put(field.getName(), _list);
                }
            }
        }

        return mapObjects;
    }

    public static String getAppConfig(String entryKey) {
        return (String)ApplicationConfigUtil.getMapConfig().get(entryKey);
    }

    public static String getApplicationName() {
        return (String)ApplicationConfigUtil.getMapConfig().get("applicationName");
    }

    public static String serializableObjectOutBase64(Object object) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream obs = new ObjectOutputStream(out);
        obs.writeObject(object);
        obs.close();
        String base64str = new String(Base64.encode(out.toByteArray()));
        return base64str;
    }

    public static Object unserializableObjectInBase64(String string) throws Exception {
        byte[] bytes = Base64.decode(string);
        ByteArrayInputStream ios = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(ios);
        Object object = ois.readObject();
        ois.close();
        return object;
    }*/
}
