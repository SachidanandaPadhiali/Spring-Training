package com.info;

public class Calculation {
	public Calculation() {
	}
	
	
	public void after()
	{
		System.out.println("After creating the object for Calculator bean");
	}
	
	public void before()
	{
		System.out.println("Before deleting the object for Calculator bean");
	}
		
	public Calculation(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	private int num1;
	private int num2;
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	
	public int add() {
		return num1+num2;
	}

	
}
