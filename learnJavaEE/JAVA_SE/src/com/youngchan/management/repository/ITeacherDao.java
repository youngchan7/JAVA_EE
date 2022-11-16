package com.youngchan.management.repository;

import com.youngchan.management.domain.Teacher;
import java.util.List;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.management.repository
 * @date 2022/11/16 21:40
 * @Description //TODO
 */
public interface ITeacherDao {
  public List<Teacher> getAll();
  public void update(Teacher teacher);
  public List<Teacher> searchByUid(String teacherId);
  public List<Teacher> searchByName(String name);
  public List<Teacher> searchByAge(String teacherAge);
  public List<Teacher> searchTeacherByGender(String teacherGender);
  public void add(Teacher teacher);
  public void removeById(String uId);
}
