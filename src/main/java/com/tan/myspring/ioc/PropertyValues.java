package com.tan.myspring.ioc;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PropertyValues
 * @Description TODO
 * @Author tan
 * @Date 2020/7/9 16:38
 * @Version 1.0
 **/
public class PropertyValues {

    /**
     * 属性list
     */
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    /**
     * 默认构造器
     */
    public PropertyValues() {
    }

    /**
     * 添加进属性集合
     */
    public void addPropertyValue(PropertyValue pv) {
        propertyValueList.add(pv);
    }

    /**
     * 获取属性集合
     */
    public List<PropertyValue> getPropertyValues() {
        return propertyValueList;
    }
}
