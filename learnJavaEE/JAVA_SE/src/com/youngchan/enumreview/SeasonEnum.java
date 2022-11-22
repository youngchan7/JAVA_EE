package com.youngchan.enumreview;

import java.util.Arrays;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.enumreview
 * @date 2022/11/22 15:25
 * @Description // 枚举类的成员变量 ，枚举类的构造方法使用 实现枚举多信息的存储
 */
public enum SeasonEnum {
    SPRING(new int[] {3, 4, 5}, "春天"), SUMMER(new int[] {6, 7, 8}, "夏天"), AUTUMN(new int[] {9, 10, 11},
        "秋天"), WINTER(new int[] {12, 1, 2}, "冬天");

    private int[] month;
    private String chinaName;

    SeasonEnum(int[] month, String chinaName) {
        this.month = month;
        this.chinaName = chinaName;
    }

    SeasonEnum() {
    }

    public static SeasonEnum getEnumByChinaName(String chinaName) {
        if (chinaName == null) {
            return SeasonEnum.WINTER;
        }
        if (chinaName.equals(SeasonEnum.SPRING.chinaName)) {
            return SeasonEnum.SPRING;
        }
        if (chinaName.equals(SeasonEnum.SUMMER.chinaName)) {
            return SeasonEnum.SUMMER;
        }
        if (chinaName.equals(SeasonEnum.AUTUMN.chinaName)) {
            return SeasonEnum.AUTUMN;
        }
        return SeasonEnum.WINTER;
    }

    public static SeasonEnum getEnumByNum(Integer num) {
        if (num == null || num <= 0 || num > 12)
            return SeasonEnum.WINTER;
        if (Arrays.stream(SeasonEnum.SPRING.month).filter(a->a==num).count()>0) {
            return SeasonEnum.SPRING;
        }
        if (Arrays.stream(SeasonEnum.SUMMER.month).filter(a->a==num).count()>0) {

            return SeasonEnum.SUMMER;
        }
        if (Arrays.stream(SeasonEnum.AUTUMN.month).filter(a->a==num).count()>0) {

            return SeasonEnum.AUTUMN;
        }
        return SeasonEnum.WINTER;
    }

    public int[] getMonth() {
        return month;
    }

    public String getChinaName() {
        return chinaName;
    }
}
