package com.pluralsight;

import java.io.*;

public class Lesson {
    public static void main(String[] args) {

        //File Paths

        //Absolute
            //Total or Exact path
            ///Users/christopher-carter/Documents/Courseware-Docs/My-Classes/Academy-Java-YearUp/2025-Q4-Fall/week-03/class/day-2/BufferedReaderLesson/src/main/resources/poem.txt

        //Relative
            //Related to your current location
            //src/main/resources/poem.txt

        try {
            FileReader fileReader = new FileReader("src/main/resources/goldilocks.txt");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;

            while((input = bufReader.readLine()) != null) {
                System.out.println(input);
            }

            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
