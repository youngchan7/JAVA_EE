package com.youngchan.threadtest.usearrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.threadtest
 * @date 2022/11/20 22:25
 * @Description //阻塞队列
 */
public class ProducteClass extends Thread {
    private ArrayBlockingQueue<String> abq;

    public ProducteClass(ArrayBlockingQueue<String> abq) {
        this.abq = abq;
    }

    @Override public void run() {
        while (true) {
            try {
                abq.put("一个包子");
                System.out.println("生产了一个包子！~");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
