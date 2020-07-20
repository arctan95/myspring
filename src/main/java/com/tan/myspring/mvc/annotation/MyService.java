package com.tan.myspring.mvc.annotation;

import java.lang.annotation.*;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author tan
 * @Date 2020/7/20 16:20
 * @Version 1.0
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyService {
    String value() default "";
}
