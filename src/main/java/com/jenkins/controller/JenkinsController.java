package com.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jks")
public class JenkinsController {

    @RequestMapping("testtlf")
    public String tlf(ModelMap map){
        map.put("name","hello world");
        return "testThymelef";
    }
}
