package com.youngchan.sortingduplicate;

import com.youngchan.management.domain.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = {2, 4, 6, 1, 9, 3, 0, 7,0};
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("001","",18,"",0,0));
        stuList.add(new Student("002","",21,"",0,0));
        stuList.add(new Student("003","",25,"",0,0));
        stuList.add(new Student("004","",15,"",0,0));
        stuList.add(new Student("005","",23,"",0,0));
        stuList.add(new Student("006","",23,"",0,0));
        stuList.add(new Student("006","",23,"",0,0));
        sorting(arr,stuList);
        duplicate(arr,stuList);
	}
/**
 * @Author youngchan
 * @Description //简单数据类型和引用数据类型 的集合或数组去重
 * @Date 17:23 2022/11/17
 * @param	arr 数组 stuList 集合
 * @return
**/
    private static void duplicate(Integer[] arr, List<Student> stuList) {
        List<Integer> arrayList = Arrays.asList(arr);
//        简单数据类型去重
        System.out.println("去重前*******************************");
        System.out.println(arrayList.toString());
        System.out.println("去重后*******************************");
        arrayList = arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println(arrayList.toString());
        System.out.println("去重前*******************************");
        stuList.forEach(a-> System.out.println(a.getuId()+":  "+a.getAge()));
//        对象根据指定属性去重
        System.out.println("根据指定属性去重后*******************************");
        List<Student> result = stuList.stream().collect(Collectors.collectingAndThen(
            Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Student::getAge))), ArrayList::new));
        result.forEach(a-> System.out.println(a.getuId()+":  "+a.getAge()));
        System.out.println("根据指定属性去重后根据两个字段*******************************");
        List<Student> result2 = stuList.stream().filter(distinctByKey(a->a.getAge()+a.getuId())).collect(Collectors.toList());
        result2.forEach(a-> System.out.println(a.getuId()+":  "+a.getAge()));
    }
    /**
     * @Author youngchan
     * @Description //简单数据类型和 引用数据类型的 集合或数组排序
     * @Date 17:23 2022/11/17
     * @param	arr 数组 stuList 集合
     * @return
     **/
    private static void sorting(Integer[] arr, List<Student> stuList) {
        List<Integer> arrayList = Arrays.asList(arr);
//        简单数据类型排序
        System.out.println("排序前****************************************");
        System.out.println(arr.toString());
//       compareTo 排序 降序
        Arrays.sort(arr,(a,b)->b.compareTo(a));
//        降序
//        Arrays.sort(arr,(a,b)->b-a);
        System.out.println("排序后****************************************");
        System.out.println(Arrays.toString(arr));
//        升序
        Collections.sort(arrayList,(a,b)->a-b);
        System.out.println(arrayList.toString());;

//        对象排序
        System.out.println("排序前****************************************");
        stuList.forEach(a-> System.out.println(a.getuId()+":  "+a.getAge()));
        System.out.println("排序后********************************************");
//        升序排序
        Collections.sort(stuList,(a,b)->a.getAge()-b.getAge());
        stuList.forEach(a-> System.out.println(a.getuId()+":  "+a.getAge()));
    }

    /**
     * @Author youngchan
     * @Description //去重
     * @Date 17:25 2022/11/17
     * @param	keyExtractor Predicate 有参返回布尔
     * @return
    **/
    static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}