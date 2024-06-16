package com.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.junit.pojo")
public class CasDeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasDeTestApplication.class, args);
		System.out.println(Thread.currentThread().getName()+"-"+Thread.currentThread().getPriority());
	}

}
