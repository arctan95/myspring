package com.tan.myspring.ioc;

import com.tan.myspring.ioc.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName AbstractBeanDefinitionReader
 * @Description 抽象的bean定义读取类
 * @Author tan
 * @Date 2020/7/9 17:05
 * @Version 1.0
 **/
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{
    /**
     * 注册bean容器
     */
    private Map<String, BeanDefinition> registry;

    /**
     * 资源加载器
     */
    private ResourceLoader resourceLoader;

    /**
     * 构造器器必须有一个资源加载器， 默认插件创建一个map容器
     *
     * @param resourceLoader 资源加载器
     */
    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<>();
        this.resourceLoader = resourceLoader;
    }

    /**
     * 获取容器
     */
    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    /**
     * 获取资源加载器
     */
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
