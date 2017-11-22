package com.smallhk.spring.dubbo.controller;

import com.smallhk.spring.dubbo.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/22.
 */
@SuppressWarnings("ALL")
@RestController
public class DubboController {

    /**
     *
     */
    @Resource
    private DemoService demoService;

    /**
     * dubbo客户端消费
     * @param name
     * @return
     */
    @RequestMapping(value = "dubbo/consumer/{name}")
    @ResponseBody
    public Map<String,Object> consumer(@PathVariable String name){
        Map<String,Object> resultMap = new HashMap<String, Object>();
        resultMap.put("data",demoService.sayHello(name));
        return resultMap;
    }
}
