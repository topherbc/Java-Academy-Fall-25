package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        /**
         * 1. Create two variables to represent the salary for Bob and Gary, name them
         * bobSalary and garySalary. Create a new variable named
         * highestSalary. Determine whose salary is greater using Math.max() and
         * store the answer in highestSalary.  Set the initial salary variables to any
         * value you want. Print the answer (i.e "The highest salary is ...")
         *
         */


        double bobSalary = 100;
        double garySalary = 500000;

        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("Highest salary is: $" + Math.round(highestSalary));


        /**
         * 2. Find and display the smallest of two variables named carPrice and
         * truckPrice.  Set the variables to any value you want.
         */

        double carPrice = 1000;
        double truckPrice = 2000;

        double cheapestVehicle = Math.min(carPrice, truckPrice);

        System.out.println("The cheapest vehicle is: $" + cheapestVehicle);

        /**
         * 3. Find and display the area of a circle whose radius is 7.25
         */

        double radius = 7.25;

        double areaOfCircle = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of a circle with a radius of: " + radius + " is: " + areaOfCircle);


        /**
         * 4. Find and display the square root a variable after it is set to 5.0
         */


        double exampleVariable = 5.0;
        double sqrtOfVariable = Math.sqrt(exampleVariable);

        System.out.println("Square root of " + exampleVariable + " is: " + sqrtOfVariable);


         /**
         * 5. Find and display the distance between the points (5, 10) and (85, 50)
          * d = √ [(x2-x1)2 + (y2-y1)2]
          */

         int x1 = 5;
         int y1 = 10;

         int x2 = 85;
         int y2 = 50;

         double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

         System.out.println("The distance is: " + distance);


         /**
         * 6. Find and display the absolute (positive) value of a variable after it is set to -3.8
          */


         /**
          * 7. Find and display a random number between 0 and 1
          * int randomNum = min + (int)(Math.random() * ((max - min) + 1));
          */

         double randomNumber = Math.random() * ((1 - 0) + 1);

        System.out.println("Random Number: " + Math.round(randomNumber));


         /**
         * 8. Calculate how many minutes are in 24 days, use a variable for each value you
         * calculate with. BONUS: How many milliseconds?
         */
    }
}
