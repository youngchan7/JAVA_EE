package com.youngchan.enumreview;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.enumreview
 * @date 2022/11/22 15:19
 * @Description //枚举方法的调用
 */
public class ClassEnumRun {
    private static Logger log=  LoggerFactory.getLogger(ClassEnumRun.class);
    @Test
    public void enumUse(){
        log.info(SeasonEnum.SPRING.toString());
        log.info(SeasonEnum.SUMMER.toString());
        log.info(SeasonEnum.AUTUMN.toString());
        log.info(SeasonEnum.WINTER.toString());
        log.debug(SeasonEnum.SPRING.getChinaName());
        log.debug(SeasonEnum.SUMMER.getChinaName());
        log.debug(SeasonEnum.AUTUMN.getChinaName());
        log.debug(SeasonEnum.WINTER.getChinaName());
        for (int i : SeasonEnum.SPRING.getMonth()) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : SeasonEnum.SUMMER.getMonth()) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : SeasonEnum.AUTUMN.getMonth()) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : SeasonEnum.WINTER.getMonth()) {
            System.out.print(i);
        }
        System.out.println();

        log.debug(SeasonEnum.getEnumByChinaName("春天").toString());
        log.debug(SeasonEnum.getEnumByChinaName("夏天").toString());
        log.debug(SeasonEnum.getEnumByChinaName("秋天").toString());
        log.debug(SeasonEnum.getEnumByChinaName("冬天").toString());
        log.info(SeasonEnum.getEnumByNum(1).toString());
        log.info(SeasonEnum.getEnumByNum(2).toString());
        log.info(SeasonEnum.getEnumByNum(3).toString());
        log.info(SeasonEnum.getEnumByNum(4).toString());
        log.info(SeasonEnum.getEnumByNum(5).toString());
        log.info(SeasonEnum.getEnumByNum(6).toString());
        log.info(SeasonEnum.getEnumByNum(7).toString());
        log.info(SeasonEnum.getEnumByNum(8).toString());
        log.info(SeasonEnum.getEnumByNum(9).toString());
        log.info(SeasonEnum.getEnumByNum(10).toString());
        log.info(SeasonEnum.getEnumByNum(11).toString());
        log.info(SeasonEnum.getEnumByNum(12).toString());

    }
}
