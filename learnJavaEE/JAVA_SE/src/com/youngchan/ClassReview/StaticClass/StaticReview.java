package com.youngchan.ClassReview.StaticClass;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.StaticClass
 * @date 2022/11/16 15:41
 * @Description // 1. 查看  静态变量 静态代码块   构造代码块 构造方法 调用顺序 静态方法
 */
public class StaticReview {

    public static void main(String[] args) {
        //     静态成员变量   静态代码块
        //    System.out.println(Father.i);
        //     静态成员变量   静态代码块 静态方法
        //    Father. speak();
        //    父类静态变量  父类静态代码块  子类静态代码块 父类构造代码块  父类构造方法 子类构造代码块 子类构造方法
        //    Father a = new Son();
        //    a.speak1();
        //      内部类的静态变量
        //            new StaticInClassnClass.InnerClass().iNomal = 10;
        //      静态内部类的的静态变量
        //            StaticInClassnClass.InnerClass.iStatic = 20;
        //      内部类的普通方法
        //            new StaticInClassnClass.InnerClass().nomalMethod();
        //       内部类的静态方法
        //            StaticInClassnClass.InnerClass.staticMethod();
    }

}
