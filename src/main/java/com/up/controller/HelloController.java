package com.up.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return  "hello git 羡慕经理123";
    }

    //我是开发人员，我编写了
}
