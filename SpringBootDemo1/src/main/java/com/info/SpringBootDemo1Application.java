package com.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootDemo1Application.class, args);
		Employee e = ctx.getBean(Employee.class);
		System.out.println(e);
		System.out.println(e.showData());
		System.out.println("Welcome to Spring Boot");
		
	}

}
