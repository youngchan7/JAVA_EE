package com.youngchan.threadtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.threadtest
 * @date 2022/11/20 17:04
 * @Description //TODO
 */
public class ThreadRun {
    public static void main(String[] args) {
//        callableMethod();

//        runableMethod();
//        saleTakeMethod();
//        saleTakeMethod2();
//        saleTakeMethod3();
//        deadlockMethod();
//       producteConsumerMethod();
//       producteConsumerMethod2();

        excutorMethod();
    }

    private static void excutorMethod() {
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
