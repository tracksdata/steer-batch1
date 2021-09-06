package com.xoriant.product;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class C1 {

	public C1() {  // 1
		System.out.println(">>> C1 class object created....");
	}
	
	@PreDestroy // 4
	public void f4() {
		System.out.println(">>>> Logic before C1 object destroyed....");
	}
	
	
	@Bean // 3
	public void f1() {
		System.out.println(">>> C1 class f1 method");
	}

	@Bean
	public void f2() {
		System.out.println(">>> C1 class f2 method");
	}
	
	@PostConstruct // 2
	public void f3() {
		System.out.println(">>> C1 class f3 method");
	}
	
	
	

}
