package com.piyush.training.restfulwebservices.versioning;

/**
 * Created by piyush.panda on 27/11/2018.
 */
public class PersonV1 {

    private String name;

    public PersonV1() {
    }

    public PersonV1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
