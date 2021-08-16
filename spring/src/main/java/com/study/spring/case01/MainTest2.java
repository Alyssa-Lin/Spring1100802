package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Husband husband =(Husband)ctx.getBean("husband");
		Husband husband2 =(Husband)ctx.getBean("husband2");
		Husband husband3 =(Husband)ctx.getBean("husband3");
		System.out.println(husband);
		System.out.println(husband2);
		System.out.println(husband3);
	}

}
