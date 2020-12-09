package com.trade.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
/**
 * 动态获取环境变量
 */
public class OrderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =	SpringApplication.run(OrderApplication.class, args);
		String userName = applicationContext.getEnvironment().getProperty("user.name");
		String userAge = applicationContext.getEnvironment().getProperty("user.age");
		System.err.println("user name :"+userName+"; age: "+userAge);
	}

}
