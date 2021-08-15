package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Author author1 = ctx.getBean(Author.class);
		Author author1 = (Author)ctx.getBean("author1");
		Author author2 = (Author)ctx.getBean("author2");
		System.out.println(author1);
		System.out.println(author2);
		
		
		
	}

}
