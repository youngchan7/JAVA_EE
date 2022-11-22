package com.youngchan.ClassReview;

import com.youngchan.ClassReview.animaltest.Animal;
import com.youngchan.ClassReview.animaltest.AnimalBehavior;
import com.youngchan.ClassReview.animaltest.Cat;
import com.youngchan.ClassReview.animaltest.Dog;
import com.youngchan.management.domain.Student;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview
 * @date 2022/11/14 17:16
 * @Description //TODO
 */
public class RunClass {

  public static void main(String[] args) {
//    普通对象的使用
//        testPhone();
//    对象的地址值  前面是类的全限定域名 后面是虚拟的内存地址
//        testPrintAddr();
//     普通对象的使用
//        courseware();
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
