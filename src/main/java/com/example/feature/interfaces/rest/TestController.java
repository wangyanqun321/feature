package com.example.feature.interfaces.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController: TestController
 *
 * @author wangyanqun 2019/5/21
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String test(){
        System.out.println("hello");
        return "success";
    }
}
