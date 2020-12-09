package com.example.customerfeign.control;

import com.example.customerfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerFeignController {

    @Autowired
    private FeignService feignService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/echo/getConsumer")
    public String getConsumer(){
       return  feignService.getMessage(port);
    }

}
