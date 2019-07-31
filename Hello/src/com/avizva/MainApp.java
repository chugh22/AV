package com.avizva;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.* ;
public class MainApp {
	public static void main(String[] args){
		//ApplicationContext context = new	ClassPathXmlApplicationContext("beans.xml") ;
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloworldCOnfig.class) ;
		HelloWorld obj = (HelloWorld)context.getBean("helloworld") ;
		
		obj.getMsg();
	}

}
