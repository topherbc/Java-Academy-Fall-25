package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson {
    public static void main(String[] args) {
        try {

            FileWriter fileWriter = new FileWriter("src/main/resources/counter.txt", true); //open docs

            BufferedWriter bufWriter = new BufferedWriter(fileWriter); //we want to write to that file

            for (int i = 1; i <= 50 ; i += 2) {
                bufWriter.write("Counting " + i);
                bufWriter.newLine();
            }

            bufWriter.close(); //saving the file

        } catch (IOException e) {
            System.out.println("ERROR:  An unexpected error occurred");
            e.getStackTrace();
        }
    }
}
