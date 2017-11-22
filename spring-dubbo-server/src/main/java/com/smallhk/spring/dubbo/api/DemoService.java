package com.smallhk.spring.dubbo.api;

/**
 * dubbo服务端-api层
 * @author eric
 *
 */
public  interface  DemoService{
    /**
     * say hello to the given name
     * @param name
     * @return
     */
      String sayHello(String name);
}
