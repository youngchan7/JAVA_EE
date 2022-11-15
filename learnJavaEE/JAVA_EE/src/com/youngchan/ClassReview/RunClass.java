package com.youngchan.ClassReview;

import com.youngchan.ClassReview.animaltest.Animal;
import com.youngchan.ClassReview.animaltest.Cat;
import com.youngchan.ClassReview.animaltest.Dog;
import com.youngchan.studentmanagement.Student;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview
 * @date 2022/11/14 17:16
 * @Description //TODO
 */
public class RunClass {

  public static void main(String[] args) {
//        testPhone();
//        testPrintAddr();
//        courseware();
    coursewareAnimal();
  }

  /**
   * @Author youngchan
   * @Description // ## 题目4（训练）
   *
   * 定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
   * 定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()
   * @Date 17:42 2022/11/14
   * @param  null
   **/
  private static void coursewareAnimal() {
    String a = "123";
    String b = "12";
    String c = b+"3";
    String d = "12"+"3";
    System.out.println(a == c);
    System.out.println(a == d);
    System.out.println(a == c.intern());
    System.out.println(a.equals(c));

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

  private static void courseware() {
    GirlFriend myGirl = new GirlFriend("lady", 170, 55);
    myGirl.show();
    myGirl.cook();
    myGirl.wash();
  }

  private static void testPrintAddr() {
    Student stu = new Student();
    System.out.println(stu);
  }

  private static void testPhone() {
    Phone myPhone = new Phone("华为", "5000", "张三", "18866890917");
    Phone yourPhone = new Phone("三星", "3000", "王五", "18205417550");

    //        我发短信你
    myPhone.sendMessage("我发短信拉", yourPhone.getPhoneNum());
    //        你打电话我
    yourPhone.callNum(myPhone.getPhoneNum());

    System.out.println();
  }
}
