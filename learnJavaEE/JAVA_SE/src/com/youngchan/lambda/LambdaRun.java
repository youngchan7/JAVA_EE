package com.youngchan.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.lambda
 * @date 2022/11/17 11:15
 * @Description // 方法 参数 为接口实现类  当方法调用实现类方法时 具体调用的是lambda表达式内的内容
 * 阅读时如看不明白 可以把lambda当做内部类来阅读
 * Function 有参有反 Supplier 无参有反  Consumer 有参无反  Predicate 有参有布尔反
 */
public class LambdaRun {

//  lambda 表达式中定义具体行为   useLambda是 调用定义的行为
  public static void main(String[] args) {
    useLambda( (a,b)-> {
      return "有参有反:"+a+b;
    });
    useLambda(()-> System.out.println("无参无反:"));
    useLambda((a,b)-> {
          System.out.println("有参无反："+a+b);
        }
    );
    useLambda(a-> {
          System.out.println("有参无反："+a);
        }
    );
    useLambda((a)-> {
          System.out.println("有参有反："+a);
          return a;
        }
    );
    useLambda( ()-> {
     return "无参有反:";
    });

// 使用predicate
/*
    useLambda( (a)-> {
      return a<10;
    });
*/


  }



  private static void useLambda(YoucanYoufan yy) {

    System.out.println(yy.method("有参有反A","有参有反B"));
  }
  private static void useLambda(Function function) {
    System.out.println(function.apply("使用Function:"));

    }

/*  private static void useLambda(WucanYoufan wy) {
    System.out.println("使用自定义无参有返回"+wy.method());
  }*/
  private static void useLambda(Supplier su){
    System.out.println(su.get()+"使用Supplier");
  }

  private static void useLambda(YoucanWufan yw) {
    yw.method("无参无反A","无参无反B");
  }
  private static void useLambda(Consumer consumer) {
    consumer.accept("使用Consumer：");
    Consumer andCon = consumer.andThen((a)-> System.out.println("andThen方法"));
    andCon.accept("andThen参数");
//    andCon.accept("andThen参数");
//    consumer1.accept("consumer.andThen");
  }

  private static void useLambda(WucanWuFan ww) {
    ww.method();
  }
/*private static void useLambda(Predicate<Integer> predicate) {
  System.out.println("使用predicate");
  Predicate<Integer> andPredicate = predicate.and((a) -> a > 5);
  System.out.println(andPredicate.test(4));
  Predicate<Integer> orPredicate = predicate.or((a) -> a > 5);
  System.out.println(orPredicate.test(4));
  }*/

}
