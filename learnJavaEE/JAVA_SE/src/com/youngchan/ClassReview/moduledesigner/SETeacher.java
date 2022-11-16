package com.youngchan.ClassReview.moduledesigner;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.modledesigner
 * @date 2022/11/16 21:06
 * @Description //TODO
 */
public class SETeacher extends ModleClass{

  @Override
  public void teach() {
    System.out.println("基础班老师讲JavaSE");
  }

  public SETeacher(String name, int age) {
    super(name, age);
  }
}
