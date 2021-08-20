package com.study.spring.case02;

import java.awt.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToIntFunction;

public class Teacher {
	private Integer id;
	private String name;
	private Set<Student> students;
	private List<String> subjects;
	private Map<String, Integer> salaryMap;
	
	
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public Map<String, Integer> getSalaryMap() {
		return salaryMap;
	}
	public void setSalaryMap(Map<String, Integer> salaryMap) {
		this.salaryMap = salaryMap;
	}
	//請裝配
	//teacher id=1,name=Bob,教什麼科目
	//導師可以知道三個學生的總學分
	//禁止使用for while迴圈，
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
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public int getTotalCredit(){
		int total=0;
		if(students!=null) {
			ToIntFunction<Student> fun1=(s) -> s.getClazzs().stream().mapToInt(c-> c.getCredit()).sum();
			
			total=students.stream().mapToInt(fun1).sum();
		}
		
		return total;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", students=" + students + ", salaryMap=" + salaryMap + "]";
	}
	
	
	
}