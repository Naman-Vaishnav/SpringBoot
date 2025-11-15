package com.ncv.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    
    //@Autowired->field injection
    //Laptop laptop;

    //Autowired is default for constructor
    // public Dev(Laptop laptop){
    //     this.laptop=laptop;
    // }

    // @Autowired
    // void setLaptop(Laptop laptop){
    //     this.laptop=laptop;
    // }

    //for field and setter anotaion is needed


    //->With interface
    @Autowired
    //what if there are two concrete classes of Computer? which one will be assigned?
    //Method1: Add @Primary in Component
    //Method2: Add @Qualifier
    @Qualifier("desktopA")//class name with smaller first latter
    Computer comp;

    public void test(){

        comp.compile();
        System.out.println("test method");
    }
}
