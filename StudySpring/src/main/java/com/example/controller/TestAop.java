package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：weizheng
 * @date ：Created in 2020/7/1 15:13
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class TestAop {

    @RequestMapping(value = "testAopLog")
    public String testAopLog() {
        return "测试AOP打印log";
    }
}
