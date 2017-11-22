package com.smallhk.spring.dubbo.api;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2017/11/22.
 */
public class Provider {

    public static  void  main(String []args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo-server.xml");
        context.start();
        System.in.read();
    }
}
