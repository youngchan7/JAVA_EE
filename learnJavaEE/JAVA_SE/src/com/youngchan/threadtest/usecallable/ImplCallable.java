package com.youngchan.threadtest.usecallable;

import java.util.concurrent.Callable;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.threadtest
 * @date 2022/11/20 17:05
 * @Description //Callable 接口实现
 */
public class ImplCallable implements Callable {
    @Override public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
//            Thread.sleep(50L);
            System.out.println(Thread.currentThread().getName()+"*********"+Thread.currentThread().getPriority()+"**********"+i);
        }
        return "执行完了Callable方法";
    }
}
