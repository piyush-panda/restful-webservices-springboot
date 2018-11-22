package com.piyush.training.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

/**
 * Created by piyush.panda on 22/11/2018.
 */
@JsonFilter("dynamicBeanFilter")
public class DynamicBean {

    private final String prop1;
    private final String prop2;
    private final String prop3;

    public DynamicBean(String prop1, String prop2, String prop3) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
    }

    public String getProp1() {
        return prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public String getProp3() {
        return prop3;
    }


}
