package com.tan.myspring.ioc.factory;

import com.tan.myspring.ioc.BeanDefinition;

/**
 * @ClassName BeanFactory
 * @Description TODO
 * @Author tan
 * @Date 2020/7/9 16:32
 * @Version 1.0
 **/
public interface BeanFactory {
    /**
     * @description 根据bean的名称从容器中获取bean对象
     * @author tan
     * @date 2020/7/9 16:34
     * @param name
     * @return java.lang.Object
     **/
    Object getBean(String name) throws Exception;
    /**
     * @description 将bean注册到容器中
     * @author tan
     * @date 2020/7/9 16:34
     * @param name
     * @param bean
     * @return void
     **/
    void registerBeanDefinition(String name, BeanDefinition bean) throws Exception;
}
