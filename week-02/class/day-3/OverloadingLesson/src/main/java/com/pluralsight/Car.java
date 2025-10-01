package com.pluralsight;

public class Car {
    private String make;
    private String model;
    private String color;
    private int gasLevel;
    private int miles;

    //Overloading Constructor Method
    public Car(String make, String model, String color, int gasLevel, int miles) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.gasLevel = gasLevel;
        this.miles = miles;
    }

    //Brand New Car Constructor
    public Car(String make, String model, String color) {
        this.gasLevel = 0;
        this.miles = 0;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color) {
        this.gasLevel = 0;
        this.miles = 0;
        this.make = "Subaru";
        this.model = model;
        this.color = color;
    }

    //Fill Up Your Car
    public void fillUp() {
        this.gasLevel = 100;
        System.out.println("Filled the tank to 100%");
    }

    //Get some gas
    public void fillUp(int amount) {
        this.gasLevel += amount;
        System.out.println("Filled the tank to " + this.getGasLevel() + "%");
    }

    public String getModel() {
        return model;
    }

    public int getGasLevel() {
        return gasLevel;
    }

    public int getMiles() {
        return miles;
    }
}
