package com.youngchan.logandtest;

import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.logandtest
 * @date 2022/11/22 15:03
 * @Description // 单元测试  和日志打印
 */
public class TestAndLog4jRun {
    private static Logger logger = LoggerFactory.getLogger(TestAndLog4jRun.class);

    @BeforeClass
    public static  void runTestBeforeClass(){
        System.out.println("static单元测试before");
        logger.info("测试单元{}测试","类执行前");
    }
    @Before
    public void runTestBefore(){
        System.out.println("单元测试before");
        logger.debug("测试单元{}测试","方法执行前");
    }
    @Test
    public void runTest(){
        System.out.println("单元测试Test");
        logger.info("测试单元测试");
    }
    @After
    public void runTestAfter(){
        System.out.println("单元测试After");
        logger.error("测试单元{}测试","方法执行后");
    }
    @AfterClass
    public static void runTestAfterClass(){
        System.out.println("static单元测试After");
        logger.warn("测试单元{}测试","类执行后");
    }
}
