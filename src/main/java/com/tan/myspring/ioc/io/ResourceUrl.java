package com.tan.myspring.ioc.io;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ClassName ResourceUrl
 * @Description TODO
 * @Author tan
 * @Date 2020/7/9 17:08
 * @Version 1.0
 **/
public class ResourceUrl implements Resource{
    /**
     * 类库URL
     */
    private final URL url;

    /**
     * 需要一个类库URL
     */
    public ResourceUrl(URL url) {
        this.url = url;
    }

    /**
     * 从URL中获取输入流
     */
    @Override
    public InputStream getInputstream() throws Exception {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();

    }
}
