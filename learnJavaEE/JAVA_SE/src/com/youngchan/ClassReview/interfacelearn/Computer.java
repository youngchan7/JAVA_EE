package com.youngchan.ClassReview.interfacelearn;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.interfacelearn
 * @date 2022/11/16 22:12
 * @Description //TODO
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
