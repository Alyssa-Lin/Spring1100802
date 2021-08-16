package com.study.spring.case01;

import javax.sound.midi.Soundbank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Author author1 = ctx.getBean(Author.class);
		Author author1 = (Author)ctx.getBean("author1");
		Author author2 = (Author)ctx.getBean("author2");
		Author author3 = (Author)ctx.getBean("author3");
		Author author4 = (Author)ctx.getBean("author4");
		System.out.println(author1);
		System.out.println(author2);
		System.out.println(author3);
		System.out.println(author4);
		
		Book book1 = (Book)ctx.getBean("book1");
		Book book2 = (Book)ctx.getBean("book2");
		Book book3 = (Book)ctx.getBean("book3");
		Book book4 = (Book)ctx.getBean("book4");
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4);
	}

}
