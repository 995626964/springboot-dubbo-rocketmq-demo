package com.springboot.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubbo.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Reference
    private IUserService iUserService;

    @RequestMapping("/sayHello")
    public String sayHello(String name){
        return iUserService.sayHello(name);
    }
}
