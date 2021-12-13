package com.company;

public class Square extends Shape{
    double a, b, c ,d ;

    public Square(String name, double a, double b, double c ,double d ){
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getArea() {
        return a * c;
    }

    @Override
    public double getHaikefh() {
        return a + b + c + d;
    }

}
