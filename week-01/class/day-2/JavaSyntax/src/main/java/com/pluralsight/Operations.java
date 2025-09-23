package com.pluralsight;

public class Operations {
    public static void main(String[] args) {
        String word1 = "Hello";
        String word2 = "World";
        //concatenation
        //concat
        System.out.println(word1 + " " + word2);

        String wordCombined = word1 + " " + word2;

        System.out.println(wordCombined);

        int number1 = 1;

        number1++; //adds 1
        number1 +=2; //adds x to var
        number1 = number1 + 2; //adds x to var

        System.out.println(number1);

        //% is modulus, returns remainder


        double bigDecimal = 1.40589;
       //3.141592653
        System.out.println(Math.PI);

    }
}
