package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class StringConversionLesson {
    public static void main(String[] args) {

        String input = "111|Hot Chocolate (12-count)|21|4.99";

        String[] splitInput = input.split(Pattern.quote("|"));

        int id = Integer.parseInt(splitInput[0]);
        String name = splitInput[1];
        int quantity = Integer.parseInt(splitInput[2]);
        double price = Double.parseDouble(splitInput[3]);

        System.out.printf("Hot Chocolate Total After Sales: $%.2f", price * quantity);


        String userInput = "2025-09-29"; //YYYY-MM-DD

        // 09/29/2025

        String otherUserInput = "09/29/2025";

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate today = LocalDate.parse(otherUserInput, format);

        System.out.println(today);

    }
}
