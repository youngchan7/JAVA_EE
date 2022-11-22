package com.youngchan.ClassReview.animaltest;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.animaltest
 * @date 2022/11/22 17:47
 * @Description // 多态 接口指向实现类   接口中的 默认方法  静态方法的调用  猫狗重写接口的抽象方法
 */
public class AnimalRun {
    public static void main(String[] args) {
        coursewareAnimal();
    }
    private static void coursewareAnimal() {

        AnimalBehavior catInterface = new Cat("花色", "波斯");
        catInterface.testDefaultMethod();
        AnimalBehavior.staticMethod();
        catInterface.eat();
        catInterface.sayOut();

        Cat cat = new Cat("花色", "波斯");
        System.out.println(cat.getType());
        Animal cat2 = new Cat("花色", "波斯");
        System.out.println(cat2.getType());
        cat2.eat();
        cat.catchMouse();
        Dog dog = new Dog("黑色", "藏獒");
        dog.eat();
        dog.catchMouse();
    }
}
