package com.company;

public class Main {

    public static void main(String[] args) {

        ProcessItemsInBasket jack = new ProcessItemsInBasket();
        jack.launcher();
        PlayTest ram = new PlayTest();
        ram.display();

        Car myCar = new Car("Lamborghini");
        System.out.println(myCar.getName());
        myCar.start();
        Car otherCar = new Car("Bugatti on Steroid");
        System.out.println(otherCar.getName());
        otherCar.start();

    }
}
