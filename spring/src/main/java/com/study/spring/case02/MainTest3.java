package com.study.spring.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest3 {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext2.xml");
		Teacher t1=(Teacher)ctx.getBean("teacher");
		System.out.println(t1);
		System.out.println(t1.getStudents().size());
		System.out.println(t1.getTotalCredit());
	}

}
