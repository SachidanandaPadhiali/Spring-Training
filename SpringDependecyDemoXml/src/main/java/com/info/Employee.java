package com.info;

public class Employee {

	private int id;
	private String name;
	private int sal;
	private Address add;

	public Employee() {
		
	}

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
