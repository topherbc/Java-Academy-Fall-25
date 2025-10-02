package com.pluralsight;

import java.util.Scanner;

public class DoWhileLoopLesson {
    public static void main(String[] args) {
        int i = 100;

        //do while loops
        //run at least 1 time
        //will continue, while true

        do {

            System.out.println(i);
            i = i + 1;

        } while (i < 102);

        boolean status = true;

        Scanner scan = new Scanner(System.in);

        // PSEUDOCODE
        do {
            System.out.print("Please enter, A, B or X: ");
            String choice = scan.nextLine();

            switch (choice) {
                case "A":
                    System.out.println("Choice A made");
                    break;
                case "B":
                    System.out.println("Choice B made");
                    break;
                case "X":
                    System.out.println("Program Exit!");
                    status = false;
                    break;
                default:
                    System.out.println("Please enter a correct option");
                    break;
            }
            // RUN the option
        } while (status);




    }
}
