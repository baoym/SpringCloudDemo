package com.cloud.feign.controller;

import com.cloud.feign.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private GetHello getHello;

    //对外暴露一个"/hi"的API接口，通过getHello来消费服务
    @GetMapping("/hi")
    public String sayHello(String name){
        return getHello.restHi(name);
    }

}
