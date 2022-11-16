package com.youngchan.ClassReview.StaticClass;

public class Son extends Father {

  {
    System.out.println("这是子类构造代码块");
  }

  static {
    System.out.println("初始化子类静态块...");
  }

  public Son() {
    System.out.println("初始化子类构造方法...");
  }

}
