package com.youngchan.ClassReview.animaltest;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.animaltest
 * @date 2022/11/14 17:33
 * @Description //TODO
 */
public class Dog extends Animal{

  public Dog( String color, String breed) {
    super("犬", color, breed);
  }

  @Override
  public void eat() {
    System.out.println(sayOut()+"正在啃骨头.....");
  }
  public void catchMouse(){
    System.out.println(sayOut()+"正在看家.....");
  }
}
