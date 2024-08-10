package com.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CasDeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasDeTestApplication.class, args);
		System.out.println("\nSWAAGER\n SPRINGFOX\n");
	}

}
