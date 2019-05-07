package com.ysx.architect.test.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

// 绑定配置项的前缀
@Configuration
@ConfigurationProperties(prefix = "test")
// 添加自定义配置文件
@PropertySource(value = "classpath:selfProperties/test.properties")
public class TestProperties {
    // 由于 Spring 不允许把值注入到静态变量中所以这里使用 @Value 是不起效果的
    /**
     * 配置文件中的前台URL常量
     */
    public String FRONT_TRANS_URL;
    /**
     * 配置文件中的后台URL常量
     */
    public String BACK_TRANS_URL;

    // 手动定义一个静态的 PropertySourcesPlaceholderConfigurer。
    // 它的作用是解析 @Value 中的 ${} ，如果没有这个 bean ，将取不到配置项的值。
    /*@Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigures() {
        return new PropertySourcesPlaceholderConfigurer();
    }*/

    // 注入配置项的值
    public String getFRONT_TRANS_URL() {
        return FRONT_TRANS_URL;
    }

    public void setFRONT_TRANS_URL(String FRONT_TRANS_URL) {
        this.FRONT_TRANS_URL = FRONT_TRANS_URL;
    }

    public String getBACK_TRANS_URL() {
        return BACK_TRANS_URL;
    }

    public void setBACK_TRANS_URL(String BACK_TRANS_URL) {
        this.BACK_TRANS_URL = BACK_TRANS_URL;
    }
}
