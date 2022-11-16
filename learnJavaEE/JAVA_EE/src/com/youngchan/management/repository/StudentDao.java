package com.youngchan.management.repository;

import com.youngchan.management.domain.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.studentmanagement.repository
 * @date 2022/11/16 16:21
 * @Description //TODO
 */
public class StudentDao {
private static List<Student> studentList = new ArrayList<>();
  public void removeById(String uId) {
    int index = 0;
    for (int i = 0; i < studentList.size(); i++) {
      if (studentList.get(i).getuId().equals(uId)) {
        index = i;
      }
    }
    studentList.remove(index);
  }

  public List<Student> getAll() {
    return studentList;
  }

  public void update(Student stu) {
    removeById(stu.getuId());
    studentList.add(stu);
  }

  public List<Student> searchStudentByUid(String stuId) {
    return studentList.stream().filter(a -> a.getuId().equals(stuId)).collect(Collectors.toList());
  }

  public List<Student> searchStudentByName(String stuName) {
    return studentList.stream().filter(a -> a.getName().equals(stuName)).collect(Collectors.toList());
  }

  public List<Student> searchStudentByAge(String stuAge) {
    return studentList.stream().filter(a -> a.getAge() == Integer.parseInt(stuAge)).collect(Collectors.toList());

  }

  public List<Student> searchStudentByGender(String stuGender) {
    return studentList.stream().filter(a -> a.getGender().equals(stuGender)).collect(Collectors.toList());
  }

  public void addStu(Student stu) {
    studentList.add(stu);
  }
}
