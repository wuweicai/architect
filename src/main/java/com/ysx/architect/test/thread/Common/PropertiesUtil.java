package com.ysx.architect.test.thread.Common;

import com.ysx.architect.common.StringUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertiesUtil extends PropertyPlaceholderConfigurer {
    private static Map<String, String> propertiesMap;
    private int springSystemPropertiesMode = 1;

    public PropertiesUtil() {
    }

    public void setSystemPropertiesMode(int systemPropertiesMode) {
        super.setSystemPropertiesMode(systemPropertiesMode);
        this.springSystemPropertiesMode = systemPropertiesMode;
    }

    protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props) throws BeansException {
        super.processProperties(beanFactory, props);
        propertiesMap = new HashMap();
        Iterator i$ = props.keySet().iterator();

        while(i$.hasNext()) {
            Object key = i$.next();
            String keyStr = key.toString();
            String valueStr = this.resolvePlaceholder(keyStr, props, this.springSystemPropertiesMode);
            propertiesMap.put(keyStr, valueStr);
        }

    }

    public static String getProperty(String name) {
        String property = (String)propertiesMap.get(name);
        return StringUtil.isNotNullOrBlock(property) ? property.trim() : property;
    }

    public static String getContentByName(String keyname) {
        return getProperty(keyname);
    }
}
