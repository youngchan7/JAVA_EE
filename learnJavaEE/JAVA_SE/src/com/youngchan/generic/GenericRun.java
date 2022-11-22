package com.youngchan.generic;

import com.youngchan.management.domain.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.generic
 * @date 2022/11/18 20:58
 * @Description
 * //泛型类  泛型变量 泛型方法 <? extend Number>  <? super Number>
 */
public class GenericRun {

    public static void main(String[] args) {
        genericMethod();
        //    wildcardCharacter();
        Integer[] a = {1, 2, 3, 4, 5, 6};
        courseOne(a);
        System.out.println(Arrays.asList(a));
        courseTwo(a, 2, 3);
        System.out.println(Arrays.asList(a));
    }

    /**
     * @return
     * @Author youngchan
     * @Description //编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
     * @Date 22:31 2022/11/18
     * @param    null
     **/
    private static <M> void courseTwo(M[] m, int index, int to) {
        M temp = m[index];
        m[index] = m[to];
        m[to] = temp;
    }

    /**
     * @return
     * @Author youngchan
     * @Description //泛型 extends 和 super的用法
     * @Date 22:29 2022/11/18
     * @param    null
     **/
    private static <T> void courseOne(T[] t) {
        Collections.reverse(Arrays.asList(t));
    }

    private static void wildcardCharacter() {
        List<Number> iList = new ArrayList<>();
        List<Integer> sList = new ArrayList<>();
        List<Object> oList = new ArrayList<>();
        superMethod(iList);
        //    superMethod(sList);
        superMethod(oList);
        extendsMethod(iList);
        extendsMethod(sList);
        //    extendsMethod(oList);
        method(iList);
        method(sList);
        method(oList);
    }

    public static void superMethod(List<? super Number> list) {
    }

    public static void extendsMethod(List<? extends Number> list) {
    }

    public static void method(List<?> list) {
    }

    private static void genericMethod() {
        //    泛型类的使用
        GenericClass<String> gc = new GenericClass();
        //    泛型成员方法的使用
        gc.setElement("123");
        System.out.println(gc.getElement());
        GenericClass<Student> gc2 = new GenericClass<>();
        gc2.setElement(new Student("", "", 12, "", 0, 0));
        //    获取元素
        System.out.println(gc2.getElement());
        //    有参有返回方法
        System.out.println(gc.genericMethod3("hahha "));
        //    泛型 有参又返回
        System.out.println(gc2.genericMethod3(new Student("002", "", 12, "", 1, 1)));
        //     泛型无参又返回
        System.out.println(gc.genericMethod2());
        //     泛型无参又返回
        System.out.println(gc2.genericMethod2());
        gc.genericMethod("hahha ");
//        有参无返回方法
        gc2.genericMethod(new Student("002", "", 12, "", 1, 1));
//      有参又返回
        System.out.println(gc.genericMethod4(new Student("002", "", 12, "", 1, 1)));
        System.out.println(gc2.genericMethod4("泛型方法"));
    }
}
