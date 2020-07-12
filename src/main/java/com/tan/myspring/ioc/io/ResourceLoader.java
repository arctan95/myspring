package com.tan.myspring.ioc.io;

import java.net.URL;

/**
 * @ClassName ResourceLoader
 * @Description 资源加载器
 * @Author tan
 * @Date 2020/7/9 17:06
 * @Version 1.0
 **/
public class ResourceLoader {
    /**
     * 给定一个位置， 使用类加器的资源加载URL，并创建一个“资源URL”对象，便于获取输入流
     */
    public ResourceUrl getResource(String location) {
        URL url = this.getClass().getClassLoader().getResource(location);
        return new ResourceUrl(url);
    }
}
