package com.youngchan.management.domain;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.management.domain
 * @date 2022/11/16 23:19
 * @Description //TODO
 */
public class PersonFactory {
    public static  Person getPerson(){
      return new Student();
    }
}
