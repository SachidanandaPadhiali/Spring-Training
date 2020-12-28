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
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle obj = (Vehicle) context.getBean("bike");//car is the class name with Non qualified and decapitalized
obj.drive();
System.out.println("_______________________________________________");

Employee e =(Employee) context.getBean("employee");
String s = e.getAdd().display();
System.out.println(s);
System.out.println(e.getId()+"  "+e.getName()+" "+e.getSal());
    }
}



