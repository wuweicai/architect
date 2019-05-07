package com.ysx.architect;

import com.ysx.architect.test.exception.SelfException;
import com.ysx.architect.test.properties.TestProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ArchitectApplicationTests {

    @Autowired
    private  TestProperties testProperties;

    /*@Value("${poolSize}")
    private  String poolSize;*/

    @Value("${maxThreadAmount}")
    private  String maxThreadAmount;


    private final static Logger LOG = LoggerFactory.getLogger(ArchitectApplicationTests.class);

    @Test
    public void contextLoads() {
    }

    //测试日志配置--增加行号
    @Test
    public void testLog(){
        LOG.info("testLog-test测试");
    }

    //测试读取缺省属性配置
    @Test
    public void testReadDefaultProperties() {


        System.out.println("maxThreadAmount：" + maxThreadAmount);
        //System.out.println("poolSize：" + poolSize);
    }

    //测试读取自定义属性配置
    @Test
    public void testReadSelfProperties() {


        System.out.println("FRONT_TRANS_URL：" + testProperties.getBACK_TRANS_URL());
        //System.out.println("poolSize：" + poolSize);
    }

    @Test
    public void testSelfException() throws Exception{
        throw new SelfException("自定义测试异常");
    }

}
