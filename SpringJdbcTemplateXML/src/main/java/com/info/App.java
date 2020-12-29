package com.info;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");  
	      
	    EmployeeDAO dao=(EmployeeDAO)ctx.getBean("edao");  
		/*
		 * Employee e =new Employee(102,"Lalitha",20000); int status =
		 * dao.saveEmployee(e); System.out.println(status);
		 */  
	
		/*
		 * int status1=dao.updateEmployee(new Employee(102,"Sonoo",15000));
		 * System.out.println(status1);
		 */  
	    
	    Employee e=new Employee(); 
	    e.setId(102); 
	    int status=dao.deleteEmployee(e);
	    System.out.println(status);  
	   
	    
    }
}
