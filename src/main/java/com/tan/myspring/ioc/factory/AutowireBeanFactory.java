package com.tan.myspring.ioc.factory;

import com.tan.myspring.ioc.BeanDefinition;
import com.tan.myspring.ioc.BeanReference;
import com.tan.myspring.ioc.PropertyValue;

import java.lang.reflect.Field;

/**
 * @ClassName AutowireBeanFactory
 * @Description TODO
 * @Author tan
 * @Date 2020/7/11 17:17
 * @Version 1.0
 **/
public class AutowireBeanFactory extends AbstractBeanFactory {
    @Override
    Object doCreate(BeanDefinition beandefinition) throws Exception {
        Object bean = beandefinition.getBeanclass().newInstance();
        addPropertyValue(bean, beandefinition);
        return bean;
    }

    protected void addPropertyValue(Object bean, BeanDefinition beandefinition) throws Exception {
        // 循环给定 bean 的属性集合
        for (PropertyValue pv : beandefinition.getPropertyValues().getPropertyValues()) {
            // 根据给定属性名称获取 给定的bean中的属性对象
            Field declaredField = bean.getClass().getDeclaredField(pv.getname());
            // 设置属性的访问权限
            declaredField.setAccessible(true);
            // 获取定义的属性中的对象
            Object value = pv.getvalue();
            // 判断这个对象是否是 BeanReference 对象
            if (value instanceof BeanReference) {
                // 将属性对象转为 BeanReference 对象
                BeanReference beanReference = (BeanReference) value;
                // 调用父类的 AbstractBeanFactory 的 getBean 方法，根据bean引用的名称获取实例，此处即是递归
                value = getBean(beanReference.getName());
            }
            // 反射注入bean的属性
            declaredField.set(bean, value);
        }

    }
}
