package com.pluralsight;


import java.util.Scanner;

public class InputLesson {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine(); //looking for a new line character
        //hit Enter/Return key. This inserts a \n

        System.out.print("Please enter your height: ");
        double height = keyboard.nextDouble();
        keyboard.nextLine(); //CRLF - Carriage Return Line Feed


        System.out.print("Hey, give me some good words: ");
        String goodWords = keyboard.nextLine();

        System.out.printf("%s thanks for entering your name! and your height is: %.2f", name, height);
    }
}
