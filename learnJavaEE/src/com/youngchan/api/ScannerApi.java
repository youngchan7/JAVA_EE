package com.youngchan.api;

import java.util.Scanner;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.api
 * @date 2022/11/14 17:53
 * @Description //TODO
 */
public class ScannerApi {
  public void inOutString(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入：");
    String out = scanner.nextLine();
    System.out.println(out);

  }
}
