package com.youngchan.ClassReview.interfaceinnerclass.usecomputer;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.interfacelearn
 * @date 2022/11/16 22:12
 * @Description //电脑类 有开启 关闭方法  有使用usb方法  usb 为接口 具体是什么实现看参数
 */
public class Computer{

  public void run(){
    System.out.println("开机");
  }
  public void stop(){
    System.out.println("关机");
  }
  public void useUsb(IUsb usb){
    usb.star();
    usb.end();
  }
}
