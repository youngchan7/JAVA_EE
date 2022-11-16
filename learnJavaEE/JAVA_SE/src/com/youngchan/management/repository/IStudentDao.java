package com.youngchan.management.repository;

import com.youngchan.management.domain.Student;
import java.util.List;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.management.repository
 * @date 2022/11/16 21:34
 * @Description //TODO
 */
public interface IStudentDao {
  default void testDefaultMethod(){
    System.out.println("这是默认方法");
  }
  static void sayOut(){
    System.out.println("这是静态方法");
  }

  public List<Student> getAll();
  public void update(Student stu);
  public List<Student> searchByUid(String stuId);
  public List<Student> searchByName(String name);
  public List<Student> searchByAge(String stuAge);
  public List<Student> searchByGender(String stuGender);
  public void add(Student stu);
  public void removeById(String uId);
}
