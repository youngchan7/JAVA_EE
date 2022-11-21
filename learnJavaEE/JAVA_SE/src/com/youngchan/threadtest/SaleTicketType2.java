package com.youngchan.threadtest;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.threadtest
 * @date 2022/11/20 18:37
 * @Description //TODO
 */
public class SaleTicketType2 implements Runnable{
    private   Integer  number =100;

    @Override public  void run() {
        synchronized(number){
            while (number>0) {
                try {
                    Thread.sleep(100L);
                    System.out.println(
                        Thread.currentThread().
                            getName() + "***卖出一张表还剩" +
                            --number + "张票");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
