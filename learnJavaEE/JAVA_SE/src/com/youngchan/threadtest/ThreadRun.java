package com.youngchan.threadtest;

import com.youngchan.threadtest.lock.MiddleClass;
import com.youngchan.threadtest.lock.SaleTicket;
import com.youngchan.threadtest.lock.SaleTicketType2;
import com.youngchan.threadtest.lock.SaleTicketType3;
import com.youngchan.threadtest.usearrayblockingqueue.ConsumerClass;
import com.youngchan.threadtest.usearrayblockingqueue.ProducteClass;
import com.youngchan.threadtest.useatomicInteger.AtomicIntegerThread;
import com.youngchan.threadtest.useatomicInteger.AtomicIntegerThread2;
import com.youngchan.threadtest.usecallable.ImplCallable;
import com.youngchan.threadtest.userunable.ImplRunable;
import com.youngchan.threadtest.usesemaphore.SemaphoreRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.threadtest
 * @date 2022/11/20 17:04
 * @Description //
 * 线程创建 方式 1. Thread 类继承 2.runable接口实现 3.callable接口实现 4.线程池获取
 * 线程同步问题  synchronized 同步代码块 同步方法  lock锁 ReentrantLock
 * 死锁原因
 * atomicIntegerMethod 取数据不同步问题解决方案
 * semaphore 门禁功能 线程同步工具,主要用于多个线程对共享资源进行并行操作的一种工具类
 * CountDownLatch 线程 统计线程 完成后再执行下方代码功能
 * 守护线程
 * 线程池  ThreadPoolExecutor
 *  生产产品 + 消费产品实现  阻塞队列 ArrayBlockingQueue  和 同步代码块 synchronized 的实现
 *  消费有限产品实现 同步代码块
 */
public class ThreadRun {
    public static void main(String[] args) {
//        callable接口的实现  并获取返回值
//        callableMethod();
//        runable接口的实现
//        runableMethod();
//        同步方法的卖票方式
//        saleTakeMethod();
//        同步代码块的实现卖票
//        saleTakeMethod2();
//        lock锁的卖票方式
//        saleTakeMethod3();
//        死锁
//        deadlockMethod();
//            线程队列的消费者和生产者
//        producteConsumerMethod();
//        同步代码块 加 锁类 的实现 生产者和消费者
//        producteConsumerMethod2();
//        线程池 两种创建
//        excutorMethod();
//        守护线程
//        daemonThread();
//        多线程操作相同变量且变量为int时 保证多线程不会同时为变量更改值
//        atomicIntegerMethod();
//        统计线程数量 等待全部完成继续下面代码
//        countDownLatchMethod();
//        通行证试线程控制  发放通行证  无通行证无法进入方法内代码
//        semaphoreMethod();
    }

    private static void semaphoreMethod() {
        Semaphore semaphore = new Semaphore(1);
        SemaphoreRunnable sr = new SemaphoreRunnable(semaphore);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,100,60,TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 0; i < 100; i++) {
            executor.submit(sr);
        }
        executor.shutdown();
    }

    private static void countDownLatchMethod() {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            countDownLatch.countDown();
            System.out.println("************************"+countDownLatch.getCount());
        },"线程1").start();
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            countDownLatch.countDown();
            System.out.println("************************"+countDownLatch.getCount());
        },"线程2").start();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("全部执行完毕");
    }

    private static void atomicIntegerMethod() {
        AtomicInteger ati = new AtomicInteger();
        ati.set(0);
        AtomicIntegerThread thread = new AtomicIntegerThread(ati);
        AtomicIntegerThread2 thread2 = new AtomicIntegerThread2(ati);
        thread.start();
        thread2.start();
    }

    private static void daemonThread() {
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("a"+i);
            }
        }).start();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("b" + i);
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    private static void excutorMethod() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,60, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10),
            Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardOldestPolicy());

        List<Integer>  iList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            iList.add(random.nextInt());
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(()->{
            Integer count = 0;
            for (int i = 0; i < 2000; i++) {
                count = iList.get(i);
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(count);
        });
        executorService.submit(()->{
            Integer count = 0;
            for (int i = 2000; i < 4000; i++) {
                count = iList.get(i);
            }
            System.out.println(count);
        });

        executorService.submit(()->{
            Integer count = 0;
            for (int i = 4000; i < 6000; i++) {
                count = iList.get(i);
            }
            System.out.println(count);
        });
        executorService.submit(()->{
            Integer count = 0;
            for (int i = 6000; i < 8000; i++) {
                count = iList.get(i);
            }
            System.out.println(count);
        });
        executorService.submit(()->{
            Integer count = 0;
            for (int i = 8000; i < 10000; i++) {
                count = iList.get(i);
            }
            System.out.println(count);
        });
        System.out.println("执行完了");
        executorService.shutdown();
    }

    private static void producteConsumerMethod2() {
        MiddleClass mc = new MiddleClass();
        new Thread(new Runnable() {
            @Override public void run() {
                while (true) {
                    synchronized (mc.getLock()){
                        if(mc.getCountNum()<=0){
                            break;
                        }else {
                            if(mc.isFlag()){
                                try {
                                    mc.getLock().wait();
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }else {
                                System.out.println("生产出产品");
                                mc.setFlag(true);
                                mc.getLock().notifyAll();
                            }
                        }
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override public void run() {
                while (true) {
                    synchronized (mc.getLock()){
                        if(mc.getCountNum()<=0){
                            break;
                        }else {
                            if (mc.isFlag()) {
                                System.out.println("当前产品剩余"+mc.getCountNum());
                                System.out.println("消费者消费了产品");
                                mc.setFlag(false);
                                mc.setCountNum(mc.getCountNum()-1);
                                mc.getLock().notifyAll();
                            }else {
                                try {
                                    mc.getLock().wait();
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }
            }
        }).start();
    }

    private static void producteConsumerMethod() {
        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<>(1);
        new ProducteClass(abq).start();
        new Thread(new ConsumerClass(abq)).start();

    }

    private static void deadlockMethod() {
        Object lockA = new Object();
        Object lockB = new Object();
        new Thread(()->{
            while (true){
                synchronized (lockA){
                    synchronized (lockB){
                        System.out.println("线程一在运行");
                    }
                }
            }
        }).start();
        new Thread(()->{
            while (true){
                synchronized (lockB){
                    synchronized (lockA){
                        System.out.println("线程一在运行");
                    }
                }
            }
        }).start();
    }

    private static  void saleTakeMethod() {
        SaleTicket ra = new SaleTicket();
        new Thread(ra,"窗口1").start();
        new Thread(ra,"窗口2").start();
        new Thread(ra,"窗口3").start();
    }
    private static  void saleTakeMethod2() {
        SaleTicketType2 ra = new SaleTicketType2();
        new Thread(ra,"窗口1").start();
        new Thread(ra,"窗口2").start();
        new Thread(ra,"窗口3").start();
    }
    private static  void saleTakeMethod3() {
        SaleTicketType3 ra = new SaleTicketType3();
        new Thread(ra,"窗口1").start();
        new Thread(ra,"窗口2").start();
        new Thread(ra,"窗口3").start();
    }

    private static void runableMethod() {
        ImplRunable runableRun = new ImplRunable();
        new Thread(runableRun,"线程1").start();
        new Thread(runableRun,"线程2").start();
    }

    private static void callableMethod() {
        FutureTask future = new FutureTask(new ImplCallable());
        FutureTask future2 = new FutureTask(new ImplCallable());
        Thread thread1 = new Thread(future, "执行者1");
        Thread thread2 = new Thread(future2);
        thread2.setPriority(7);
        try {
            thread1.start();
            System.out.println(future.get());
            thread2.setName("执行者2");
            thread2.start();
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }
}
