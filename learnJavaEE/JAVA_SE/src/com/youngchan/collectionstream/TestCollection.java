package com.youngchan.collectionstream;

import com.youngchan.management.domain.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.collectionlearn
 * @date 2022/11/18 18:01
 * @Description //
 * Collection的方法: add  removeIf  remove
 * Stream的方法 filter map  concat
 * TreeMap 使用前的排序规则制定  a-b 升序  b-a 降序
 */
public class TestCollection {

  public static void main(String[] args) {
//    collectionTest();
    exceptionrTest();

  }

  private static void exceptionrTest() {
    String[] iArray = {"1","2","3","4","5","6"};

    Stream<String> stream1 = Arrays.stream(iArray).filter((a) -> "1".equals(a));
    Stream<String> stream2 = Arrays.stream(iArray).filter((a) -> "2".equals(a));
    List<Student> collect =
        Stream.concat(stream1, stream2).map((a) -> new Student(a, "", 1, "", 0, 0)).collect(Collectors.toList());
    System.out.println(collect);
//    System.out.println(stringList);
    TreeMap<Student,String > treeMap = new TreeMap<>((a,b)->a.getAge()-b.getAge());

    treeMap.put(new Student(),"1");

    System.out.println(treeMap);
    HashSet set = new HashSet<>();
    set.add(1);
    System.out.println(set.add(2));
    List list = new ArrayList();
    list.add(1);
    System.out.println(list.add(1));
  }

  private static void collectionTest() {
    Collection<Student> con = new ArrayList<>();
    con.add(new Student("001","",12,"",0,0));
    con.add(new Student("002","",234,"",0,0));
    con.add(new Student("003","",65,"",0,0));
    con.add(new Student("004","",333,"",0,0));
    con.add(new Student("005","",1123,"",0,0));
    con.add(new Student("006","",13,"",0,0));
    con.add(new Student("006","",13,"",0,0));
    System.out.println(con);
    con.removeIf((Student a)->a.getAge()>100);
    System.out.println(con);
    System.out.println(con.contains(new Student("006","",13,"",0,0)));
/*    Iterator<Student> iterator = con.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }*/
    con.remove(new Student("006","",13,"",0,0));
    System.out.println(con);
    con.remove(new Student("006","",13,"",0,0));
    System.out.println(con);
  }

}
