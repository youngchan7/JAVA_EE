package com.youngchan.management.repository.impl;

import com.youngchan.management.domain.Person;
import com.youngchan.management.domain.Student;
import com.youngchan.management.repository.IStudentDao;
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
public class StudentDao extends BaseManagerDao implements IStudentDao {
  private static List<Student> studentList = new ArrayList<>();
  static{
    studentList.add(new Student("001","张三",21,"男",178.5,65));
    studentList.add(new Student("002","李四",25,"女",174.5,54));
    studentList.add(new Student("003","王五",26,"男",182.5,75));
  }

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

  public List<Student> searchByUid(String stuId) {
    return studentList.stream().filter(a -> a.getuId().equals(stuId)).collect(Collectors.toList());
  }

  public List<Student> searchByName(String stuName) {
    return studentList.stream().filter(a -> a.getName().equals(stuName)).collect(Collectors.toList());
  }

  public List<Student> searchByAge(String stuAge) {
    return studentList.stream().filter(a -> a.getAge() == Integer.parseInt(stuAge)).collect(Collectors.toList());

  }

  public List<Student> searchByGender(String stuGender) {
    return studentList.stream().filter(a -> a.getGender().equals(stuGender)).collect(Collectors.toList());
  }

  public void add(Student stu) {
    studentList.add(stu);
  }
}
