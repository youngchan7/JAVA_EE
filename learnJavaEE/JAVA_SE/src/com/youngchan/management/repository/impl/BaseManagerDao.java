package com.youngchan.management.repository.impl;

import com.youngchan.management.domain.Person;
import com.youngchan.management.domain.Student;
import com.youngchan.management.domain.Teacher;
import java.util.List;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.management.repository.impl
 * @date 2022/11/16 23:22
 * @Description //TODO
 */
public abstract class BaseManagerDao {

  public abstract void removeById(String uId);

}
