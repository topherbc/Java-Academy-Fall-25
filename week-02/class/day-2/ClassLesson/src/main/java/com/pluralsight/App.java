package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();

        Clothes blackShirt = new Clothes("black", 'L', "plastic", true, 0.00, "t-shirt");

        blackShirt.purchase();

        blackShirt.setColor("blue");
        System.out.println(blackShirt.getColor());

        blackShirt.purchase();

        Clothes sundress = new Clothes("blue", 'S', "cotton", true, 20.00, "sundress");

//        sundress.purchase();

        //instantiation
        //to create an instance of
        Clothes greyJacket = new Clothes("grey", 'L', "cotton", false, 10.00, "jacket");

//        greyJacket.purchase();

        int x = 5;

        //Black t-shirt, with graphic, $15

//        int blackShirt = 15;
//        char size = 'L';
//        String material = "plastic";
//        boolean graphic = true;

        //Jackets grey, $100

        //shirt

        // pants

        //hoodie

        //sundress




        //classes

        //classification

        //construction



        House mySuperCoolHauntedHouse = new House(80, 10.00, false, true, 1000, 100, "lime green");

        int yearBuilt = mySuperCoolHauntedHouse.getYearBuilt();

        System.out.println(yearBuilt);

    }
}
