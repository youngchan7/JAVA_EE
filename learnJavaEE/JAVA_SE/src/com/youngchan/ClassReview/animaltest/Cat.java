package com.youngchan.ClassReview.animaltest;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.animaltest
 * @date 2022/11/14 17:28
 * @Description //TODO
 */
public class Cat extends Animal{
  private String type = "不是猫";
  public Cat( String color, String breed) {
    super("猫", color, breed);
  }

  public Cat() {
  }


  public void catchMouse(){
    System.out.println(sayOut()+"正在逮老鼠....");
  }

  @Override public String getType() {
    return type;
  }

  @Override public void setType(String type) {
    this.type = type;
  }

  @Override
  public void eat() {
    System.out.println(sayOut()+"正在吃鱼.....");
  }
}
