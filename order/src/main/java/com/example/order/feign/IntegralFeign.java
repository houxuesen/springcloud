package com.example.order.feign;

import com.example.order.config.FeignConfiguration;
import com.example.order.feign.impl.IntegralFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "integral-service", fallback = IntegralFallback.class ,configuration = FeignConfiguration.class )
public interface IntegralFeign {
    // 两个坑：1. @GetMapping不支持
    // 2. @PathVariable得设置value
    @RequestMapping(value = "/integralControl/addIntegral/{orderId}/{integral}", method = RequestMethod.GET)
    public String addIntegral(@PathVariable("orderId") String orderId, @PathVariable("integral") String integral);
}
