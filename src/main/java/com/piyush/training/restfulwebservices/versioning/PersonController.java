package com.piyush.training.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by piyush.panda on 27/11/2018.
 */
@RestController
public class PersonController {


    @GetMapping("person/v1")
    public PersonV1 getPersonV1(){
        return new PersonV1("Joe Bloggs");
    }

    @GetMapping("person/v2")
    public PersonV2 getPersonV2(){
        return new PersonV2("Joe", "Bloggs");
    }

    @GetMapping(value = "person/param", params = "version=1")
    public PersonV1 getPersonParamV1(){
        return new PersonV1("Joe Bloggs");
    }

    @GetMapping(value = "person/param", params = "version=2")
    public PersonV2 getPersonParamV2(){
        return new PersonV2("Joe", "Bloggs");
    }

    @GetMapping(value = "person/header", headers = "X-API-VERSION=1")
    public PersonV1 getPersonHeaderV1(){
        return new PersonV1("Joe Bloggs");
    }

    @GetMapping(value = "person/header", headers = "X-API-VERSION=2")
    public PersonV2 getPersonHeaderV2(){
        return new PersonV2("Joe", "Bloggs");
    }

    @GetMapping(value = "person/produces", produces = "application/com.practice.app-v1+json")
    public PersonV1 getPersonProducesV1(){
        return new PersonV1("Joe Bloggs");
    }

    @GetMapping(value = "person/produces", produces = "application/com.practice.app-v2+json")
    public PersonV2 getPersonProducesV2(){
        return new PersonV2("Joe", "Bloggs");
    }
}
