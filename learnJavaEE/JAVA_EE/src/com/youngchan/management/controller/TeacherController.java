package com.youngchan.management.controller;

import static com.youngchan.management.utils.GetNum.getMessage;
import static com.youngchan.management.utils.GetNum.getTeacherMessage;
import static com.youngchan.management.utils.GetNum.optChoose;
import static com.youngchan.management.utils.GetNum.optReturnChoose;
import static com.youngchan.management.utils.Page.searchTeacherPage;
import static com.youngchan.management.utils.Page.showOneTeacher;
import static com.youngchan.management.utils.Page.showTeachers;
import static com.youngchan.management.utils.Page.teacherHomePage;

import com.youngchan.management.domain.Teacher;
import com.youngchan.management.service.TeacherService;
import java.util.ArrayList;
import java.util.List;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.studentmanagement.controller
 * @date 2022/11/16 16:21
 * @Description //TODO
 */
public class TeacherController {
  TeacherService teacherService = new TeacherService();
  public void showHome() {
    go:
    {
      while (true) {
        teacherHomePage();
        String num = getMessage();
        String choose = "";
        switch (num) {
          case "0":
            System.out.println("***********感谢使用教师管理系统，再见~！***********");
            break go;
          case "1":
            choose = showAllTeacher();
            break;
          case "2":
            choose = addTeacher();
            break;
          case "3":
            choose = searchTeacher();
            break;
          case "4":
            choose = modifyTeacher();
            break;
          case "5":
            choose = delTeacher();
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

  private String delTeacher() {
    System.out.println("***********删除教师信息页**********");
    System.out.println("请输入教师编码");
    String uId = getMessage();
    if (teacherService.ifRepeat(uId)) {
      teacherService.delByUid(uId);
    } else {
      System.out.println("未找到教师,请核对教师编码");
      {
      }}
    String choose = optReturnChoose();
    if (choose.equals("2")){
      System.out.println("继续操作");
      return delTeacher();
    }
    return choose;
  }

  private String modifyTeacher() {
    System.out.println("***********修改教师信息页**********");
    System.out.println("请输入教师编码");
    Teacher teacherMessage = new Teacher();
    String uId = getMessage();
    if (teacherService.ifRepeat(uId)) {
      teacherMessage.setuId(uId);
      getTeacherMessage(teacherMessage);
      teacherService.updateTeacher(teacherMessage);
    } else {
      System.out.println("未找到教师,请核对教师编码");
    }
    String choose = optReturnChoose();
    if (choose.equals("2")){
      System.out.println("继续操作");
      return modifyTeacher();
    }
    return choose;
  }

  private String searchTeacher() {
    System.out.println("***********查询教师信息页***********");
    searchTeacherPage();
    String choose = searchTeacherPage();
    List<Teacher> teachers = new ArrayList<>();
    switch (choose) {
      case "0":
        return "0";
      case "1":
        System.out.println("请输入教师编码");
        String stuId = getMessage();
        teachers = teacherService.searchTeacherByUid(stuId);
        break;
      case "2":
        System.out.println("请输入教师姓名");
        String stuName = getMessage();
        teachers =teacherService.searchTeacherByName(stuName);
        break;
      case "3":
        System.out.println("请输入教师年龄");
        String stuAge = getMessage();
        teachers =teacherService.searchTeacherByAge(stuAge);
        break;
      case "4":
        System.out.println("请输入教师性别");
        String stuGender = getMessage();
        teachers =teacherService.searchTeacherByGender(stuGender);
        break;
      default:
        System.out.println("获取选项有误");
        return searchTeacher();
    }
    showTeachers(teachers);

    String chooseReturn = optReturnChoose();
    if (chooseReturn.equals("2")) {
      return searchTeacher();
    }else {
      return chooseReturn;
    }
  }

  private String addTeacher() {

    System.out.println("***********添加教师信息页**********");
    System.out.println("***********请输入教师编号***********");
    String uId = getMessage();
    boolean ifRepeat =teacherService.ifRepeat(uId);
    if (ifRepeat) {
      System.out.println("当前编号已存在 ， 请重新输入");
      return addTeacher();
    }else {
      Teacher teacher = new Teacher();
      teacher.setuId(uId);
      getTeacherMessage(teacher);
      teacherService.addTeacher(teacher);
      System.out.println("录入成功");
      String choose = optReturnChoose();
      if (choose.equals("2")) {
        System.out.println("继续操作");
        return addTeacher();

      }
      return choose;
    }
  }

  private String showAllTeacher() {
    System.out.println("***********教师信息页***********");
    List<Teacher> teacherList = teacherService.getAll();
    if (teacherList == null || teacherList.size() == 0) {
      System.out.println("系统中暂无教师信息");
    } else {
      for (Teacher teacher : teacherList) {
        showOneTeacher(teacher);
      }
    }
    return optChoose();
  }

}
