package com.study.spring.case01;

public class Person {
	private Integer ID;
	private String name;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [ID=" + ID + ", name=" + name + "]";
	}
	
}
