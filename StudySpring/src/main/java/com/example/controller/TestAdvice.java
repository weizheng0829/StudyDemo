package com.example.controller;

import com.example.BussinessException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：weizheng
 * @date ：Created in 2020/7/1 11:25
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class TestAdvice {

    @RequestMapping("testException")
    public String testException() throws Exception{
        throw new MissingServletRequestParameterException("name","String");
    }

    @RequestMapping("testBussinessException")
    public String testMyException() throws BussinessException {
        throw new BussinessException("i am a BussinessException");
    }
}
