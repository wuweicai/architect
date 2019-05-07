package com.ysx.architect.test.thread.Common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ConCallable implements Callable {

    private final static Logger logger = LoggerFactory.getLogger(Logger.class);

    private List<String> list;

    @Override
    public Object call() throws Exception {
        List<String> listRe = new ArrayList<>();
        for(int i = 0;i < list.size();i++){
            //含有‘4599’的字符串都返回
            if(list.get(i).contains("4599")){
                listRe.add(list.get(i));
            }
        }
        logger.info("符合条件的返回数据个数为："+listRe.size());
        logger.info("回调函数："+listRe.toString());
        return listRe;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}