package com.ysx.architect.test.exception;


public class CheckScore {

    // 检查分数合法性的方法check() 如果定义的是运行时异常就不用抛异常了
    public void check(int score) throws Exception {// 抛出自己的异常类
        if (score > 120 || score < 0) {
            // 分数不合法时抛出异常
            //String result = messageSource.getMessage("hello", null, null, null);
            throw new BaseException("分数不合法，分数应该是0--120之间");// new一个自己的异常类
            //throw new BaseException(result);// new一个自己的异常类
        } else {
            System.out.println("分数合法，你的分数是" + score);
        }
    }
}