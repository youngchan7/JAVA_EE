package com.youngchan.ClassReview.StaticClass;

public class Father {

  {
    System.out.println("这是父类构造代码块");
  }



  static int i = 10;//先加载
  static {
    System.out.println("static 静态成员变量 i的值为：" + i);
    System.out.println("初始化父类的静态块...");
  }//后加载

  public Father() {
    System.out.println("初始化父类的构造方法...");
  }

  public static void speak() {
    System.out.println("静态方法...");
  }

  public void speak1() {
    System.out.println("普通方法...");
  }
}