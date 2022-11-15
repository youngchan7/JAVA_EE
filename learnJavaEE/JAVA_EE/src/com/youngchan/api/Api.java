package com.youngchan.api;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.api
 * @date 2022/11/14 17:53
 * @Description //TODO
 */
public class Api {

  public static void main(String[] args) {

//    stringUse();

//    Courseware.login();
//    Courseware.traverseString2();
//     Courseware.countCharScope();
//    Courseware.replacePhone();
//    Courseware.replaceString();
//    Courseware.SplitString();
//    stringBufferTest();
//    Courseware.symmetryString();
    Courseware.appendStringByArray(1,2,3,4,5,5,6,7,8,9,9,10,11);
  }

  private static void stringBufferTest() {
    System.out.println(new StringBuffer());
    StringBuffer x = new StringBuffer("123");
    StringBuffer y = x ;
    System.out.println(x == y);
    y.append("222");
    System.out.println(x);
  }

  private static void stringUse() {
    //    new ScannerApi().inOutString();
    String a = "123";
    String b = "12";
    String c = b+"3";
    System.out.println(a == c);
    System.out.println(a == c.intern());
    System.out.println(a.equals(c));
  }

}
