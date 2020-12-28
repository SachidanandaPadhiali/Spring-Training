package com.info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	
	@Bean(name = "carObj")
	public Car getCar()
	{
		return new Car();
	}
	
	@Bean(name= "bikObj")
	public Bike getBile()
	{
		return new Bike();
	}
	
	

}
