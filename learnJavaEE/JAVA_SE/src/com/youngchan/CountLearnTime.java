package com.youngchan;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan
 * @date 2022/11/19 10:42
 * @Description //TODO
 */
public class CountLearnTime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inData, countTime=0;
//    System.out.println(new BigDecimal(221).divide(new BigDecimal(31),BigDecimal.ROUND_UP));
    countTime(sc, countTime);
  }

  private static void countTime(Scanner sc, int countTime) {
    Double inData;
    Go:
    {
      while (true) {
        System.out.println("输入金额");
        inData = Double.parseDouble(sc.next());
        if (inData == 0) {
          System.out.println("总时长为");
          System.out.println(countTime);
          break Go;
        } else {
          countTime += inData;
        }
      }
    }
  }
}

