package com.youngchan.management.repository;

import com.youngchan.management.domain.Person;
import com.youngchan.management.repository.impl.BaseManagerDao;
import com.youngchan.management.repository.impl.StudentDao;
import com.youngchan.management.repository.impl.TeacherDao;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.management.repository
 * @date 2022/11/16 23:32
 * @Description //TODO
 */
public class ReposetoryFactory {
    public static BaseManagerDao getReposetory (){
      return new StudentDao();
    }
    public static BaseManagerDao getReposetory2 (){
      return new TeacherDao();
    }
}
