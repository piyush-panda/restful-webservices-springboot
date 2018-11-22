package com.piyush.training.restfulwebservices.filtering;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by piyush.panda on 22/11/2018.
 */
@RestController
public class DynamicFilteringController {

    @GetMapping("dynamic-filter")
    public MappingJacksonValue retrive(){
        DynamicBean dynamicBean = new DynamicBean("val1", "val2", "val3");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(dynamicBean);
        SimpleFilterProvider filterProvider = new SimpleFilterProvider();
        filterProvider.addFilter("dynamicBeanFilter", SimpleBeanPropertyFilter.filterOutAllExcept("prop1", "prop2"));
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }


    @GetMapping("dynamic-filter-list")
    public MappingJacksonValue retriveList(){
        List<DynamicBean> dynamicBeans = Arrays.asList(new DynamicBean("val1", "val2", "val3"),
                                                        new DynamicBean("val4", "val5","val6"));
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(dynamicBeans);
        SimpleFilterProvider filterProvider = new SimpleFilterProvider();
        filterProvider.addFilter("dynamicBeanFilter", SimpleBeanPropertyFilter.filterOutAllExcept("prop1", "prop3"));
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }
}
