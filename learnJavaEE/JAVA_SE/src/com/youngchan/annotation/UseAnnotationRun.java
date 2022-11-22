package com.youngchan.annotation;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.annotation
 * @date 2022/11/22 20:11
 * @Description // 获取 类 成员变量 成员方法  参数 注解
 * Class/method/Field.isAnnotationPresent 判断是否有此注解  Class/method/Field .getAnnotation 获得此注解
 */
public class UseAnnotationRun {
    private Logger logger = LoggerFactory.getLogger(UseAnnotationRun.class);
    @Test
    public void testAnnotation() throws ClassNotFoundException {
        Class useAnnotationClass = Class.forName("com.youngchan.annotation.UseAnnotation");;
        getAnnotationMessageConstractor(useAnnotationClass);
        useAnnotationClass.getDeclaredFields();
        getAnnotationMessageField(useAnnotationClass.getDeclaredFields());
        getAnnotationMessageMethod(useAnnotationClass.getDeclaredMethods());
    }

    private void getAnnotationMessageMethod(Method[] declaredMethods) {
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = (MyAnnotation)method.getAnnotation(MyAnnotation.class);
                System.out.println(myAnnotation.value()+"*******"+myAnnotation.numInt()+"*******"+myAnnotation.numFLoat()+"*******"+myAnnotation.flog());
            }
            for (Parameter parameter : method.getParameters()) {
                if (parameter.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation myAnnotation = (MyAnnotation)parameter.getAnnotation(MyAnnotation.class);
                    System.out.println(myAnnotation.value()+"*******"+myAnnotation.numInt()+"*******"+myAnnotation.numFLoat()+"*******"+myAnnotation.flog());
                }
            }
        }
    }

    private void getAnnotationMessageField(Field[] declaredFields) {
        for (Field fiels : declaredFields) {
            if (fiels.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = (MyAnnotation)fiels.getAnnotation(MyAnnotation.class);
                System.out.println(myAnnotation.value()+"*******"+myAnnotation.numInt()+"*******"+myAnnotation.numFLoat()+"*******"+myAnnotation.flog());
            }
        }
    }

    private static  void getAnnotationMessageConstractor(Class  useAnnotationClass) {
        if (useAnnotationClass.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = (MyAnnotation)useAnnotationClass.getAnnotation(MyAnnotation.class);
                System.out.println(myAnnotation.value()+"*******"+myAnnotation.numInt()+"*******"+myAnnotation.numFLoat()+"*******"+myAnnotation.flog());
        }
    }
}
