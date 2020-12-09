package com.example.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "stock-service")
public interface StockFeign {

    @RequestMapping(value = "/stockControl/delStock/{orderId}",method = RequestMethod.GET)
    public String delStock(@PathVariable("orderId") String orderId);
}
