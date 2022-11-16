package com.youngchan.ClassReview.interfacelearn;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.interfacelearn
 * @date 2022/11/16 22:19
 * @Description //TODO
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
