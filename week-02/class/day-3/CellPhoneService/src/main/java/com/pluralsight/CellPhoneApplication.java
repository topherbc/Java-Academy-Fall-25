package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        CellPhone userPhoneOne = new CellPhone();
        CellPhone userPhoneTwo = new CellPhone();

        userPhoneTwo.setSerialNumber(888);
        userPhoneTwo.setPhoneNumber("711");
        userPhoneTwo.setOwner("Help Line");
        userPhoneTwo.setCarrier("T-Mobile");
        userPhoneTwo.setModel("Landline");

        System.out.print("What is the serial number? ");
        int serialNumber = scan.nextInt(); //looking for number
        scan.nextLine(); //Looks for \n character
        userPhoneOne.setSerialNumber(serialNumber);

        System.out.print("What model is the phone? ");
        String model = scan.nextLine();
        userPhoneOne.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scan.nextLine();
        userPhoneOne.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scan.nextLine();
        userPhoneOne.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner? ");
        String owner = scan.nextLine();
        userPhoneOne.setOwner(owner);

//        display(userPhoneOne);
//        display(userPhoneTwo);


        userPhoneOne.dial("(999) 555-1202");

    }

    public static void display(CellPhone phone) {
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }

}
