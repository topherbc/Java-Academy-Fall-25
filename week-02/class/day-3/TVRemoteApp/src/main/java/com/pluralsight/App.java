package com.pluralsight;

public class App {
    public static void main(String[] args) {
        TVRemote lgTV = new TVRemote("LG");

        lgTV.turnOn();

        lgTV.changeChannel(25);

        System.out.println(lgTV.getStatus());
    }
}
