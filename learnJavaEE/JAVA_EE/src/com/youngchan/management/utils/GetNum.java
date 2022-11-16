package com.youngchan.management.utils;

import com.youngchan.management.domain.Student;
import com.youngchan.management.domain.Teacher;
import java.util.Scanner;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.studentmanagement.utils
 * @date 2022/11/16 16:23
 * @Description //TODO
 */
public class GetNum {

  public static String getMessage() {
    Scanner scanner = new Scanner(System.in);
    String message = scanner.nextLine();
    scanner = null ;
    return message;
  }
  public static String optChoose() {
    for (; ; ) {
      System.out.println("输入0退出当前系统，1返回");
      String choose = getMessage();
      if (choose.equals("0") || choose.equals("1")) {
        return choose;
      } else {
        System.out.println("输入有误请重新输入");
      }
    }
  }
  public static String optReturnChoose() {
    for (; ; ) {
      System.out.println("输入 0退出当前系统，1返回 ，2继续操作");
      String choose = getMessage();
      if (choose.equals("0") || choose.equals("1")|| choose.equals("2")) {
        return choose;
      } else {
        System.out.println("输入有误请重新输入");
      }
    }
  }
  public static void getStuMessage(Student stu) {
    System.out.println("***********请输入学生姓名***********");
    stu.setName(getMessage());
    System.out.println("***********请输入学生性别***********");
    stu.setGender(getMessage());
    System.out.println("***********请输入学生年龄***********");
    stu.setAge(Integer.parseInt(getMessage()));
    System.out.println("***********请输入学生体重（kg）***********");
    stu.setWeight(Double.parseDouble(getMessage()));
    System.out.println("***********请输入学生身高（cm）***********");
    stu.setHeight(Double.parseDouble(getMessage()));
  }
  public static void getTeacherMessage(Teacher teacher) {
    System.out.println("***********请输入教师姓名***********");
    teacher.setName(getMessage());
    System.out.println("***********请输入教师性别***********");
    teacher.setGender(getMessage());
    System.out.println("***********请输入教师电话***********");
    teacher.setPhoneNum(getMessage());
    System.out.println("***********请输入教师地址***********");
    teacher.setAddr(getMessage());
    System.out.println("***********请输入教师年龄***********");
    teacher.setAge(Integer.parseInt(getMessage()));
    System.out.println("***********请输入教师体重（kg）***********");
    teacher.setWeight(Double.parseDouble(getMessage()));
    System.out.println("***********请输入教师身高（cm）***********");
    teacher.setHeight(Double.parseDouble(getMessage()));
  }



}
