package com.testspring;

public class Desktop implements Computer {

    @Override
    public void compile() {
        System.out.println("In Desktop");
    }

}
