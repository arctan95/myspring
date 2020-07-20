package com.tan.myspring.mvc.annotation;

import java.lang.annotation.*;

/**
 * @ClassName MyController
 * @Description TODO
 * @Author tan
 * @Date 2020/7/20 15:57
 * @Version 1.0
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {
    String value() default "";
}
