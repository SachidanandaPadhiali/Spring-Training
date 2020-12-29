package com.info;

public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	private int id;
	private String name;
	private int sal;
	
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSal(int sal) {
		this.sal = sal;
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
	
	

}
