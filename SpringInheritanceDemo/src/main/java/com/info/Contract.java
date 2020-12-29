package com.info;

public class Contract {
	
	private int id;
	private String name;
	private int sal;
	private String vendor;
	private Address add;

	public void setAdd(Address add) {
		this.add = add;
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
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public Address getAdd() {
		return add;
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
	public String getVendor() {
		return vendor;
	}
	public void getDetails()
	{
		System.out.println("Id  :"+id);

		System.out.println("Name  :"+name);

		System.out.println("sal :"+sal);

		System.out.println("Vendor  :"+vendor);
		

		System.out.println("Address  :"+add.display());
	}
	
	

}
