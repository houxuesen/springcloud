package com.example.order;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.example.order.feign")
public class OrderApplication {

	public static void main(String[] args) {



		String s1 = new StringBuilder("go")
				.append("od").toString();
		System.out.println(s1.intern() == s1);
		String s2 = new StringBuilder("ja")
				.append("va").toString();
		System.out.println(s2.intern() == s2);

		SpringApplication.run(OrderApplication.class, args);

		//initFlowRules();
		/*while (true) {
			Entry entry = null;
			try {
				entry = SphU.entry("HelloWorld");
				*//*您的业务逻辑 - 开始*//*
				System.out.println("hello world");
				*//*您的业务逻辑 - 结束*//*
			} catch (BlockException e1) {
				*//*流控逻辑处理 - 开始*//*
				System.out.println("block!");
				*//*流控逻辑处理 - 结束*//*
			} finally {
				if (entry != null) {
					entry.exit();
				}
			}
		}*/
	}

	private  static void initFlowRules(){
		List<FlowRule> rules = new ArrayList<>();
		FlowRule rule = new FlowRule();
		rule.setResource("HelloWorld");
		rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
		// Set limit QPS to 20.
		rule.setCount(20);
		rules.add(rule);
		FlowRuleManager.loadRules(rules);
	}

}
