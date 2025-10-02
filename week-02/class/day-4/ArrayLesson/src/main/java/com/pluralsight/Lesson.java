package com.pluralsight;

import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {

        //Arrays

        //

        String[] colors = {"blue", "green", "orange", "pink", "black", "yellow", "periwinkle", "magenta"};

        String[] emptyStringArray = new String[5]; //5 positions

        //array.length - 1 == last index of an array

        //colors.length - 1 == last index of the colors array
        System.out.println(colors[colors.length - 1]);

        for (int i = 0; i < colors.length; i++) {
            //i will equal each index, as we loop
            System.out.println(colors[i] + " : Iter number: " + i);

            if (i < emptyStringArray.length) {
                emptyStringArray[i] = colors[i];
            }
        }

        //for each  loop, looping over each emptyColor in the emptyStringArray array
        for (String emptyColor: emptyStringArray) {
            System.out.println(emptyColor);
        }

        Arrays.sort(colors);

        //for each  loop, looping over each color in the colors array
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
