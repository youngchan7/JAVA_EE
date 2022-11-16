package com.youngchan.ClassReview.animaltest;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.animaltest
 * @date 2022/11/14 17:25
 * @Description //TODO
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
