package com.youngchan.ClassReview.moduledesigner;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.modledesigner
 * @date 2022/11/16 21:06
 * @Description //TODO
 */
public class EETeacher extends ModleClass{

  @Override
  public void teach() {
    System.out.println("基础班老师讲JavaEE");
  }

  public EETeacher(String name, int age) {
    super(name, age);
  }

}
