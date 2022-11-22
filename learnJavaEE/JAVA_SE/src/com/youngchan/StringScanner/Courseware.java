package com.youngchan.StringScanner;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.api
 * @date 2022/11/14 20:56
 * @Description // 序列化
 */
public class Courseware implements Serializable {

    private static final long serialVersionUID = 1L;
    public final static String loginName = "youngchan";
    public final static String passWord = "shanyanheng7";
    private String testg;

    /**
     * @return
     * @Author youngchan
     * @Description //用户登录
     * @Date 17:19 2022/11/22
     * @param    null
     **/
    public static void login() {
        int i = 3;
        Scanner scName = new Scanner(System.in);
        Scanner scPassWord = new Scanner(System.in);
        systemIn(i, scName, scPassWord);
    }

    private static void systemIn(int i, Scanner scName, Scanner scPassWord) {
        while (true) {

            System.out.println("登录请输入用户名： 退出请输入 0 ");
            String userName = scName.nextLine();
            if (userName.equals("0")) {
                break;
            }
            if (!loginName.equals(userName)) {
                System.out.println("用户不存在");
                continue;
            }
            System.out.println("请输入密码：");
            String pD = scPassWord.nextLine();
            if (!pD.equals(passWord)) {
                i--;
                if (i == 0) {
                    System.out.println("密码错误次数过多，退出系统");
                    break;
                }
                System.out.println("密码输入有误：还有" + i + "次机会可以尝试");

                continue;
            }
            System.out.println("登录成功！ ");
        }
    }

    public static String inString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        return sc.nextLine();
    }

    public static void traverseString() {
        String ts = inString();
        for (int i = 0; i < ts.length(); i++) {
            System.out.println(ts.charAt(i));
        }
    }

    public static void getCharArray() {
        String ts = inString();
        for (char c : ts.toCharArray()) {
            System.out.println(c);
        }
    }

    /**
     * @Author youngchan
     * @Description // 统计 大写 小写  数字的个数
     * @Date 21:38 2022/11/14
     **/
    public static void countCharScope() {
        String ts = inString();
        System.out.println(ts);
        int lowerCount = 0;
        int upperCount = 0;
        int numCount = 0;
        for (int i = 0; i < ts.length(); i++) {
            int intNum = ts.charAt(i);
            if ((int)'a' <= intNum && intNum <= (int)'z') {
                lowerCount++;
                continue;
            }
            if ((int)'A' <= intNum && intNum <= (int)'Z') {
                upperCount++;
                continue;
            }
            if ((int)'0' <= intNum && intNum <= (int)'9') {
                numCount++;
            }
        }
        System.out.println("大写：" + upperCount);
        System.out.println("小写：" + lowerCount);
        System.out.println("数字：" + numCount);
    }

    /**
     * @return
     * @Author youngchan
     * @Description //电话 校验 敏感信息隐藏
     * @Date 17:20 2022/11/22
     * @param    null
     **/
    public static void replacePhone() {
        String phoneNum = inString();
        if (!Pattern.matches("^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$",
            phoneNum)) {
            System.out.println("手机号输入有误");
        }
        //    (0,3) [0,3)
        String substring = phoneNum.substring(7);
        String substring1 = phoneNum.substring(0, 3);
        System.out.println(substring1 + "****" + substring);
        System.out.println(new StringBuffer(phoneNum).replace(3, 7, "****").toString());
    }

    /**
     * @return
     * @Author youngchan
     * @Description //敏感信息隐藏
     * @Date 17:20 2022/11/22
     * @param    null
     **/
    public static void replaceString() {
        System.out.println(inString().replace("tmd", "****"));
    }

    /**
     * @return
     * @Author youngchan
     * @Description //字符串切割
     * @Date 17:20 2022/11/22
     * @param    null
     **/
    public static void SplitString() {
        String[] split = inString().split(",");
        for (String s : split) {
            System.out.println(s);
        }
    }

    /**
     * @return
     * @Author youngchan
     * @Description //字符串反转
     * @Date 17:20 2022/11/22
     * @param    null
     **/
    public static void symmetryString() {
        StringBuilder s = new StringBuilder(inString());
        System.out.println(s.toString().equals(s.reverse().toString()));
    }

    /**
     * @return
     * @Author youngchan
     * @Description // 数组 输出
     * @Date 17:21 2022/11/22
     * @param    null
     **/
    public static void appendStringByArray(int... array) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i : array) {
            stringBuilder.append(i).append(",");
        }
        stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), "]");
        System.out.println(stringBuilder.toString());

        stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < array.length; i++) {

            stringBuilder.append(array[i]);
            if (i == array.length - 1) {
                stringBuilder.append("]");
            } else {
                stringBuilder.append(",");
            }
        }
        System.out.println(stringBuilder.toString());

    }
}
