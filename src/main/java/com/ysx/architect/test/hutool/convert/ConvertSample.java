package com.ysx.architect.test.hutool.convert;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.CharsetUtil;

/**
 * @ProjectName: architect
 * @Package: com.ysx.architect.test.hutool.convert
 * @ClassName: ConvertSample
 * @Author: wuweicai
 * @Description:
 * @Date: 2019/12/11 13:31
 * @Version: 1.0
 */
public class ConvertSample {

    public static void main(String[] args) throws Exception {
        int a = 1;
        //aStr为"1"
        String aStr = Convert.toStr(a);
        String sStr1 = Convert.convert(String.class,a);

        System.out.println("aStr "+aStr);
        System.out.println("sStr1 "+sStr1);
        long[] b = {1, 2, 3, 4, 5};
        //bStr为："[1, 2, 3, 4, 5]"
        String bStr = Convert.toStr(b);

        String a1 = "我是一个小小的可爱的字符串";

        //结果："e68891e698afe4b880e4b8aae5b08fe5b08fe79a84e58fafe788b1e79a84e5ad97e7aca6e4b8b2"
        String hex = Convert.toHex(a1, CharsetUtil.CHARSET_UTF_8);
        System.out.println("hex "+hex);

        String a2 = "我是一个小小的可爱的字符串";

        //结果为："\\u6211\\u662f\\u4e00\\u4e2a\\u5c0f\\u5c0f\\u7684\\u53ef\\u7231\\u7684\\u5b57\\u7b26\\u4e32"
        String unicode = Convert.strToUnicode(a2);
        System.out.println("unicode "+unicode);
       //结果为："我是一个小小的可爱的字符串"
        String raw = Convert.unicodeToStr(unicode);
        System.out.println("raw "+raw);

        double a3 = 67556.32;

        //结果为："陆万柒仟伍佰伍拾陆元叁角贰分"
        String digitUppercase = Convert.digitToChinese(a3);
        System.out.println("digitUppercase "+digitUppercase);
    }
}
