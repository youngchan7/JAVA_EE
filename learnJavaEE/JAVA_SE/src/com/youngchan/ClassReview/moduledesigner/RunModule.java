package com.youngchan.ClassReview.moduledesigner;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.modledesigner
 * @date 2022/11/16 21:12
 * @Description //TODO
 */
public class RunModule {

  public static void main(String[] args) {
    ModleClass ee = new EETeacher("李四",27);
    System.out.println(ee.getName()+ee.getAge());
    ee.teach();
    ModleClass se = new SETeacher("张三",28);
    System.out.println(se.getName()+se.getAge());
    se.teach();
  }
}
