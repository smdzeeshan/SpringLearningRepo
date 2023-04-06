package com.beanScopeLearnings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.setMessage("I'm object A");
		helloWorld.getMessage();

		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
		helloWorld2.getMessage();
	}
}
