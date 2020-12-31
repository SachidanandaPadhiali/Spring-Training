package com.info;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("4023")
	private int no;
	@Value("Ahamadabad")
	private String city;
	@Value("Gujarath")
	private String state;
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public int getNo() {
		return no;
	}
	public String getState() {
		return state;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [no=" + no + ", city=" + city + ", state=" + state + "]";
	}
	public Address(int no, String city, String state) {
		super();
		this.no = no;
		this.city = city;
		this.state = state;
	}
	

}
