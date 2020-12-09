package com.example.order.config;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.example.order.exception.ExceptionUtil;
import com.example.order.feign.impl.IntegralFallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class FeignConfiguration {
    @Bean
    public IntegralFallback echoServiceFallback() {
        return new IntegralFallback();
    }

    @Bean
    @SentinelRestTemplate(blockHandler = "handleException", blockHandlerClass = ExceptionUtil.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
