package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Husband husband=(Husband)ctx.getBean(Husband.class);
		Wife wife = (Wife)ctx.getBean(Wife.class);
	
		System.out.printf("%s是%s的老公\n",husband.getName(),husband.getWife().getName());
		System.out.printf("%s是%s的老婆\n",wife.getName(),wife.getHusband().getName());
		
		Parent parent=(Parent)ctx.getBean("parent");
		Child child =(Child)ctx.getBean("child");
		Parent parent2=(Parent)ctx.getBean("parent2");
		Child child2 =(Child)ctx.getBean("child2");
		System.out.println(parent.getName()+"性別是"+parent.getSex()+"，孩子是"+parent.getChild().getName());
		System.out.println(child.getName()+"性別是"+child.getSex()+"，家長是"+child.getParent().getName());
		System.out.println(parent2.getName()+"性別是"+parent2.getSex()+"，孩子是"+parent2.getChild().getName());
		System.out.println(child2.getName()+"性別是"+child2.getSex()+"，家長是"+child2.getParent().getName());
	}

}
