package com.study.spring.case04;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name;
	
	private Integer age;
	
	private Date birDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirDate() {
		return birDate;
	}
	public void setBirDate(Date birDate) {
		this.birDate = birDate;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", birDate=" + birDate + "]";
	}
	
	
}
