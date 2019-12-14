package com.ysx.architect.test.hutool.clone;

import cn.hutool.core.clone.CloneSupport;
import cn.hutool.core.util.ObjectUtil;
import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: architect
 * @Package: com.ysx.architect.test.hutool.clone
 * @ClassName: dog
 * @Author: wuweicai
 * @Description:
 * @Date: 2019/12/11 11:35
 * @Version: 1.0
 */
@Data
public class Dog extends CloneSupport<Dog> implements Serializable{
    private String name = "wangwang";
    private int age = 3;
    private Dog son;

    public static void main(String[] args) throws Exception{
        Dog fatherDog = new Dog();
        Dog sonDog =new Dog();
        Dog grandDog = new Dog();

        fatherDog.setName("fatherDog");
        fatherDog.setAge(3);
        fatherDog.setSon(sonDog);

        sonDog.setName("sonDog");
        sonDog.setAge(2);
        sonDog.setSon(grandDog);

        grandDog.setName("grandDog");
        grandDog.setAge(1);

        /*Dog fatherDogCopy = fatherDog.clone();
        boolean flag1 = fatherDogCopy==fatherDog;
        boolean flag2 = fatherDogCopy.getSon() == sonDog;
        boolean flag3 = fatherDogCopy.getSon().getSon() == grandDog;
        // 比较克隆后的地址
        System.out.println(flag1);// false
        System.out.println(flag2);// true
        System.out.println(flag3);// true*/

        //执行这个方法，类必须需要可以序列化
        Dog fatherDogCopy = ObjectUtil.cloneByStream(fatherDog);
        boolean flag1 = fatherDogCopy==fatherDog;
        boolean flag2 = fatherDogCopy.getSon() == sonDog;
        boolean flag3 = fatherDogCopy.getSon().getSon() == grandDog;
        // 比较克隆后的地址
        System.out.println(flag1);// false
        System.out.println(flag2);// true
        System.out.println(flag3);// true
    }
}