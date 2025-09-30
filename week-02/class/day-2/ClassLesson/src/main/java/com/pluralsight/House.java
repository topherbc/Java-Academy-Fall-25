package com.pluralsight;

public class House {
    private int rooms;
    private double price;
    private boolean waterCapable;
    private boolean hasGarage;
    private int yearBuilt;
    private int sqft;
    private String color;

    public House() {
        this.rooms = 0
    }

    public House(int rooms, double price, boolean waterCapable, boolean hasGarage, int yearBuilt, int sqft, String color) {
        this.rooms = rooms;
        this.price = price;
        this.waterCapable = waterCapable;
        this.hasGarage = hasGarage;
        this.yearBuilt = yearBuilt;
        this.sqft = sqft;
        this.color = color;
    }

    public int getYearBuilt() {
        return this.yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void trapdoor() {
        System.out.println("OH NO WE LOST YA");
    }

}
