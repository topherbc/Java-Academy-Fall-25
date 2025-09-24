package com.pluralsight;

public class OutputLesson {
    public static void main(String[] args) {
        System.out.print("Hello \n"); //\n new line character
        System.out.print("Class"); //print, prints without newlines
        System.out.println("Hello again?"); //prints with newline


        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totalDue = subtotal + tax;
        String aggregateName = "Total Due";

        int goodNumber = 1;

        System.out.println(totalDue);

        System.out.printf("%s  is: %.3f\n", aggregateName, totalDue);
        System.out.printf("%d is our great number!", goodNumber);


    }
}
