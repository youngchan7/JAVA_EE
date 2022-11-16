package com.youngchan.ClassReview.interfacelearn;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.interfacelearn
 * @date 2022/11/16 22:12
 * @Description //TODO
 */
public interface IUsb {
    default void star(){
      System.out.println("开启功能");
    }
     default void end() {
       System.out.println("移除功能");
     }



}
