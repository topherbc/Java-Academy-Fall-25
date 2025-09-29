package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringsMethodsLesson {

    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("Please enter your phone number: ");
//        String userPhone = keyboard.nextLine();

//        System.out.println(userPhone.trim()); //removes whitespace from beg and end of String

        String phoneOne = "(813) 867-5309"; //14

        String phoneTwo = "+1 (412) 800-5802"; //17

        String phoneThree = "911"; //3

        String phoneFour = "(888) call-jake"; //14

        String name = "Example Name";

        //System.out.println(name.toUpperCase()); //convert String to all UPPERCASE
        //System.out.println(name.toLowerCase()); //convert String to all UPPERCASE

//        System.out.println(name.charAt(7)); //charAt obtains char at index

//        System.out.println(name.startsWith("Ex")); //returns boolean
//        System.out.println(name.endsWith("me")); //returns boolean



        if (phoneOne.length() > 0) {
//            System.out.println(phoneOne.length()); //count of char in String
        }

//        System.out.println(phoneOne.equals(phoneTwo)); //Correct String comparision


        String discountCode = "SAVE-50-LOSE";

//        System.out.println(discountCode.indexOf("-")); //captures position number of char

//        System.out.println(discountCode.substring(0, discountCode.indexOf("-"))); //captures string from start to end position

        String cities = "Pittsburgh|Tampa|Denver|New York City";

        String[] parsedCities = cities.split("\\,"); //splits a string into a list/array
//        String[] parsedCities = cities.split(Pattern.quote(",")); //splits a string into a list/array


        //delimiter - something that seperates

        System.out.println(parsedCities[3]);



    }

}
