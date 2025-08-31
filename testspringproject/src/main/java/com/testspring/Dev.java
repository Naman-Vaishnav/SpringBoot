package com.testspring;

public class Dev {

   private Computer comp;

//    private int age=9;

    public Dev() {
    }


    public Dev(Computer comp) {
        this.comp=comp;
    //this.age = age;
    }

    public void build(){
        System.out.println("In Dev ");
        comp.compile();
    }



    public Computer getComp() {
        return comp;
    }



    public void setComp(Computer comp) {
        this.comp = comp;
    }

    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }
}
