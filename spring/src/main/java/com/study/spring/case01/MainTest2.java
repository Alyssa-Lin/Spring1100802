package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Husband husband=(Husband)ctx.getBean(Husband.class);
		Wife wife = (Wife)ctx.getBean(Wife.class);
	
		System.out.printf("%s是%s的老公\n",husband.getName(),husband.getWife().getName());
		System.out.printf("%s是%s的老婆",wife.getName(),wife.getHusband().getName());
	}

}
