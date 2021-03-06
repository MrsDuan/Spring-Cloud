package com.funtl.hello.spring.cloud.web.admin.ribbon.controller;

import com.funtl.hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    private String sayHi(String message){
        return adminService.sayHi(message);
    }
}
