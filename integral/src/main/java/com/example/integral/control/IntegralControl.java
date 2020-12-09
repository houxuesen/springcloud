package com.example.integral.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegralControl {
    @GetMapping("/integralControl/addIntegral/{orderId}/{integral}")
    public String addIntegral(@PathVariable String orderId,@PathVariable String  integral){
        System.out.println("订单:"+orderId+"增加积分:"+integral);
        return "success";
    }
}
