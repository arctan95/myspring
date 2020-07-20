package com.tan.myspring.mvc.annotation;

import java.lang.annotation.*;

/**
 * @ClassName MyRequestParam
 * @Description TODO
 * @Author tan
 * @Date 2020/7/20 16:21
 * @Version 1.0
 **/
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {
    String value() default "";
}
