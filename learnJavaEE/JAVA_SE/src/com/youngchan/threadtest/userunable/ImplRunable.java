package com.youngchan.threadtest.userunable;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.threadtest
 * @date 2022/11/20 17:21
 * @Description //Runnable 接口实现
 */
public class ImplRunable implements Runnable{

    @Override public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"**********"+i);
        }
    }
}
