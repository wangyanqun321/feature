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

    @RequestMapping("/hello2")
    public String test2(){
        System.out.println("eclipse新增代码");
        return "success";
    }

    @RequestMapping("/hello3")
    public String hello(){
        System.out.println("idea新增了一个方法");
        System.out.println("idea TestController.hello");
        return "success";
    }

}
