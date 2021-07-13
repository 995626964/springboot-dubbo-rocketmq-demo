package com.springboot.dubbo.com.springboot.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubbo.service.IUserService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = IUserService.class)
public class IUserServiceImpl implements IUserService {
    @Override
    public String sayHello(String name) {
        return "hello:"+name;
    }
}
