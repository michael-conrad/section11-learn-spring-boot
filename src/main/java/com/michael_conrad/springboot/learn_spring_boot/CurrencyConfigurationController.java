package com.michael_conrad.springboot.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    public void setConfiguration(CurrentServiceConfiguration configuration) {
        this.configuration = configuration;
    }

    private CurrentServiceConfiguration configuration;

    @RequestMapping("/currency-configuration")
    public CurrentServiceConfiguration retrieveAllCourses() {
        return configuration;
    }
}
