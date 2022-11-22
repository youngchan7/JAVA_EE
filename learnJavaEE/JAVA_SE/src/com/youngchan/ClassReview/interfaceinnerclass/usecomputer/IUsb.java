package com.youngchan.ClassReview.interfaceinnerclass.usecomputer;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.interfacelearn
 * @date 2022/11/16 22:12
 * @Description //接口类   定义了两个方法
 */
public interface IUsb {
    default void star(){
      System.out.println("开启功能");
    }
     default void end() {
       System.out.println("移除功能");
     }
}
