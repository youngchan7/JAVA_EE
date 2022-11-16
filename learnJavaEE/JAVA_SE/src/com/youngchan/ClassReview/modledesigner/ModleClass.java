package com.youngchan.ClassReview.modledesigner;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.ModleDesigner
 * @date 2022/11/16 21:04
 * @Description //TODO
 */
public abstract class ModleClass {
  private String name;
  private int age;
  public abstract void teach();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public ModleClass(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public ModleClass() {
  }
}
