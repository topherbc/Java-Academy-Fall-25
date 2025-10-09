package com.pluralsight;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        run(); //Activate / Invoke / Calling
    }

    public static void run() {
        System.out.println("---Welcome to Super Duper's Product Inventory System---\n");

        while(true) { //Keeping calling both methods, until... something
            menu(); //Invoke
            menuSelector(); //Invoke
        }
    }

    public static void menu() {
        System.out.println("What do you want to do?");
        System.out.println("  1- List all products");
        System.out.println("  2- Lookup a product by its id");
        System.out.println("  3- Find all products within a price range");
        System.out.println("  4- Find a product by name");
        System.out.println("  5- Add a new product");
        System.out.println("  0- Quit the application");
        System.out.println();
    }

    public static void menuSelector() {
        HashMap<String,Product> inventory = loadInventory();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Chose a number option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); //Consume the Return/new line/CRLF

        switch (option) {
            case 1:
                viewAll(inventory);
                break;
            case 2:
                searchProductByID(inventory, scanner);
                break;
            case 3:
                searchProductByPriceRange(inventory, scanner);
                break;
            case 4:
                searchProductByName(inventory, scanner);
                break;
            case 5:
                addProduct(scanner);
                break;
            case 0:
                exitProgram(scanner);
                break;
            default:
                System.out.println("Incorrect option entered, try again");
        }

        System.out.println("\nPress ENTER to continue...");
        scanner.nextLine(); //Handles the ENTER key
    }

    public static HashMap<String,Product> loadInventory() {
        HashMap<String,Product> inventory = new HashMap<>();

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));

            String input;

            while((input = bufReader.readLine()) != null) {
                String[] tokens = input.split("\\|"); //Input from CSV, the data, split by |

                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                float price = Float.parseFloat(tokens[2]);

                inventory.put(name, new Product(id, name, price));
            }

            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace(); //Error chain
        }

        return inventory;
    }

    public static void addProduct(Scanner scanner) {
        System.out.println("--Welcome to the Product Admin Page--\n");
        System.out.println("Please begin by entering the Product info");

        System.out.print("  Enter the ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); //Handle Enter

        System.out.print("  Enter the Name: ");
        String name = scanner.nextLine();

        System.out.print("  Enter the Price (numbers/decimal only): ");
        float price = scanner.nextFloat();
        scanner.nextLine(); //Handle Enter

        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/inventory.csv", true));
            bufWriter.newLine();
            bufWriter.write(String.format("%d|%s|%.2f", id, name, price));
            bufWriter.close(); //Saves file
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void searchProductByPriceRange(HashMap<String,Product> inventory, Scanner scanner) {
        System.out.print("Enter a starting value: ");
        int startRange = scanner.nextInt();
        scanner.nextLine(); //absorb new line because nextInt above

        System.out.print("Enter a ending value: ");
        int endRange = scanner.nextInt();
        scanner.nextLine();

        System.out.println(); //empty line

        for (Product p : inventory.values()) {
            if (startRange <= p.getPrice() && endRange >= p.getPrice()) {
                displayProduct(p);
            }
        }
    }

    public static void searchProductByID(HashMap<String,Product> inventory, Scanner scanner) {
        System.out.print("Enter an id to search: ");
        int id = scanner.nextInt();
        scanner.nextLine(); //Consume CRLF/New Line Character

        System.out.println(); //empty line

        for (Product p : inventory.values()) {
            if (p.getId() == id) {
                displayProduct(p);
            }
        }
    }

    public static void searchProductByName(HashMap<String,Product> inventory, Scanner scanner) {
        System.out.print("Enter an name to search: ");
        String name = scanner.nextLine().trim();

        System.out.println(); //empty line

//        displayProduct(inventory.get(name));

//        for (Product p : inventory.values()) {
//            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
//                displayProduct(p);
//            }
//        }

        for (String key : inventory.keySet()) {
            if (key.toLowerCase().contains(name.toLowerCase())) {
                displayProduct(inventory.get(key));
            }
        }
    }

    public static void viewAll(HashMap<String,Product> inventory) {
        System.out.println(); //empty line

        for (Product inventoryItem : inventory.values()) {
            displayProduct(inventoryItem);
        }
    }

    public static void displayProduct(Product p) {
        System.out.printf("Product: %d\n  Name: %s\n  Price: $%.2f\n\n", p.getId(), p.getName(), p.getPrice());
    }

    public static void exitProgram(Scanner scanner) {
        scanner.close();
        System.exit(0);
    }
}
