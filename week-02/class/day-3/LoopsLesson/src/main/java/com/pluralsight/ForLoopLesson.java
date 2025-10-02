package com.pluralsight;

public class ForLoopLesson {
    public static void main(String[] args) {


        //For loop
            //Iterates through a range of numbers

//        (starter value; condition; iteration direction)

        //i++ //increase i by 1
        //i += 10 OR i = i + to //i by 10

        for (int i = 0; i <= 100; i += 50) {
            System.out.println("Iteration Count: " + i);
        }

        for (int i = 100; i > -10; i--) {
            System.out.println("Iteration Count: " + i);
        }

        for (int i = 10; i < 20; i += 5) {
            System.out.println(i);
        }
    }
}
