package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：weizheng
 * @date ：Created in 2020/6/30 15:50
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class HelloWorld {

    private String name;

    public HelloWorld() {
        System.out.println("helloWorld start running ...");
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @RequestMapping("/error")
    public String error() {
        int a = 100 / 0;
        return "100 / 0 = " + a;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
