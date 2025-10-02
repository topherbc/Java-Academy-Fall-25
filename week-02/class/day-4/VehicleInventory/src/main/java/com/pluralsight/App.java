package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Example Cars
            101121,Ford Explorer,Red,45000,13500
            101122,Toyota Camry,Blue,60000,11000
            101123,Chevrolet Malibu,Black,50000,9700
            101124,Honda Civic,White,70000,7500
            101125,Subaru Outback,Green,55000,14500
            101126,Jeep Wrangler,Yellow,30000,1600
         */

        Vehicle[] vehicleInventory = {
                new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500),
                new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000),
                new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700),
                new Vehicle(101124, "Honda Civic", "White", 70000, 7500),
                new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500),
                new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 1600)
        };

        System.out.println("---Welcome to Super Duper's Vehicle Inventory System---\n");


        while(true) {
            System.out.println("What do you want to do?");
            System.out.println("   1 - List all vehicles");
            System.out.println("   2 - Search by make/model");
            System.out.println("   3 - Search by price range");
            System.out.println("   4 - Search by color");
            System.out.println("   5 - Add a vehicle");
            System.out.println("   6 - Quit\n");

            System.out.print("Enter your command: ");
            int command = scanner.nextInt();
            scanner.nextLine();

            switch(command) {
                case 1:
                    listAllVehicles(vehicleInventory);
                    break;
                case 2:
                    System.out.print("Make/Model to search: ");
                    String makeModel = scanner.nextLine().trim();
                    findVehiclesByMakeOrModel(vehicleInventory, makeModel);
                    break;
                case 3:
                    System.out.print("Enter a starting value: ");
                    int starting = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter a ending value: ");
                    int ending = scanner.nextInt();
                    scanner.nextLine();

                    findVehiclesByPriceRange(vehicleInventory, starting, ending);
                    break;
                case 4:
                    System.out.print("Color to search: ");
                    String color = scanner.nextLine().trim();
                    findVehiclesByColor(vehicleInventory, color);
                    break;
                case 5:
//                addAVehicle();
                    break;
                case 6:
                    System.exit(0);
            }

            System.out.println("Hit ENTER to continue");
            scanner.nextLine();
        }
    }

    public static void listAllVehicles(Vehicle[] inventory) {
        for (Vehicle vehicle : inventory) {
            System.out.println(vehicle);
        }
    }

    public static void findVehiclesByColor(Vehicle[] inventory, String color) {
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                System.out.println(vehicle);
            }
        }
    }

    public static void findVehiclesByMakeOrModel(Vehicle[] inventory, String makeModel) {
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMakeModel().toLowerCase().contains(makeModel.toLowerCase())) {
                System.out.println(vehicle);
            }
        }
    }

    public static void findVehiclesByPriceRange(Vehicle[] inventory, int startRange, int endRange) {
        for (Vehicle vehicle : inventory) {
            if (startRange <= vehicle.getPrice() && endRange >= vehicle.getPrice()) {
                System.out.println(vehicle);
            }
        }
    }
}
