package com.info;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeDAO personDAO = context.getBean(EmployeeDAO.class);
		
		 System.out.println("List of person is:");
		  
		  for (Employee p : personDAO.getAllEmployee()) { System.out.println(p); }
		  
		
		  
		  Employee personById = personDAO.getEmployeeById(602);
		  System.out.println(personById);
		 
		  
		
		
		Employee person = new Employee(602,"George",20002);
		//System.out.println(person);
		/*
		 * personDAO.createEmployee(person); System.out.println("\nData inserter");
		 */	
		
		/*
		 * System.out.println("\nDeleting person with ID 2");
		 * personDAO.deleteEmployee(101); System.out.println("\nDeleting person data");
		 * 
		 */		 	 
		/*
		 * Employee e = new Employee(101,"Anu",2345);
		 * 
		 * personDAO.updateEmployee(e);
		 */	
			 
		
		

 }
}
