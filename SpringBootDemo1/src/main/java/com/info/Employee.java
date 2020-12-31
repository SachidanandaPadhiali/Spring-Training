package com.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("101")
	private int id;
	
	@Value("Mano")
	private String name;
	
	@Value("20000")
	private int sal;
	
	@Autowired
	Address add;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSal() {
		return sal;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
public void setAdd(Address add) {
	this.add = add;
}
public Address getAdd() {
	return add;
}

	

	
public Employee(int id, String name, int sal, Address add) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
	this.add = add;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", add=" + add + "]";
}

public String showData()
{
	return "Welcome to Spring and spring Boot";
}
}
