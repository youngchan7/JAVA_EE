package com.youngchan.ClassReview.finnal;

import java.util.Scanner;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview
 * @date 2022/11/16 19:51
 * @Description // finnal 修饰的变量只能赋值一次  finnal修饰的类 不能被继承  finnal修饰的方法不能被重写
 */
public class FinalTest {
  public static final String animal = "cat";
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
     final String fString ;
    System.out.println("输入字符串");
    fString = sc.nextLine();
    System.out.println("输入字符串");

  }
}
