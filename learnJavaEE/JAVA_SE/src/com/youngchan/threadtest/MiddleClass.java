package com.youngchan.threadtest;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.threadtest
 * @date 2022/11/20 22:32
 * @Description //生产者消费者中间类
 */
public class MiddleClass {
//    true 表示有 false标识没有
    private volatile boolean  flag ;
    private int countNum ;
    private  final Object lock = new Object();

    public MiddleClass() {
        this.setFlag(false);
        this.setCountNum(10);
    }

    public MiddleClass(boolean flag, int countNum) {
        this.flag = flag;
        this.countNum = countNum;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCountNum() {
        return countNum;
    }

    public void setCountNum(int countNum) {
        this.countNum = countNum;
    }

    public Object getLock() {
        return lock;
    }
}
