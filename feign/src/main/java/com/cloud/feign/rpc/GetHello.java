package com.cloud.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client")//指定调用哪个服务
public interface GetHello {

    /**
     * 调用了ribbon-consumer服务的“/hi”接口
     *
     * 注意：
     * 1、必须加 @RequestParam(value = "name") 否则报错：feign.FeignException: status 400 reading GetHello#restHi(String)
     * 2、方法名可以不同
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String restHi(@RequestParam(value = "name") String name);
}