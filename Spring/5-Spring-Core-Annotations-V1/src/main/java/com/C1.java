package com;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
@Service
//@Repository
//@Controller
//@Configuration
public class C1 {
	public C1() {
		System.out.println(">>> C1 class object created...");
	}
	
	void f1() {
		System.out.println(">>>> f1 method of c1 class");
	}

}
