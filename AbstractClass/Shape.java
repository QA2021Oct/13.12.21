package com.company;

public abstract class Shape {
    protected String name;

    public Shape(String nama){
        this.name = nama;
    }

    public abstract double getArea();

    public abstract double getHaikefh();

    public String toString(){
        return "Shape: " + name + " Area: " + getArea() + ",  Haikefh:" + getArea();
    }

}
