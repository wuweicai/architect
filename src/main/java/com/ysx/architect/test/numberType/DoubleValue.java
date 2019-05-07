package com.ysx.architect.test.numberType;

import java.math.BigDecimal;

public class DoubleValue {

    public static void main(String[] args) {

        /**
         * 两个都是小数
         */
        Double ad1 = 1.4,bd1=1.3;
        System.out.println(ad1-bd1);
        BigDecimal ab1 = BigDecimal.valueOf(ad1);
        BigDecimal bb1 = BigDecimal.valueOf(bd1);
        System.out.println(ab1.subtract(bb1));

        /**
         * 被减数是整数，减数是小数
         */
        Double ad2 = 2.0,bd2=1.323;
        System.out.println(ad2-bd2);
        BigDecimal ab2 = BigDecimal.valueOf(ad2);
        BigDecimal bb2 = BigDecimal.valueOf(bd2);
        System.out.println(ab2.subtract(bb2));

        /**
         * 减数是整数，被减数是小数
         */
        Double ad3 = 2.3,bd3=1.0;
        System.out.println(ad3-bd3);
        System.out.println(BigDecimal.valueOf(ad3-bd3));
        BigDecimal ab3 = BigDecimal.valueOf(ad3);
        BigDecimal bb3 = BigDecimal.valueOf(bd3);
        System.out.println(ab3.subtract(bb3));

        /**
         * 两个都是整数
         */
        Double ad4 = 2.0,bd4=1.0;
        System.out.println(ad4-bd4);
        BigDecimal ab4 = BigDecimal.valueOf(ad4);
        BigDecimal bb4 = BigDecimal.valueOf(bd4);
        System.out.println(ab4.subtract(bb4));

    }
}
