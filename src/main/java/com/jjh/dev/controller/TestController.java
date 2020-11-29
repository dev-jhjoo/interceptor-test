package com.jjh.dev.controller;

import com.jjh.dev.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getTest(){
        return new TestService().getTest();
    }

}
