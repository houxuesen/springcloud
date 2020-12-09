package com.example.order.service.impl;

import com.example.order.feign.IntegralFeign;
import com.example.order.service.OrderService;
import com.example.order.feign.StockFeign;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private StockFeign stockFeign;

    @Autowired
    private IntegralFeign integralFeign;

    @Override
    @GlobalTransactional
    public String addOrder(String orderId) {
        System.out.println("添加订单"+orderId);
        stockFeign.delStock(orderId);
        integralFeign.addIntegral(orderId,"1");
        return "success";
    }
}
