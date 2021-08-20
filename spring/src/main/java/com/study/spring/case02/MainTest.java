package com.study.spring.case02;

import java.io.Closeable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext2.xml");
		Student s1=(Student)ctx.getBean("student1");
		Student s2=(Student)ctx.getBean("student1");
		Student s3=(Student)ctx.getBean("student1");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
