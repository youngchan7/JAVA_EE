package com.youngchan.management.repository.impl;

import com.youngchan.management.domain.Teacher;
import com.youngchan.management.repository.ITeacherDao;
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
public class TeacherDao extends BaseManagerDao implements ITeacherDao {
private static  List<Teacher> teacherList = new ArrayList<>();
  public List<Teacher> searchByUid(String stuId) {
    return teacherList.stream().filter(a -> a.getuId().equals(stuId)).collect(Collectors.toList());
  }

  public List<Teacher> searchByName(String stuName) {
    return teacherList.stream().filter(a -> a.getName().equals(stuName)).collect(Collectors.toList());
  }

  public List<Teacher> searchByAge(String stuAge) {
    return teacherList.stream().filter(a -> a.getAge() == Integer.parseInt(stuAge)).collect(Collectors.toList());

  }

  public List<Teacher> searchTeacherByGender(String stuGender) {
    return teacherList.stream().filter(a -> a.getGender().equals(stuGender)).collect(Collectors.toList());
  }

  public void update(Teacher teacher) {
    removeById(teacher.getuId());
    teacherList.add(teacher);
  }

  public void removeById(String uId) {
    int index = 0;
    for (int i = 0; i < teacherList.size(); i++) {
      if (teacherList.get(i).getuId().equals(uId)) {
        index = i;
      }
    }
    teacherList.remove(index);
  }

  public List<Teacher> getAll() {
    return teacherList;
  }

  public void add(Teacher teacher) {
    teacherList.add(teacher);
  }
}
