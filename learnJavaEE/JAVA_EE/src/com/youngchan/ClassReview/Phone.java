package com.youngchan.ClassReview;

import java.util.regex.Pattern;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview
 * @date 2022/11/14 15:14
 * @Description //TODO
 */
public class Phone {
    private String brand ;
    private String price;
    private String owner;
    private String phoneNum;
    public void sendMessage(String message,String toNum){
        System.out.println(owner+":"+message+"----"+toNum);
    }
    public void callNum(String toNum){
        System.out.println(owner+":"+"打电话给-------"+toNum);
    }

    public Phone() {
    }

    public Phone(String brand, String price, String owner, String phoneNum) {
        this.brand = brand;
        this.price = price;
        this.setOwner(owner) ;
        this.setPhoneNum(phoneNum);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (Pattern.matches("^[\u4e00-\u9fa5]{2,4}$", owner)) {
            //用户名正确
            this.owner = owner;
        } else {
            //用户名格式错误
            throw new RuntimeException("用户名不合规");
        }
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        if (Pattern.matches("^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$",
            phoneNum)) {
            //手机号码格式正确
            this.phoneNum = phoneNum;
        } else {
            //手机号码格式错误
            throw new RuntimeException("手机号不合规");
        }
    }

}
