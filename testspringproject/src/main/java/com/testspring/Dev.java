package com.testspring;

public class Dev {

   private Laptop laptop;

//    private int age=9;

    public Dev() {
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Dev(Laptop laptop) {
        this.laptop=laptop;
    //this.age = age;
    }

    public void build(){
        System.out.println("In Dev class");
        laptop.compile();
    }

    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }
}
