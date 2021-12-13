package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Bobi", "black", 6);
        System.out.println(dog);
        dog.makeASound();
        Cat cat = new Cat("Mitzi", "Gray" , 3);
        System.out.println(cat);
        cat.makeASound();
    }
}
