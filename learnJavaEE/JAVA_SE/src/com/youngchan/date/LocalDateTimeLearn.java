package com.youngchan.date;

import com.youngchan.ClassReview.animaltest.Cat;
import com.youngchan.management.domain.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.date
 * @date 2022/11/18 16:22
 * @Description //
 * LocalDateTime 的使用  LocalDateTime.now()  withMonth
 * DateTimeFormatter 的使用 DateTimeFormatter.ofPattern("yyyyy-MM");
 */
public class LocalDateTimeLearn {

  public static void main(String[] args) throws ParseException {
    LocalDateTime nowDate = LocalDateTime.now();
    System.out.println(nowDate);
    LocalDateTime newDate = nowDate.withMonth(10);
    System.out.println(newDate);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyy-MM");
//    SimpleDateFormat f = new SimpleDateFormat("yyyyy-MM");
//    System.out.println(f.parse("122"));
//
    System.out.println(2/0);
  }
}
