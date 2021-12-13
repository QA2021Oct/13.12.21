package com.company;

public class Circle extends Shape{
   protected double radius;

    public Circle (String name, double radius){
        super(name);
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI  * Math.pow(radius , 2);
    }

    public double getHaikefh(){
        return 2 * Math.PI * radius;
    }
}
