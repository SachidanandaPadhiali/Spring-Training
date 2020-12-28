package com.info;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
Car car = (Car) context.getBean("carObj");
car.drive();
 Bike b= (Bike) context.getBean("bikObj");
 b.drive();
    
    }
}
