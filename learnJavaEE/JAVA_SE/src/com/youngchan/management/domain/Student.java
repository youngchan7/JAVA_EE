package com.youngchan.management.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview
 * @date 2022/11/14 15:08
 * @Description //TODO
 */
public class Student extends Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String uId;


    @Override
    public String toString() {
        return "Student{" +
            "uId='" + uId + '\'' +
            ", '" + super.toString() + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return uId.equals(student.uId);
    }



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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
