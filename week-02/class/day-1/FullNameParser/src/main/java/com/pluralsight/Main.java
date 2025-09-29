package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name on the following line");

        String fullName = scanner.nextLine().trim();

        String[] parts = fullName.split("\\ ");

        //Example T. Ferguson

        if (parts.length == 2) {
            System.out.printf("First Name: %s \nLast Name: %s", parts[0], parts[1]);
        } else if (parts.length == 3){
            System.out.printf("First Name: %s \nMiddle Name: %s\nLast Name: %s", parts[0], parts[1], parts[2]);
        } else {
            System.out.println("Invalid Name Format");
        }


    }
}
