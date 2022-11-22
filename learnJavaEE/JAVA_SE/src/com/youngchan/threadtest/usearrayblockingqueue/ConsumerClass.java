package com.youngchan.threadtest.usearrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.threadtest
 * @date 2022/11/20 22:28
 * @Description // 阻塞队列
 */
public class ConsumerClass implements Runnable{
    private ArrayBlockingQueue<String> abq;
    public ConsumerClass(ArrayBlockingQueue<String> abq) {
        this.abq = abq;
    }
    @Override public void run() {
        while (true) {
            try {
                System.out.println("消费者消费了"+abq.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
