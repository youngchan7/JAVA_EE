package com.youngchan.management.domain;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview
 * @date 2022/11/14 15:08
 * @Description //TODO
 */
public class Student extends Person{
    private String uId;


    public Student(String uId, String name, int age, String gender, double height, double weight) {
        this.uId = uId;
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setHeight(height);
        this.setWeight(weight);
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }


    public Student() {
    }


}
