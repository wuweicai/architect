package com.ysx.architect.test.cache.EaCache.startLoadCache;

import com.ysx.architect.test.cache.EaCache.Department;
import com.ysx.architect.test.cache.EaCache.common.EhCacheUtil;
import com.ysx.architect.common.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//如果存在多个实现CommandLineRunner的接口，会按照设置的顺序执行
@Order(value=1)
public class CacheServiceUtil implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CacheServiceUtil.class);

    @Autowired
    private DepartmentServiceNotCache departmentServiceNotCache;

    @Override
    public void run(String... args) throws Exception {
        logger.info("******启动热加载缓存数据");
        //查询数据库的方法，关于springboot整合mybatis的方法参见博客：https://blog.csdn.net/weixin_42315600/article/details/84139404
        List<Department> list= departmentServiceNotCache.selectAll();
        logger.info("******热加载数据查询结果："+list.toArray());
        for(Department department:list) {
            String departmentKey = department.getId();
            logger.info("departmentKey="+departmentKey);
            String departmentValue = department.getDescr();
            logger.info("departmentValue="+departmentValue);
            EhCacheUtil.put(departmentKey, departmentValue);
        }
    }

    /**
     * 获取cache
     * @param key 关键字
     * @return
     */
    public String getJVM(Object key) {
        String value = (String)EhCacheUtil.get(key);
        if (!StringUtil.isNotBlank(value)) {
            logger.info("查询缓存失败，开始从数据查询数据");
            //查询数据库，并放入缓存，此处selectBySwitchKey方法，实现了ehcache，查询接口之后会自动放入ehcache
            //这里是ehcache
            value = departmentServiceNotCache.getDesctById(String.valueOf(key));
            if(!StringUtil.isNotBlank(value)) {
                return null;
            }
            return value;
        }
        return value;
    }

    /**
     * 移除cache
     * @param key
     */
    public void delJVM(String key) {
        EhCacheUtil.remove(key);
    }
}