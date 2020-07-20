package com.tan.myspring.mvc.annotation;

import java.lang.annotation.*;

/**
 * @ClassName MyAutowired
 * @Description TODO
 * @Author tan
 * @Date 2020/7/20 16:36
 * @Version 1.0
 **/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAutowired {
    String value() default "";
}
