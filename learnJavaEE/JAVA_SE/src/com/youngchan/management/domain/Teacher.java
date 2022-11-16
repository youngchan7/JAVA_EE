package com.youngchan.management.domain;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.studentmanagement.domain
 * @date 2022/11/16 16:20
 * @Description //TODO
 */
public class Teacher extends Person{
  private String phoneNum;
  private String addr;
  private String uId;


  public Teacher() {
  }

  public Teacher(String phoneNum, String addr, String uId, String name, String gender,
      double height,
      double weight, int age) {
    this.phoneNum = phoneNum;
    this.addr = addr;
    this.uId = uId;
    this.setName(name);
    this.setGender(gender);
    this.setHeight(height);
    this.setWeight(weight);
    this.setAge(age);
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

}
