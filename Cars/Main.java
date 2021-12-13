package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Car bike electric vehicle bicycle

        Car car = new Car("Ford", "red", 4, 5,3500);
        //car.seats = 1000000000; Error!
        System.out.println(car);
        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla", "black", 4,5, 1500);
        System.out.println(electricVehicle);
        Bike bike = new Bike("Harlie", "black", 2, 2, 2000);
        System.out.println(bike);

        Bicycles bicycles = new Bicycles("B", "yellow", 2, 1);
        System.out.println(bicycles);
    }
}
