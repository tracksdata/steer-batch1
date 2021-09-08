package com.xoraint.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans(value = {@ComponentScan("com.xoraint.product.dao"),
						 @ComponentScan("com.xoraint.product.service")})
public class AppConfig {
	
	// Make sure here only non HTTP related configuration only
	
	
	
	
	

}
