package com.info;

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
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    
Employee e =(Employee) context.getBean("employee");
String s = e.getAdd().display();
System.out.println(s);
System.out.println(e.getId()+"  "+e.getName()+" "+e.getSal());
context.registerShutdownHook();
    }
}



