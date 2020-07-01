package com.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

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

    @GetMapping(value = "testAdvice")
    public String testAdvice(@ModelAttribute("user") String user, Date date) throws Exception {
        System.out.println("user: " + user);
        System.out.println("date: " + date);
        throw new Exception("直接抛出异常");
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
