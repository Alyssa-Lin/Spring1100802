package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person=(Person)ctx.getBean("person");
		person.setID(1515);
		person.setName("USER");
		System.out.println(person);

	}

}
