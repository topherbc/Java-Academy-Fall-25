package com.pluralsight;

public class Clothes {

    //private and public

    //access modifier

    //encapsulation
    private String color;
    private char size;
    private String material;
    private boolean graphic;
    private double price;
    private String type;

    //Constructor Method
    public Clothes(String color, char size, String material, boolean graphic, double price, String type) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.graphic = graphic;
        this.price = price;
        this.type = type;
    }

    //getters
    public String getColor() {
        return this.color;
    }

    //setters
    public void setColor(String color) {
        this.color = color;
    }

    public void purchase() {
        System.out.println("Bought the " + this.color + " " + this.type);
    }

}
