package com.youngchan.ClassReview.studentmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview.studentmanagement
 * @date 2022/11/15 16:45
 * @Description //TODO
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
                    return;
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
                    choose = delStudentPage();
                    break;
                default:
                    System.out.println("您输入的内容有误请重新输入");
            }
            if (choose.equals("0")) {
                return;
            }
        }
    }

    private static String delStudentPage() {
        System.out.println("***********删除学生信息页**********");
        System.out.println("请输入学生编码");
        String uId = getMessage();

        if (studentList.stream().filter(a -> a.getuId().equals(uId)).count() > 0) {
            int index = 0;
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getuId().equals(uId)) {
                    index = i;
                }
            }
            studentList.remove(index);
        } else {
            System.out.println("未找到学生,请核对学生编码");
            delStudentPage();
        }
        return optChoose();
    }

    private static String modifyStudent() {
        System.out.println("***********修改学生信息页**********");
        System.out.println("请输入学生编码");
        Student stu = new Student();
        String uId = getMessage();
        if (studentList.stream().filter(a -> a.getuId().equals(uId)).count() > 0) {
            int index = 0;
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getuId().equals(uId)) {
                    index = i;
                }
            }
            stu.setuId(uId);
            getStuMessage(stu);
            studentList.remove(index);
            studentList.add(stu);
        } else {
            System.out.println("未找到学生,请核对学生编码");
            modifyStudent();
        }
        return optChoose();
    }

    private static String addStudent() {
        Student stu = new Student();
        stu.setuId(studentList.size() + 1 + "");
        System.out.println("***********添加学生信息页**********");
        getStuMessage(stu);
        studentList.add(stu);
        System.out.println("录入成功");
        return optChoose();
    }

    private static void getStuMessage(Student stu) {
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

    private static String showAllStudent() {
        System.out.println("***********学生信息页***********");
        if (studentList == null || studentList.size() == 0) {
            System.out.println("系统中暂无学生信息");
        } else {
            for (Student student : studentList) {
                showOneStudent(student);
            }
        }
        return optChoose();
    }

    private static void showOneStudent(Student student) {
        System.out.print("编码：:" + student.getuId());
        System.out.print("  姓名:" + student.getName());
        System.out.print("  性别:" + student.getGender());
        System.out.print("  年龄:" + student.getAge());
        System.out.print("  体重（kg）:" + student.getWeight());
        System.out.print("  身高（cm）:" + student.getHeight());
        System.out.println();
    }

    private static String optChoose() {
        for (; ; ) {
            System.out.println("输入0退出，1返回");
            String choose = getMessage();
            if (choose.equals("0") || choose.equals("1")) {
                return choose;
            } else {
                System.out.println("输入有误请重新输入");
            }
        }
    }

    private static String searchStudent() {
        System.out.println("***********查询学生信息页***********");
        String choose = searchStudentPage();
        List<Student> stuList = new ArrayList<>();
        switch (choose) {
            case "0":
                return "0";
            case "1":
                System.out.println("请输入学生编码");
                String stuId = getMessage();
                stuList =
                    studentList.stream().filter(a -> a.getuId().equals(stuId)).collect(Collectors.toList());
                if (stuList!=null && stuList.size()!=0){
                    for (Student student : stuList) {
                        showOneStudent(student);
                    }
                }else {
                    System.out.println("查询结果为空！~");
                }
                break;
            case "2":
                System.out.println("请输入学生姓名");
                String stuName = getMessage();
                stuList =
                    studentList.stream().filter(a -> a.getName().equals(stuName)).collect(Collectors.toList());
                if (stuList!=null && stuList.size()!=0){
                    for (Student student : stuList) {
                        showOneStudent(student);
                    }
                }else {
                    System.out.println("查询结果为空！~");
                }
                break;
            case "3":
                System.out.println("请输入学生年龄");
                String stuAge = getMessage();
                stuList =
                    studentList.stream().filter(a -> a.getAge() == Integer.parseInt(stuAge)).collect(Collectors.toList());
                if (stuList!=null && stuList.size()!=0){
                    for (Student student : stuList) {
                        showOneStudent(student);
                    }
                }else {
                    System.out.println("查询结果为空！~");
                }
                break;
            case "4":
                System.out.println("请输入学生性别");
                String stuGender = getMessage();
                stuList =
                    studentList.stream().filter(a -> a.getGender().equals(stuGender)).collect(Collectors.toList());
                if (stuList!=null && stuList.size()!=0){
                    for (Student student : stuList) {
                        showOneStudent(student);
                    }
                }else {
                    System.out.println("查询结果为空！~");
                }
                break;
            default:
                System.out.println("获取选项有误");
                return searchStudent();
        }
        return optChoose();
    }

    private static String searchStudentPage() {
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

    private static void homePage() {
        System.out.println("****************欢迎使用学生信息系统****************");
        System.out.println("****************1.查看所有学生信息******************");
        System.out.println("****************2.录入新学生信息********************");
        System.out.println("****************3.查询学生信息**********************");
        System.out.println("****************4.根据学生编码修改学生信息**********");
        System.out.println("****************5.根据学生编码删除学生信息**********");
        System.out.println("****************0.退出学生管理系统******************");
        System.out.println("****************请输入您的操作选项******************");
    }

    private static String getMessage() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
