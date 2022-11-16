package com.youngchan.management.service;

import com.youngchan.management.domain.Teacher;
import com.youngchan.management.repository.impl.TeacherDao;
import java.util.List;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.teachermanagement.service
 * @date 2022/11/16 16:22
 * @Description //TODO
 */
public class TeacherService {

  TeacherDao dao = new TeacherDao();

  public List<Teacher> searchTeacherByUid(String stuId) {
    return dao.searchByUid(stuId);
  }

  public List<Teacher> searchTeacherByName(String stuName) {
    return dao.searchByName(stuName);
  }

  public List<Teacher> searchTeacherByAge(String stuAge) {
    return dao.searchByAge(stuAge);
  }

  public List<Teacher> searchTeacherByGender(String stuGender) {
    List<Teacher> teacherList = getAll();
    return dao.searchTeacherByGender(stuGender);
  }

  public boolean ifRepeat(String uId) {
    List<Teacher> teacherList = getAll();
    return teacherList.stream().filter(a -> a.getuId().equals(uId)).count() > 0;
  }

  public void updateTeacher(Teacher teacher) {
    dao.update(teacher);
  }

  public void delByUid(String uId) {
    dao.removeById(uId);
  }

  public List<Teacher> getAll() {
    return dao.getAll();
  }

  public void addTeacher(Teacher teacher) {
    dao.add(teacher);
  }
}
