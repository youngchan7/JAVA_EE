package com.youngchan;

import java.util.stream.Collectors;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan
 * @date 2022/11/13 18:27
 * @Description //TODO
 */
public class MethonReview {
    public static void main(String[] args) {
         int[] ints =new int[] {1, 2, 3, 4, 5};
//        StringUtils.join(ints , ",");
        System.out.println(printArray(ints));
    }

    private  static  String  printArray(int[] ints) {
        StringBuffer sb = new StringBuffer("[");
        for (int anInt : ints) {
            sb.append(anInt).append(",");
        }
        sb.replace(sb.length()-1,sb.length(),"]");
        return sb.toString();
    }
}
