package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //HashMap<Key, Value> - keys and values are any type of data
        HashMap<String, String> countriesWithAcronym = new HashMap<>();
        ArrayList<String> countries = new ArrayList<>();

        countries.add("Canada");
        countriesWithAcronym.put("CA", "Canada");

        countries.add("Nepal");
        countriesWithAcronym.put("NP", "Nepal");

        countries.add("Haiti");
        countriesWithAcronym.put("HT", "Haiti");

        countries.add("Jamaica");
        countriesWithAcronym.put("JM", "Jamaica");

        countries.add("Mexico");
        countriesWithAcronym.put("MX", "Mexico");

        countries.add("Sweden");
        countriesWithAcronym.put("SE", "Sweden");

        countries.add("Kyrgyzstan");
        countriesWithAcronym.put("KGZ", "Kyrgyzstan");

        countries.add("Antigua");
        countriesWithAcronym.put("ATG", "Antigua");

        countries.add("United States");
        countriesWithAcronym.put("USA", "United States");

        countries.add("Turkey");
        countriesWithAcronym.put("TR", "Turkey");

        countries.add("Ethiopia");
        countriesWithAcronym.put("ETH", "Ethiopia");

        countries.add("Iraq");
        countriesWithAcronym.put("IQ", "Iraq");

        for (String key : countriesWithAcronym.keySet()) {
            System.out.println(key + ": " + countriesWithAcronym.get(key));
        }

        for (String value : countriesWithAcronym.values()) {
            System.out.println(value);
        }


    }
}
