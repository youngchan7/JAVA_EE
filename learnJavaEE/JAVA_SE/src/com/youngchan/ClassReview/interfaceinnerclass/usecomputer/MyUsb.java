package com.youngchan.ClassReview.interfaceinnerclass.usecomputer;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.interfacelearn
 * @date 2022/11/16 22:19
 * @Description // 实现 usb接口 并重写的usb接口里的方法
 */
public class MyUsb implements IUsb{

  @Override
  public void star() {
    IUsb.super.star();
  }

  @Override
  public void end() {
    IUsb.super.end();
  }
}
