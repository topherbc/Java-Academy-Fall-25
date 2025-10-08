package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("---Welcome to Super Duper's Product Inventory System---\n");
        while(true) {
            menu();
            menuSelector();
        }
    }

    public static void menu() {
        System.out.println("What do you want to do?\n" +
                "  1- List all products\n" +
                "  2- Lookup a product by its id\n" +
                "  3- Find all products within a price range\n" +
                "  4- Add a new product\n" +
                "  5- Quit the application\n");
    }

    public static void menuSelector() {
        ArrayList<Product> inventory = getInventory();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                System.out.println();
                viewAll(inventory);
                break;
            case 2:
                //searchProductByID(inventory, id)
                break;
            case 3:
                System.out.print("Enter a starting value: ");
                int startRange = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter a ending value: ");
                int endRange = scanner.nextInt();
                scanner.nextLine();

                searchProductByPriceRange(inventory, startRange, endRange);
                break;
            case 4:
                //addProduct()
                break;
            case 5:
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Incorrect option entered, try again");
        }

        System.out.println("\nPress ENTER to continue...\n");
        scanner.nextLine();

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        // Unused Manual Product Creation
        //            inventory.add(new Product(1234, "Cabin Air Filter", 17.00f));
        //            inventory.add(new Product(1235, "Engine Oil 5W-30", 24.99f));
        //            inventory.add(new Product(1236, "Brake Pads Set", 45.50f));
        //            inventory.add(new Product(1237, "Windshield Wiper Blades", 19.95f));
        //            inventory.add(new Product(1238, "Car Battery", 89.99f));
        //            inventory.add(new Product(1239, "Spark Plugs 4-Pack", 32.75f));

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));

            String input;

            while((input = bufReader.readLine()) != null) {
                String[] tokens = input.split("\\|");

                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                float price = Float.parseFloat(tokens[2]);

                inventory.add(new Product(id, name, price));
            }

            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inventory;
    }

    public static void searchProductByPriceRange(ArrayList<Product> inventory, int startRange, int endRange) {
        for (Product p : inventory) {
            if (startRange <= p.getPrice() && endRange >= p.getPrice()) {
                displayProduct(p);
            }
        }
    }

    public static void viewAll(ArrayList<Product> inventory) {
        for (Product inventoryItem : inventory) {
            displayProduct(inventoryItem);
        }
    }

    public static void displayProduct(Product p) {
        System.out.printf("Product: %d\n  Name: %s\n  Price: $%.2f\n\n", p.getId(), p.getName(), p.getPrice());
    }
}
