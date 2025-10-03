package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Book[] inventory = {
                new Book(1, "555FBCND", "The Phoenix Project", "Bob", true),
                new Book(2, "978-0132350884", "Clean Code", "", false),
                new Book(3, "978-0201633610", "Design Patterns", "", false),
                new Book(4, "978-0136291558", "Object Oriented Software Engineering", "", false),
                new Book(5, "978-0137081073", "The Clean Coder", "", false),
                new Book(6, "978-0134685991", "Effective Java", "", false),
                new Book(7, "978-0135957059", "The Pragmatic Programmer", "", false),
                new Book(8, "978-0321125215", "Domain-Driven Design", "", false),
                new Book(9, "978-0201616224", "The Pragmatic Programmer (1st Ed)", "", false),
                new Book(10, "978-1449373320", "Designing Data-Intensive Applications", "", false),
                new Book(11, "978-0596517748", "JavaScript: The Good Parts", "", false),
                new Book(12, "978-0262033848", "Introduction to Algorithms", "", false),
                new Book(13, "978-0134494166", "Clean Architecture", "", false),
                new Book(14, "978-1617294136", "Grokking Algorithms", "", false),
                new Book(15, "978-0321573513", "Algorithms", "", false),
                new Book(16, "978-1491950357", "Building Microservices", "", false),
                new Book(17, "978-0135974445", "Refactoring", "", false),
                new Book(18, "978-0672337383", "Code Complete", "", false),
                new Book(19, "978-0596007126", "Head First Design Patterns", "", false),
                new Book(20, "978-1492040347", "Kubernetes: Up and Running", "", false)
        };

        System.out.println("---Super Duper's Library Inventory System---\n");

        //Display the Home Screen until User exits
        while(true) {

            System.out.println("Please choose from the following options");
            System.out.println("   1. Show Available Books");
            System.out.println("   2. Show Checked Out Books");
            System.out.println("   3. Exit Program\n");
            System.out.print("Enter a number choice: ");
            int userChoice = keyboard.nextInt();
            keyboard.nextLine();

            switch (userChoice) {
                case 1: //Show Available Books
                    //showAvailableBooks()
                    break;
                case 2: //Show Checked Out Books
                    //showCheckedOutBooks()
                    break;
                case 3: //Exit Program
                    keyboard.close();
                    System.exit(0);
                    break;
                default: //Invalid Choice
                    System.out.println("Invalid Choice, try again...");
            }

        }




    }
}
