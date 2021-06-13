package com.technoelivate.jdbcbasics;

import java.io.Serializable;

public class Student44 implements Serializable {
	
	int id;
	String name;
	int age;
	
	public Student44() {
		
	}
	
	
	
	public Student44(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
