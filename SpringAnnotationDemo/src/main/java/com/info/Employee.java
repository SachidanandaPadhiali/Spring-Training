package com.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.*;
@Component
public class Employee {

	@Value("101")
	private int id;
	@Value("Queen")
	private String name;
	@Value("232323")
	private int sal;
	
	private Address add;

	public Employee() {
		
	}
	@PostConstruct
	public void afterBean()
	{
		System.out.println("After creating the bean");
	}
	
	@PreDestroy
	public void before()
	{
		System.out.println("before deletion");
	}

	@Autowired
	public Employee(Address add) {
			this.add = add;
	}

	
	public Employee(int id, String name, int sal, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.add = add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Address getAdd() {
		return add;
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

	public void showInfo() {
		System.out.println("Id :"+getId());
		System.out.println("name :"+getName());
		System.out.println("Salary :"+getSal());
		add.display();


	}
}
