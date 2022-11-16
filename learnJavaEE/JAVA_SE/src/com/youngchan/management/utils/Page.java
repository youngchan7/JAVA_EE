package com.youngchan.management.utils;

import static com.youngchan.management.utils.GetNum.getMessage;

import com.youngchan.management.domain.Student;
import com.youngchan.management.domain.Teacher;
import java.util.List;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.studentmanagement.utils
 * @date 2022/11/16 16:25
 * @Description //TODO
 */
public class Page {
  public static void studentHomePage() {
    System.out.println("****************欢迎使用学生信息系统****************");
    System.out.println("****************1.查看所有学生信息******************");
    System.out.println("****************2.录入新学生信息********************");
    System.out.println("****************3.查询学生信息**********************");
    System.out.println("****************4.根据学生编码修改学生信息**********");
    System.out.println("****************5.根据学生编码删除学生信息**********");
    System.out.println("****************0.退出学生管理系统******************");
    System.out.println("****************请输入您的操作选项******************");
  }
  public static void teacherHomePage() {
    System.out.println("****************欢迎使用教师信息系统****************");
    System.out.println("****************1.查看所有教师信息******************");
    System.out.println("****************2.录入新教师信息********************");
    System.out.println("****************3.查询教师信息**********************");
    System.out.println("****************4.根据教师编码修改教师信息**********");
    System.out.println("****************5.根据教师编码删除教师信息**********");
    System.out.println("****************0.退出学生管理系统******************");
    System.out.println("****************请输入您的操作选项******************");
  }
  public static void homePage() {
    System.out.println("****************欢迎使用信息系统****************");
    System.out.println("****************1.使用学生管理系统******************");
    System.out.println("****************2.使用教师管理系统********************");
    System.out.println("****************3.退出管理系统**********************");

  }
  public static void showOneStudent(Student student) {
    System.out.print("编码：:" + student.getuId());
    System.out.print("  姓名:" + student.getName());
    System.out.print("  性别:" + student.getGender());
    System.out.print("  年龄:" + student.getAge());
    System.out.print("  体重（kg）:" + student.getWeight());
    System.out.print("  身高（cm）:" + student.getHeight());
    System.out.println();
  }
  public static void showOneTeacher(Teacher teacher) {
    System.out.print("编码：:" + teacher.getuId());
    System.out.print("  姓名:" + teacher.getName());
    System.out.print("  电话:" + teacher.getPhoneNum());
    System.out.print("  地址:" + teacher.getAddr());
    System.out.print("  性别:" + teacher.getGender());
    System.out.print("  年龄:" + teacher.getAge());
    System.out.print("  体重（kg）:" + teacher.getWeight());
    System.out.print("  身高（cm）:" + teacher.getHeight());
    System.out.println();
  }
public static void showStudents(List<Student> studentList) {
  if (studentList!=null && studentList.size()!=0){
    for (Student student : studentList) {
      showOneStudent(student);
    }
  }else {
    System.out.println("查询结果为空！~");
  }
  }
  public static void showTeachers(List<Teacher> teachers) {
  if (teachers!=null && teachers.size()!=0){
    for (Teacher teacher : teachers) {
      showOneTeacher(teacher);
    }
  }else {
    System.out.println("查询结果为空！~");
  }
  }


  public static String searchStudentPage() {
    System.out.println("***********1.根据学生编码查询学生信息***********");
    System.out.println("***********2.根据学生姓名查询学生信息***********");
    System.out.println("***********3.根据学生年龄查询学生信息***********");
    System.out.println("***********4.根据学生性别查询学生信息***********");
    System.out.println("***********0.退出学生管理系统***********");
    System.out.println("***********请选择*******************");
    String choose = getMessage();
    String allChoose = "1,2,3,4,0,";
    if (allChoose.contains(choose)) {
      return choose;
    } else {
      System.out.println("输入有误请重新输入");
      return searchStudentPage();
    }
  }
  public static String searchTeacherPage() {
    System.out.println("***********1.根据教师编码查询教师信息***********");
    System.out.println("***********2.根据教师姓名查询教师信息***********");
    System.out.println("***********3.根据教师年龄查询教师信息***********");
    System.out.println("***********4.根据教师性别查询教师信息***********");
    System.out.println("***********0.退出教师管理系统***********");
    System.out.println("***********请选择*******************");
    String choose = getMessage();
    String allChoose = "1,2,3,4,0,";
    if (allChoose.contains(choose)) {
      return choose;
    } else {
      System.out.println("输入有误请重新输入");
      return searchTeacherPage();
    }
  }
}
