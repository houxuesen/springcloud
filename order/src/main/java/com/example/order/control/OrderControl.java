package com.example.order.control;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.order.exception.ExceptionUtil;
import com.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderControl {

    @Autowired
    private OrderService orderService;

    @SentinelResource(value = "addOrder",blockHandler = "exceptionHandler", blockHandlerClass = { ExceptionUtil.class })
    @GetMapping("/orderControl/addOrder/{orderId}")
    public String addOrder(@PathVariable String orderId){
        orderService.addOrder(orderId);
        return "success";
    }
}
