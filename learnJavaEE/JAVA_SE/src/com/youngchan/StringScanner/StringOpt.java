package com.youngchan.StringScanner;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.api
 * @date 2022/11/14 17:53
 * @Description // 字符串的使用  String  stringbuilder stringbuffer
 */
public class StringOpt {

    public static void main(String[] args) {
        //  String变量+字符串 ！= 变量值+字符串
        //    stringUse();
        //   三次用户登录退出  scanner  for循环
        //    Courseware.login();
        // 前台输入字符串  转为字符数组输出
        //  Courseware.getCharArray();
        // 统计输入的大写小写数字
        // Courseware.countCharScope();
        // 正则表达式校验手机号  并将手机号加*展示
        // Courseware.replacePhone();
        // 将固定的字符串转换为*  用于文明用语
        // Courseware.replaceString();
        //  切割字符串 注意 字符串split方法  . 的使用 要换成 \\. 转译
        // Courseware.SplitString();
        // StringBuffer 使用  注意 = 赋值的是地址值
        // stringBufferTest();
        // Stringbuild 翻转字符串
        // Courseware.symmetryString();
        // 把int数组 转换为 [1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 10] 输出
        // Courseware.appendStringByArray(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 10);
    }

    /**
     * @return
     * @Author youngchan
     * @Description //stringBufferTest 使用 注意 = 赋值的是地址值
     * @Date 17:16 2022/11/22
     * @param    null
     **/
    private static void stringBufferTest() {
        System.out.println(new StringBuffer());
        StringBuffer x = new StringBuffer("123");
        StringBuffer y = x;
        System.out.println(x == y);
        y.append("222");
        System.out.println(x);
    }

    /**
     * @return
     * @Author youngchan
     * @Description //注意 变量+字符串 不在常量池
     * @Date 17:16 2022/11/22
     * @param    null
     **/
    private static void stringUse() {
        //    new ScannerApi().inOutString();
        String a = "123";
        String b = "12";
        String c = b + "3";
        System.out.println(a == c);
        System.out.println(a == c.intern());
        System.out.println(a.equals(c));
    }

}
