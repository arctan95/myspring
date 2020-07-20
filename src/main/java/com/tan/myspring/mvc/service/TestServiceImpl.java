package com.tan.myspring.mvc.service;

/**
 * @ClassName TestServiceImpl
 * @Description TODO
 * @Author tan
 * @Date 2020/7/20 16:41
 * @Version 1.0
 **/
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("test方法被调用");
    }
}
