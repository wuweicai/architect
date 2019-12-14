package com.ysx.architect.test.hutool.JavaBean;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson.JSONArray;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: architect
 * @Package: com.ysx.architect.test.hutool.JavaBean
 * @ClassName: JavaBeanTest
 * @Author: wuweicai
 * @Description:
 * @Date: 2019/12/11 15:29
 * @Version: 1.0
 */
public class JavaBeanTest {
    public static void main(String[] args) throws Exception {
        SubPerson p1 = new SubPerson();
        p1.setSlow(true);
        p1.setName("测试");
        p1.setSubName("sub测试");

        Map<String, Object> map = MapUtil.newHashMap();
        BeanUtil.copyProperties(p1, map);
        Console.log(map);


        HashMap<String, Object> map1 = CollUtil.newHashMap();
        map1.put("Name", "Joe");
        map1.put("aGe", 12);
        map1.put("openId", "DFDFSDFWERWER");
        SubPerson person = BeanUtil.fillBeanWithMapIgnoreCase(map1, new SubPerson(), false);

        // 实现java对象与Json字符串之间的转化

        // 1. Person对象与json之间的转换
        //1.1 将Person对象转成json
        Object obj = JSONArray.toJSON(person);
        String json = obj.toString();
        System.out.println("将Person对象转成json:" + json);
        json = ObjectAndJson.objectToJson(person);
        System.out.println("将Person对象转成json:" + json);

        //1.2 将json字符串转成Person对象
        Person person2 = JSONArray.parseObject(json, Person.class);
        System.out.println("person2.getName():" + person2.getName());

        // 2. 将List<Person>与json之间的转换
        //2.1 将List<Person>转成json
        List<Person> personList = new ArrayList<>();
        Person person3 = new Person();
        person3.setAge(10);
        person3.setName("p3");
        personList.add(person3);
        personList.add(person2);
        Object obj2 = JSONArray.toJSON(personList);
        String json2 = obj2.toString();
        System.out.println("将List<Person>转成json:" + json2);

        // 2.2. 将json字符串转成List<Person>对象
        List<Person> list = JSONArray.parseArray(json2, Person.class);
        System.out.println("list.size():" + list.size());

        // 3. 将Map对象与json之间的转换
        // 3.1 将Map转成json
        Map<String, Person> map2 = new HashMap<>();
        map2.put("1", person2);
        map2.put("2", person3);
        String json3 = ObjectAndJson.objectToJson(map2);
        System.out.println("将Map<String,Person>转成json:" + json3);

        // 3.2. 将json转成Map对象
        Map<String, Object> map3 = JSONArray.parseObject(json3);
        Person person4= ObjectAndJson.jsonToObject(map3.get("1").toString(), Person.class);
        System.out.println("person4.getName():" + person4.getName());

        // 3.2. 将json转成Map对象
        Map<String, Object> map5 = ObjectAndJson.jsonToObject(json3,Map.class);
        Person person5 = JSONArray.parseObject(map5.get("1").toString(), Person.class);
        System.out.println("person5.getName():" + person5.getName());

        //序列化和反序列化
        System.out.println(person5);
        Console.log(ObjectUtil.unserialize(ObjectUtil.serialize(person5)).getClass());

    }
}
