package com.youngchan.threadtest.useatomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.threadtest
 * @date 2022/11/21 21:25
 * @Description // 保证共享数据的更改 不出现多线程同时操作的情况
 */
public class AtomicIntegerThread2 extends Thread{
    private AtomicInteger atomicInteger;

    public AtomicIntegerThread2(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }

    @Override public void run() {
        for (int i = 0; i < 100; i++) {
            int num = atomicInteger.incrementAndGet();
            System.out.println(Thread.currentThread().getName()+":"+num);

        }
    }
}
