package com.youngchan.management.entry;

import static com.youngchan.management.utils.GetNum.getMessage;
import static com.youngchan.management.utils.Page.homePage;

import com.youngchan.management.controller.StudentController;
import com.youngchan.management.controller.TeacherController;
import com.youngchan.management.domain.Student;
import java.util.ArrayList;
import java.util.List;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.studentmanagement
 * @date 2022/11/15 16:45
 * @Description //学生管理系统
 */
public class SystemEntrace {
    public static List<Student> studentList = new ArrayList<Student>();

    public static void main(String[] args) {

        systemRun();
    }

    private static void systemRun() {

        while (true) {
            homePage();
            String num = getMessage();
            String choose = "";
            switch (num) {
                case "0":
                    System.out.println("***********感谢使用，再见~！***********");
                    System.exit(0);
                case "1":
                    StudentController stu = new StudentController();
                    stu.showHome();
                    break;
                case "2":
                    TeacherController tea = new TeacherController();
                    tea.showHome();
                    break;
                case "3":
                    System.out.println("感谢使用！~再见~~");
                    System.exit(0);
                    break;

                default:
                    System.out.println("您输入的内容有误请重新输入");
            }
        }
    }

}
