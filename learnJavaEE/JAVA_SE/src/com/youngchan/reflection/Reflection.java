package com.youngchan.reflection;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.reflection
 * @date 2022/11/21 20:49
 * @Description //
 */
public class Reflection {
    private String name ;
    private Integer age ;
    public String message ="测试反射";


    private Reflection(String name) {
        System.out.println("私有带参构造方法运行");
        this.name = name;
    }

    public Reflection() {
    }

    private String getMessage(String message,Integer num){
        return  this.message+"方法："+message+num;
    }

    @Override public String toString() {
        return "Reflection{" + "name='" + name + '\'' + ", age=" + age + ", message='" + message + '\'' + '}';
    }
}
