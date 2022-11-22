package com.youngchan.threadtest.usesemaphore;

import java.util.concurrent.Semaphore;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.threadtest
 * @date 2022/11/21 21:25
 * @Description //线程同步工具,主要用于多个线程对共享资源进行并行操作的一种工具类
 */
public class SemaphoreRunnable implements Runnable{

    private Semaphore semaphore;

    public SemaphoreRunnable(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override public void run() {
        try {
            semaphore.acquire();
            System.out.println("获取通行证");
            Thread.sleep(200L);
            semaphore.release();
            System.out.println("归还通行证");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
