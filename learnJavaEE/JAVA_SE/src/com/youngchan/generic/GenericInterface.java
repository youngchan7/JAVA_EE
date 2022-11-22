package com.youngchan.generic;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.generic
 * @date 2022/11/18 21:11
 * @Description // 有参无反回的泛型  无参有返回的泛型  有参又返回的泛型  不使用类的泛型 自定义泛型类的定义
 */
public interface GenericInterface<E> {
  void genericMethod(E e);
  E genericMethod2();
  E genericMethod3(E e);
  <T>void genericMethod5(T t);
  <M> M genericMethod4(M m);
}
