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
        System.out.println("asdflas;fjasfdj");
        System.out.println("dfasf");
        System.out.println("asdflas;fjasfdj");
        return "sadfaaaa";
    }

    @RequestMapping("/hello2")
    public String test2(){
        System.out.println("eclipse");
        return "success";
    }

    @RequestMapping("/hello3")
    public String hello(){
        System.out.println("idea新增了一个方法");
        System.out.println(" aaaa ");
        System.out.println("hehe");
        return "success";
    }
}
