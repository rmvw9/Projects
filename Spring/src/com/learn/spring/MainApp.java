package com.learn.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String [] args){
		 @SuppressWarnings("resource")
		AbstractApplicationContext context = 
	             new ClassPathXmlApplicationContext("spring-config.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

	     obj.getMessage();
	     context.registerShutdownHook();
		
		
	}
}
