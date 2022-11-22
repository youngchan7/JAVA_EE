package com.youngchan.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.reflection
 * @date 2022/11/21 20:49
 * @Description //反射 ：  获取class文件  获取并使用构造方法  获取并使用成员方法 获取并使用 成员变量
 */
public class ReflectionClass {
    public static void main(String[] args) {
//        获取构造方法
//        reflectionConstractor();
//        获取成员变量
//        reflectionVariable();
//        获取成员方法
//        reflectionMethod();


    }

    private static void reflectionMethod() {
        try {
            Class<? extends Reflection> reflectionClass = new Reflection().getClass();
            Reflection reflection = reflectionClass.newInstance();
            Method getMessage = reflectionClass.getDeclaredMethod("getMessage", String.class, Integer.class);
            getMessage.setAccessible(true);
            System.out.println(getMessage.invoke(reflection, "这是一串字符串", 10));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    private static void reflectionVariable() {
        Class<Reflection> reflectionClass = Reflection.class;
        try {
            Reflection reflection = reflectionClass.newInstance();
            System.out.println(reflectionClass.getField("message").get(reflection));
            Field name = reflectionClass.getDeclaredField("name");
            name.setAccessible(true);
            name.set(reflection,"哈哈哈");
            System.out.println(reflection);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    private static void reflectionConstractor() {
        try {
            Class reflectionClass = Class.forName("com.youngchan.reflection.Reflection");

            Constructor reflectionConstructor = reflectionClass.getDeclaredConstructor(String.class);
            reflectionConstructor.setAccessible(true);
            Reflection reflection = (Reflection)reflectionConstructor.newInstance("不懂得");
            System.out.println(reflection);
            Object o = reflectionClass.getConstructor().newInstance();
            System.out.println(o);
            Object o1 = reflectionClass.newInstance();
            System.out.println(o1);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
