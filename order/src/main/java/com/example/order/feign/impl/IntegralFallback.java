package com.example.order.feign.impl;

import com.example.order.feign.IntegralFeign;
import org.springframework.stereotype.Component;

@Component
public class IntegralFallback implements IntegralFeign {
    @Override
    public String addIntegral(String orderId, String integral) {
        System.out.println("调用增加积分接口失败："+orderId+"积分："+integral);
        return "error";
    }
}
