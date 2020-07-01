package com.example;

import com.example.controller.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：weizheng
 * @date ：Created in 2020/6/30 15:50
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {

    public static void main(String[] args) {
//        HelloWorld hw = new HelloWorld();
//        hw.setName("java");
//        hw.hello();

        //1.创建spring的ioc容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        //2.从ioc容器中获取bean实例
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.hello("world");
    }
}
