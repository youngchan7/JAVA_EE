package com.youngchan.management.controller;

import static com.youngchan.management.utils.GetNum.getMessage;
import static com.youngchan.management.utils.GetNum.getStuMessage;
import static com.youngchan.management.utils.GetNum.optChoose;
import static com.youngchan.management.utils.GetNum.optReturnChoose;
import static com.youngchan.management.utils.Page.searchStudentPage;
import static com.youngchan.management.utils.Page.showOneStudent;
import static com.youngchan.management.utils.Page.showStudents;
import static com.youngchan.management.utils.Page.studentHomePage;

import com.youngchan.management.domain.Student;
import com.youngchan.management.service.StudentService;
import java.util.ArrayList;
import java.util.List;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.studentmanagement.controller
 * @date 2022/11/16 16:21
 * @Description //TODO
 */
public class StudentController {
StudentService studentService = new StudentService();
  public void showHome() {
    go:
    {
      while (true) {
        studentHomePage();
        String num = getMessage();
        String choose = "";
        switch (num) {
          case "0":
            System.out.println("***********感谢使用学生管理系统，再见~！***********");
            break go;
          case "1":
            choose = showAllStudent();
            break;
          case "2":
            choose = addStudent();
            break;
          case "3":
            choose = searchStudent();
            break;
          case "4":
            choose = modifyStudent();
            break;
          case "5":
            choose = delStudent();
            break;
          default:
            System.out.println("您输入的内容有误请重新输入");
        }
        if (choose.equals("0")) {
          return;
        }
      }
    }
  }

  private String delStudent() {
    System.out.println("***********删除学生信息页**********");
    System.out.println("请输入学生编码");
    String uId = getMessage();
    if (studentService.ifRepeat(uId)) {
      studentService.delByUid(uId);
    } else {
      System.out.println("未找到学生,请核对学生编码");
    }
    
    String choose = optReturnChoose();
    if (choose.equals("2")){
      System.out.println("继续操作");
      return delStudent();
    }
    return choose;
  }

  private String modifyStudent() {
    System.out.println("***********修改学生信息页**********");
    System.out.println("请输入学生编码");
    Student stu = new Student();
    String uId = getMessage();
    if (studentService.ifRepeat(uId)) {
      stu.setuId(uId);
      getStuMessage(stu);
      studentService.updateStudent(stu);
    } else {
      System.out.println("未找到学生,请核对学生编码");
    }
    String choose = optReturnChoose();
    if (choose.equals("2")){
      System.out.println("继续操作");
      return modifyStudent();
    }
    return choose;
  }

  private String searchStudent() {
    System.out.println("***********查询学生信息页***********");
    String choose = searchStudentPage();
    List<Student> stuList = new ArrayList<>();
    switch (choose) {
      case "0":
        return "0";
      case "1":
        System.out.println("请输入学生编码");
        String stuId = getMessage();
        stuList = studentService.searchStudentByUid(stuId);
        break;
      case "2":
        System.out.println("请输入学生姓名");
        String stuName = getMessage();
        stuList =studentService.searchStudentByName(stuName);
        break;
      case "3":
        System.out.println("请输入学生年龄");
        String stuAge = getMessage();
        stuList =studentService.searchStudentByAge(stuAge);
        break;
      case "4":
        System.out.println("请输入学生性别");
        String stuGender = getMessage();
        stuList =studentService.searchStudentByGender(stuGender);
        break;
      default:
        System.out.println("获取选项有误");
        return searchStudent();
    }
    showStudents(stuList);

    String chooseReturn = optReturnChoose();
    if (chooseReturn.equals("2")) {
      return searchStudent();
    }else {
      return chooseReturn;
    }
  }

  private String addStudent() {

    System.out.println("***********添加学生信息页**********");
    System.out.println("***********请输入学生编号***********");
    String uId = getMessage();
    boolean ifRepeat =studentService.ifRepeat(uId);
    if (ifRepeat) {
      System.out.println("当前学号已存在 ， 请重新输入");
      return addStudent();
    }else {
      Student stu = new Student();
      stu.setuId(uId);
      getStuMessage(stu);
      studentService.addStudent(stu);
      System.out.println("录入成功");
      String choose = optReturnChoose();
      if (choose.equals("2")) {
        System.out.println("继续操作");
        return addStudent();
         
      }
      return choose;
    }
  }

  private String showAllStudent() {
    System.out.println("***********学生信息页***********");
    List<Student> studentList = studentService.getAll();
    if (studentList == null || studentList.size() == 0) {
      System.out.println("系统中暂无学生信息");
    } else {
      for (Student student : studentList) {
        showOneStudent(student);
      }
    }
    return optChoose();
  }

}
