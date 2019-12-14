package com.ysx.architect.test.hutool.BaseCode;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.lang.Assert;

/**
 * @ProjectName: architect
 * @Package: com.ysx.architect.test.hutool.BaseCode
 * @ClassName: CodeSample
 * @Author: wuweicai
 * @Description:
 * @Date: 2019/12/11 14:08
 * @Version: 1.0
 */
public class CodeSample {
    public static void main(String[] args) throws Exception {
        String a = "伦家是一个非常长的字符串";
        String encode = Base64.encode(a);
       // Assert("5Lym5a625piv5LiA5Liq6Z2e5bi46ZW/55qE5a2X56ym5Liy", encode);
       Boolean isEquals =  encode.equals("5Lym5a625piv5LiA5Liq6Z2e5bi46ZW/55qE5a2X56ym5Liy");

        String decodeStr = Base64.decodeStr(encode);
        //Assert.(a, decodeStr);
        Boolean isEquals1 =  a.equals(decodeStr);
    }
}
