package com.tan.myspring.mvc.controller;

import com.tan.myspring.mvc.annotation.MyAutowired;
import com.tan.myspring.mvc.annotation.MyController;
import com.tan.myspring.mvc.annotation.MyRequestMapping;
import com.tan.myspring.mvc.annotation.MyRequestParam;
import com.tan.myspring.mvc.service.TestService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author tan
 * @Date 2020/7/20 16:42
 * @Version 1.0
 **/
@MyController
public class TestController {

    @MyAutowired
    private TestService testService;


    @MyRequestMapping("/test")
    public void test(HttpServletRequest req, HttpServletResponse resp, @MyRequestParam("name") String name) throws Exception {
        System.out.println("请求参数值：" + name);
        resp.getWriter().write("<h1>Response success!</h1>");
        testService.test();
    }
}
