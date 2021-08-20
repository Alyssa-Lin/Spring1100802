package com.study.spring.case02;

import com.github.javafaker.Superhero;

public class Student {
	private Integer id;
	private String name;
	
	public Student() {
		System.out.println("Student constructor");
		System.out.println(super.toString());
	}
	public void init() {
		System.out.println("Student init");
	}
	public void destroy() {
		System.out.println("Student destroy");
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
