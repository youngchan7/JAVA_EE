package com.youngchan.annotation;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.annotation
 * @date 2022/11/22 20:04
 * @Description //添加注解  注解的具体使用方式
 */
@MyAnnotation(value = "我的注解类",flog = false,numFLoat = 6.6f)
public class UseAnnotation {
    @MyAnnotation(value = "我的成员变量注解",numInt = 1)
    private String name;
    @MyAnnotation(value = "我的成员变量注解",numInt = 2)
    private String phoneNum;


    public UseAnnotation() {
    }
    @MyAnnotation("我的构造方法注解")
    public UseAnnotation(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }
    @MyAnnotation("我的成员方法注解")
    public void testAnnotation(@MyAnnotation("我的参数注解") String message){
        @MyAnnotation("我的局部变量注解")
        int age =10;
    }
}
