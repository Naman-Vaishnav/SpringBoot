package com.ncv.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
        
		ApplicationContext context =SpringApplication.run(MyAppApplication.class, args);//this creates the container
		/*
		 * Dev d=new Dev();
		 * d.test();
		 * works but we have to take care this object.
		 * this won't be inside the IOC container
		 * 
		 * How to get it from container?
		 * 
		 */
		Dev d=context.getBean(Dev.class);
		d.test();
		/*
		 * org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.ncv.myApp.Dev' available
		 * Spring doesn't create object of all the classes by default . and we don't want to create object of all classes.
		 * How to tell spring boot so that it creates it?
		 * ->@Component in class
		 */

	}

}
