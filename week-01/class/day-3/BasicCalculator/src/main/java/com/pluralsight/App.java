package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /**
         * Enter the first number: 5
         * Enter the second number: 12
         *
         * Possible calculations:
         *   (A)dd
         *   (S)ubtract
         *   (M)ultiply
         *   (D)ivide
         * Please select an option: M
         *
         * 5 * 12 = 60
         */
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = keyboard.nextInt();
        keyboard.nextLine(); //consuming CRLF

        System.out.print("Enter the second number: ");
        int secondNumber = keyboard.nextInt();
        keyboard.nextLine(); //consuming CRLF

        System.out.println("Possible calculations: \n (A)dd \n (S)ubtract \n (M)ultiply \n (D)ivide");
        System.out.print("Please select an option: ");
        String option = keyboard.nextLine();

//        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.printf("%d * %d = %d", firstNumber, secondNumber, (firstNumber * secondNumber));

    }
}