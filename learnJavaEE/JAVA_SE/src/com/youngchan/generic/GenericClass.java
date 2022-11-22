package com.youngchan.generic;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.generic
 * @date 2022/11/18 20:58
 * @Description //泛型类 的定义   泛型接口的引用  泛型变量的定义 泛型方法的定义
 */
public class GenericClass<E> implements GenericInterface<E> {
    private E element;
    public void genericMethod(E e){
      System.out.println("调用泛型方法");
    }

  @Override
  public E genericMethod2() {
    System.out.println("调用泛型方法2");

    return this.element;
  }

  @Override
  public E genericMethod3(E e) {
    System.out.println("调用泛型方法3");

    return this.element;
  }

  @Override
  public <M> void genericMethod5(M m) {
    System.out.println("泛型方法5");
  }

  public <T>  T genericMethod4(T t){
   System.out.println("泛型方法单独使用，不使用类中泛型");
   return t;
 }
    public <C>  void genericMethod4(int a ,C... c){
        System.out.println("泛型方法单独使用，不使用类中泛型"+c);

    }


  public E getElement() {
    return element;
  }

  public void setElement(E element) {
    this.element = element;
  }
}
