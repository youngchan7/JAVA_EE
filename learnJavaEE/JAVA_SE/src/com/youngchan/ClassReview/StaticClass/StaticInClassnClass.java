package com.youngchan.ClassReview.StaticClass;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.StaticClass
 * @date 2022/11/16 16:00
 * @Description //内部类 可以直接使用外部类的成员变量和成员方法
 * 如果是静态内部类 可以直接使用外部的静态变量和静态方法
 */
public class StaticInClassnClass {

  public static class InnerClass {

    public static int iStatic;
    public int iNomal;

    void nomalMethod() {
      System.out.println(iStatic);
      System.out.println(iNomal);

      System.out.println("============= 我是一个内部类'InnerClass的正常方法' =============");
    }

    static void staticMethod() {
      System.out.println(iStatic);
      System.out.println("============= 我是一个内部类'InnerClass的静态方法' =============");
    }
  }
}
