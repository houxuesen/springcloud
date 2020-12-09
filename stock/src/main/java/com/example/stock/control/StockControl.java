package com.example.stock.control;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class StockControl {
    @GetMapping("/stockControl/delStock/{oderId}")
    public void delStock(@PathVariable String oderId){
        System.out.println("库存减少1，订单编号："+oderId);
    }
}
