package com.youngchan.ClassReview.animaltest;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.animaltest
 * @date 2022/11/14 17:25
 * @Description //动物行为接口    接口   默认方法（系统升级时通用方法的创建）  静态方法
 */
public interface AnimalBehavior {
    default void testDefaultMethod(){
        System.out.println("这是默认方法");
    }
    static void staticMethod(){
        System.out.println("这是静态方法");
    }
    void eat();
    String sayOut();
}
