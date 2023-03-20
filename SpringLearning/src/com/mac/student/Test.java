package com.mac.student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Student student1 = (Student) beanFactory.getBean("studentbean");
		student1.displayInfo();
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student2 = (Student) context.getBean("studentbean");
		student2.displayInfo();
	}
}
