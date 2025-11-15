package com.testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // Dev obj=new Dev();
        // obj.build();

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        // Dev obj=(Dev)context.getBean("dev");
        Dev obj=context.getBean(Dev.class);
        //obj.age=19;
        //obj.setAge(19);
        // System.out.println(obj.getAge());
        obj.build();
        

        
    }
}
