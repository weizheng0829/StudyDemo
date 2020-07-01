package com.example.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：weizheng
 * @date ：Created in 2020/7/1 9:05
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class TestControllerException {


    @RequestMapping("/conError")
    public String conError() {
        int a = 1 / 0;
        return "this is conError" + a;
    }

//    /**
//     * 单个controller进行异常处理
//     * @param e
//     * @return
//     */
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public String exceptionHandler(Exception e) {
//        System.out.println(e);
//        return "这是controller内的异常处理方法 。。。 ";
//    }
}
