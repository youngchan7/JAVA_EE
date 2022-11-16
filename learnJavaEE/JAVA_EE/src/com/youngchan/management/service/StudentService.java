package com.youngchan.management.service;

import com.youngchan.management.domain.Student;
import com.youngchan.management.repository.StudentDao;
import java.util.List;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.studentmanagement.service
 * @date 2022/11/16 16:22
 * @Description //TODO
 */
public class StudentService {
  StudentDao dao = new StudentDao();
  public List<Student> searchStudentByUid(String stuId) {
    return dao.searchStudentByUid(stuId); }

  public List<Student> searchStudentByName(String stuName) {
    return  dao.searchStudentByName(stuName);
  }

  public List<Student> searchStudentByAge(String stuAge) {
    return  dao.searchStudentByAge(stuAge);
  }

  public List<Student> searchStudentByGender(String stuGender) {
    List<Student> studentList = getAll();
    return dao.searchStudentByGender(stuGender) ;
  }

  public boolean ifRepeat(String uId) {
    List<Student> studentList = getAll();
    return  studentList.stream().filter(a -> a.getuId().equals(uId)).count() > 0 ;
  }

  public void updateStudent(Student stu) {
    dao.update(stu);
  }

  public void delByUid(String uId) {
    dao.removeById(uId);
  }

  public List<Student> getAll() {
    return dao.getAll();
  }

  public void addStudent(Student stu) {
    dao.addStu(stu);
  }
}
