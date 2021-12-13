package com.company;

public class Car {
    private String name;
    private String color;
    private int wheels;
    private int seats;
    private double engineSize;

    public Car(String name, String color, int wheels, int seats, double engineSize){
        this.name = name;
        this.color = color;
        this.wheels = wheels;
        this.seats = seats;
        this.engineSize = engineSize;
    }

    public String getName(){
        return  name;
    }
    public void setName(String newName){
        if (newName != ""){
            this.name = newName;
        }
    }

    public  void drive(){
        System.out.println("Car" + name +  "is driving....");
    }
    public  void stop(){
        System.out.println("Car Stooped");
    }


    public String toString(){
        return "Car: name " + name + ", color:" + color + ",  number of wheels: " +wheels + ", number of seats:"  + seats;
    }
}
