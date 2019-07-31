package com.avizva;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloworldCOnfig {
	@Bean
	@Scope("prototype")
	public HelloWorld helloworld(){
		HelloWorld h = new HelloWorld() ;
		h.setMsg("Hi");
		return h ; 
	}
	
}
