package com.youngchan.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.annotation
 * @date 2022/11/22 19:58
 * @Description //TODO
 */
@Target({ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.TYPE,ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    public int numInt() default 10;
    public String value() ;
    public boolean flog() default true;
    public float numFLoat() default 10.1f;
}
