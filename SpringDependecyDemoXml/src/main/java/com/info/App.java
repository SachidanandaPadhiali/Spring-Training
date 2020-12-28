package com.info;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
						
		Calculation calculation = (Calculation) context.getBean("cal1");
		System.out.println(calculation.add());
		context.registerShutdownHook();
		/*
		 * Employee e =(Employee)context.getBean("emp1");
		 * System.out.println("Id :"+e.getId()+"  Name  :"+e.getName()+"  Salary :"+e.
		 * getSal()+"Address :"+e.getAdd().display());
		 * 
		 * Employee e1 =(Employee)context.getBean("emp2");
		 * System.out.println("Address of the Employee  "+e1.getAdd().display());
		 * 
		 * 
		 * Employee e2 =(Employee)context.getBean("emp3"); System.out.
		 * println("Address of the Employee through constructor based Auto wiring  "+e2.
		 * getAdd().display());
		 * 
		 * 
		 */    }
}
