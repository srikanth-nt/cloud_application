package com.srikanth.cloud_application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.cloud_application.controller.vo.MyResponse;

@RestController
public class MyController {

    @GetMapping("/helloworld")
    public MyResponse getHelloWorld() {
        return MyResponse.builder().message("Hello World!").build();
    }

}
