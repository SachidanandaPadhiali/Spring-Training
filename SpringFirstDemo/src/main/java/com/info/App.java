package com.info;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle v = (Vehicle) context.getBean("car");
		v.drive();
		Employee e = (Employee) context.getBean("emp");
		e.showInfo();

	}
}
