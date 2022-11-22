package com.youngchan.ClassReview.interfaceinnerclass;

/**
 *   多态的使用   多态编译看左 执行看右   成员变量是以左侧为准 成员方法以右边为准   多态向下转型 instanceof
 */
public class Demo1 {
    /*
        请在main方法中通过多态创建对象，随后使用对象，使得程序符合最终运行结果
     */
    public static void main(String[] args) {
      Fu implementation = new Zi(){
        @Override
        public void method() {
          System.out.println("内部类的使用");
        }
      };

        System.out.println(implementation.num);
        implementation.method();
        if (implementation instanceof Zi){
            Zi zi = (Zi) implementation;
            zi.show();
        }

    }
}

class Fu {
    int num = 10;

    public void method(){
        System.out.println("父类的method方法");
    }
}

class Zi extends Fu{
    int num = 20;

    public void method(){
        System.out.println("子类的method方法");
    }
    
    public void show(){
        System.out.println("子类的show方法");
    }
}