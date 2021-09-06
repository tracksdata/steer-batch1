package com.xoriant.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
//@ComponentScan("com.xoriant.product.dao,com.xoriant.product.service")
@ComponentScans(value = {@ComponentScan("com.xoriant.product.dao"),
			             @ComponentScan("com.xoriant.product.service"),
			             @ComponentScan("com.xoriant.product.aspects")
			            
						})
@EnableAspectJAutoProxy
public class AppConfig {
	
	//@Bean
	void f1() {
		System.out.println("<<<< f1 method");
	}
	
}
