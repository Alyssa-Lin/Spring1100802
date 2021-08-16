package com.study.spring.case03.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value(value = "John")
	private String name;
	
	@Value(Value = "18")
	private Integer age;
	
	@Value()
	
	
	
	
	
}
