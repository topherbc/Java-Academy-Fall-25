package com.pluralsight;

import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        boolean run = true;

        while(run) {
                try {
                    Scanner scanner = new Scanner(System.in);

                    //Define Array

                    String[] students = {"Branding", "Tayshia", "Mohammed", "Kyrra", "Reggieg"};

                    System.out.print("Please select a student (Enter 0-4): ");

                    int index = scanner.nextInt();

                    //Access item from array using index
                    System.out.println(students[index]);

                    run = false;
                } catch (Exception e) {
                    //loading a pdf, log that message
                    System.out.println(e.getMessage());
                    System.out.println("Issue selecting student, try again");
                }
        }
    }
}
