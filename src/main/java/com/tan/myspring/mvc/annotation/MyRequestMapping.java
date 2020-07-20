package com.tan.myspring.mvc.annotation;

import java.lang.annotation.*;

/**
 * @ClassName MyRequestMapping
 * @Description TODO
 * @Author tan
 * @Date 2020/7/20 16:00
 * @Version 1.0
 **/
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {
    String value() default "";
}
