package com.company;

public class Car {
    String name;

    public void start() {
        System.out.println("The car has started");
    }

    public Car(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
