package com.camel.route.demo.b;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class CamelFileRouteDemo extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		from("file:files/input")
		.log("${body}")
		.to("file:files/output");
		
	}

}
