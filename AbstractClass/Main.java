package com.company;

public class Main {

    public static void main(String[] args) {
	    //Shape shape = new Shape();  //Error!

        Circle circle = new Circle("c1", 8.3);
        System.out.println(circle);
        Shape circle2 = new Circle("c2", 9.3);
        System.out.println(circle2);
        Square square = new Square("square" , 3, 5, 3 ,5);
        System.out.println(square);
    }
}
