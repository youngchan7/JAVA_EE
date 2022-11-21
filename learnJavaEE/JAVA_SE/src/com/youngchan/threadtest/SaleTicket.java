package com.youngchan.threadtest;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.threadtest
 * @date 2022/11/20 18:27
 * @Description //TODO
 */
public class SaleTicket implements Runnable{
    private   int  number =100;
    @Override public synchronized void run() {
       while (number>0) {
           try {
               Thread.sleep(100L);
               System.out.println(Thread.currentThread().getName() + "***卖出一张表还剩" + --number + "张票");
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }

    }
}
