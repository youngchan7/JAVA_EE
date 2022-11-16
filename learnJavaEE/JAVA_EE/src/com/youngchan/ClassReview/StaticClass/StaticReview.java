package com.youngchan.ClassReview.StaticClass;

import com.youngchan.ClassReview.StaticClass.StaticInClassnClass.InnerClass;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.StaticClass
 * @date 2022/11/16 15:41
 * @Description //TODO
 */
public class StaticReview {



  public static void main(String[] args) {
//    静态代码块 和静态成员变量 只执行一次
//    System.out.println(Father.i);
//    Father. speak();
//    Father a = new Son();
//    a.speak1();
    new InnerClass().iNomal = 10;
    InnerClass.iStatic = 20;
    new StaticInClassnClass.InnerClass().nomalMethod();
    InnerClass.staticMethod();
  }

}
