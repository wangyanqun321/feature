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
        System.out.println("新增代码");
		System.out.println("fdsafa");
		System.out.println("eclipse");
        System.out.println("eclipse又新增了一行代码");
        return "success";
    }

    @RequestMapping("/hello3")
    public String hello(){
        System.out.println("idea新增了一个方法");
        System.out.println(" update ");
        System.out.println("哈哈哈");
        System.out.println("hehe");
		System.out.println("Creating a new branch is quick AND simple.");
        return "success";
    }
    
}
