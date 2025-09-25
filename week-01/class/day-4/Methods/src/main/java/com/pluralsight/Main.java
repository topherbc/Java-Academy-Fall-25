package com.pluralsight;

public class Main {
    /**
     * Methods: Is a function
     * Functions do something
     * Methods as a way of doing something
     *
     * DRY - Don't Repeat Yourself
     *
     */
    public static void main(String[] args) {




//
//
//        multiply(100, 5);
//        multiply(100, 6);
//        multiply(100, 7);
//
//        sendAMessage("Goodbye"); //calling a method // invoking a method
//        sendAMessage("Hello");
//
//        int response = multiply(5, 5);
//
//        System.out.println(response);
//
//        doSomething();
//        doSomething();


        System.out.println(add(20, 10));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean checkStatus(String x) {
        if (x.equals("Correct")) {
            return true;
        } else {
            return false;
        }
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void sendAMessage(String text) {
        System.out.println("This is a message: " + text);
    }

    public static void doSomething() {
        System.out.println("does a thing");
    }

}
