package com.youngchan.management.domain;

import java.io.Serializable;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.management.domain
 * @date 2022/11/16 18:30
 * @Description //TODO
 */
public class Person implements Serializable {
  private static final long serialVersionUID = 1L;
  private String name ;

  private String gender;
  private transient double height;
  private double weight;
  private int age;


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

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override public String toString() {
    return "Person{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + ", height=" + height + ", weight="
        + weight + ", age=" + age + '}';
  }
}
