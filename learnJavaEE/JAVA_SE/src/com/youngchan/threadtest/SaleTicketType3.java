package com.youngchan.threadtest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.threadtest
 * @date 2022/11/20 18:41
 * @Description //TODO
 */
public class SaleTicketType3 implements Runnable {
    private Integer number = 100;

    @Override public void run() {
        while (number > 0) {
            Lock lock = new ReentrantLock();
            lock.lock();
            try {
                Thread.sleep(100L);
                System.out.println(Thread.currentThread().getName() + "***卖出一张表还剩" + --number + "张票");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
