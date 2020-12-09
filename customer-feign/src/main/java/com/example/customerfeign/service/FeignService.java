package com.example.customerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-producer")
public interface FeignService {
    @GetMapping(value = "/echo/{message}")
    String getMessage(@PathVariable("message") String message);
}
