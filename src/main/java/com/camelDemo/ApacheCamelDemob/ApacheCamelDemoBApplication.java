package com.camelDemo.ApacheCamelDemob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.camel.route.demo.b"})
public class ApacheCamelDemoBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheCamelDemoBApplication.class, args);
	}

}
