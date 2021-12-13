package com.company;

public class Bicycles {
    String name;
    String color;
    int wheels;
    int seats;

    public Bicycles(String name, String color, int wheels, int seats) {
        this.name = name;
        this.color = color;
        this.wheels = wheels;
        this.seats = seats;
    }
    public String toString(){
        return "Bicycles: name " + name + ", color:" + color + ",  number of wheels: " +wheels + ", number of seats:"  + seats;
    }
}
