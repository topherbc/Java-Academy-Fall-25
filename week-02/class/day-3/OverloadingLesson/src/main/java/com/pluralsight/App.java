package com.pluralsight;

public class App {
    public static void main(String[] args) {
        System.out.println("--Welcome to Super Duper's Car Dealership!--");
        System.out.println("--Let's check out some of our New and Used Vehicles--\n\n");

        Car usedCar = new Car("Volkswagen", "Beetle", "Pink", 90, 120000);

        Car newCar = new Car("Lamborgini", "Hurican", "Black");

        newCar.fillUp(89);

        System.out.println(newCar.getModel());
        System.out.println(newCar.getGasLevel());
        System.out.println(newCar.getMiles());

    }
}
