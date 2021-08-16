package com.study.spring.case03.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Size {
	@Value(value ="白")
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		
		
		
	}
	
	
	
}
