package com.cloud.ribbon.controller;

import com.cloud.ribbon.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private Service service;

    @GetMapping("/hello")
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return service.hiService(name);
    }
}
