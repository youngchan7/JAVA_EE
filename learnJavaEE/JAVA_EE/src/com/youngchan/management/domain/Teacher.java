package com.youngchan.management.domain;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.studentmanagement.domain
 * @date 2022/11/16 16:20
 * @Description //TODO
 */
public class Teacher {
  private String phoneNum;
  private String addr;
  private String uId;
  private String name ;
  private String gender;
  private double height;
  private double weight;
  private int age;

  public Teacher() {
  }

  public Teacher(String phoneNum, String addr, String uId, String name, String gender,
      double height,
      double weight, int age) {
    this.phoneNum = phoneNum;
    this.addr = addr;
    this.uId = uId;
    this.name = name;
    this.gender = gender;
    this.height = height;
    this.weight = weight;
    this.age = age;
  }

  public String getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public String getuId() {
    return uId;
  }

  public void setuId(String uId) {
    this.uId = uId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
