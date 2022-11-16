package com.youngchan.ClassReview.interfacelearn;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.interfacelearn
 * @date 2022/11/16 22:15
 * @Description //TODO
 */
public class InterfaceRun {

  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.run();
    computer.useUsb(new MyUsb());
    computer.stop();
  }
}
