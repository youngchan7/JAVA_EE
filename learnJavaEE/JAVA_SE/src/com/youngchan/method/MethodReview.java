package com.youngchan.method;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan
 * @date 2022/11/18 11:02
 * @Description //递归
 */
public class MethodReview {

  public static void main(String[] args) {
//    斐波数列实现
    Integer result = fibonacciFor();
    System.out.println(fibonacciMethod(20));
    System.out.println(result);
//    阶乘实现
//    Integer result = factorial(10);
//    System.out.println(result);
  }
  /**
   * @Author youngchan
   * @Description //一个正整数的阶乘（factorial）是所有小于及等于该数的正整数的积，并且0的阶乘为1。
   * 即：n的阶乘 = 1 * 2 * 3 * 4 * ... * n。
   * 请使用递归知识，求10的阶乘是多少。
   * @Date 11:24 2022/11/18
   * @param	null
   * @return
  **/
  private static Integer factorial(int time) {
    if(time == 1 || time == 0){
      return 1;
    }else {
      return time * factorial(time-1);
    }

  }

  /**
   * @Author youngchan
   * @Description //斐波那契数列（fibonacci）是指这样一个数列：1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
   * 这个数列从第3项开始，每一项都等于前两项之和。请使用递归知识，求数列第20项的值。
   * @Date 11:02 2022/11/18
   * @param  null
   **/
  private static Integer fibonacciFor() {
    int valueBefore = 1, valueAfter = 1;
    for (int i = 3; i <= 20; i++) {
      int temp = valueAfter;
      valueAfter = valueBefore + valueAfter;
      valueBefore = temp;
    }
    return valueAfter;
  }

  /**
   * @Author youngchan
   * @Description //斐波那契数列（fibonacci）是指这样一个数列：1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
   * 这个数列从第3项开始，每一项都等于前两项之和。请使用递归知识，求数列第20项的值。
   * @Date 11:02 2022/11/18
   * @param  null
   **/
  private static Integer fibonacciMethod(int time) {
    if(time==1 || time ==2 ){
      return 1;
    }else {
      return fibonacciMethod(time-2)+fibonacciMethod(time-1);
    }
  }
}
