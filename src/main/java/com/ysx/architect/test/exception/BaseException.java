package com.ysx.architect.test.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseException extends Exception {

    private static final long serialVersionUID = 1L;
    private final static Logger LOG = LoggerFactory.getLogger(BaseException.class);

    // 提供无参数的构造方法
    public BaseException() {
    }

    // 提供一个有参数的构造方法，可自动生成
    public BaseException(String message) {
        super(message);// 把参数传递给Throwable的带String参数的构造方法

        //LOG.info(message);
    }

}