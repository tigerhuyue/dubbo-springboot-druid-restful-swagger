package com.station.grid.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.station.grid.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Reference
    private UserService userservicedto;

    @RequestMapping("/getuser")
    public String sayHello(@RequestParam String name) {
        return userservicedto.getUserName(name);
    }
}
