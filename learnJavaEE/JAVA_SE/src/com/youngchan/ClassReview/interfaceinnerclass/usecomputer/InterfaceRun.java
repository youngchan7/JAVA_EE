package com.youngchan.ClassReview.interfaceinnerclass.usecomputer;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.interfacelearn
 * @date 2022/11/16 22:15
 * @Description // 模拟电脑 使用 usb 接口 连接使用不同设备   匿名内部类的使用
 */
public class InterfaceRun {

  public static void main(String[] args) {

    Computer computer = new Computer();
    computer.run();
    computer.useUsb(new IUsb() {
      @Override
      public void star() {
        System.out.println("此台电脑插入了U盘");
      }

      @Override
      public void end() {
        System.out.println("此台电脑移除了U盘");
      }
    });
    computer.stop();

    Computer com = new Computer(){
       int useTime = 0;
      @Override
      public void run() {
        System.out.println("我开机了");
        useTime++;
      }
      @Override
      public void stop() {
        System.out.println("我开机了"+useTime+"次");
        System.out.println("我关机了");
      }
    };
    for (int i = 0; i < 10; i++) {
      com.run();
      com.stop();
    }
  }
}
