package com.smallhk.spring.dubbo.api.provider;

import com.smallhk.spring.dubbo.api.DemoService;

/**
 * @author  eric
 */
public class DemoServiceImpl implements DemoService {
    /**
     * say hello to the given name
     *
     * @param name
     * @return
     */
    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
