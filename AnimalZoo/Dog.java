package com.company;

public class Dog extends Animal{

    public Dog (String name, String color, int age){
        super(name, color, age);
    }

    public void makeASound(){
        System.out.println("Wooof....");
    }
}
