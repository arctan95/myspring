package com.tan.myspring.ioc.io;

import java.io.InputStream;

/**
 * @ClassName Resource
 * @Description 资源定义
 * @Author tan
 * @Date 2020/7/9 17:09
 * @Version 1.0
 **/
public interface Resource {
    /**
     * 获取输入流
     */
    InputStream getInputstream() throws Exception;
}
