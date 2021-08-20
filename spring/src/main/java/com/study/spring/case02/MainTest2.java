package com.study.spring.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext2.xml");
		Student s1=(Student)ctx.getBean("student1");
		System.out.println(s1);

	}

}
