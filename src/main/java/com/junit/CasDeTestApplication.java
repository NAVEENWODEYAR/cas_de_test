package com.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.*;
import io.swagger.v3.oas.annotations.servers.*;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//@OpenAPIDefinition(
//		info = @Info(
//				title = "API TESTING",
//				version = "1.0",
//				description = "Testing REST Endpints using Mockito,",
//				termsOfService = "http://termsOfService.url",
//				contact = @Contact(
//						name = "Naveen K Wodeyar",
//						email = "naveen@n.in",
//						url = "http://support.url"
//				),
//				license = @License(
//						name = "Apache 2.0",
//						url = "http://www.apache.org/licenses/LICENSE-2.0.html"
//				)
//		),
//		servers = {
//				@Server(
//						url = "http://localhost:7070",
//						description = "Development server",
//						variables = {
//								@ServerVariable(
//										name = "port",
//										description = "Port number",
//										defaultValue = "7070"
//								)
//						}
//				)
//		}
//)
@SpringBootApplication
public class CasDeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasDeTestApplication.class, args);
		System.out.println("\nSWAAGER\n SPRINGFOX\n");
	}
	
}
