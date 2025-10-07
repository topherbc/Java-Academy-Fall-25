package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

//            bufReader.readLine(); //Alternative method to skip first line of csv file

            String input;

            Employee[] employeeList = new Employee[10];

            int count = 0;


            while((input = bufReader.readLine()) != null) {
                String[] tokens = input.split("\\|");
                if (!tokens[0].equals("id")) { //Skipping the header row

                    int id = Integer.parseInt(tokens[0]); //id
                    String name = tokens[1];
                    double hoursWorked = Double.parseDouble(tokens[2]);
                    double payRate = Double.parseDouble(tokens[3]);

                    employeeList[count] = new Employee(id, name, hoursWorked, payRate);

                    System.out.printf("EmployeeID: %d\nEmployee Name: %s\nGross Pay: $%.2f\n\n", employeeList[count].getEmployeeId(), employeeList[count].getName(), employeeList[count].getGrossPay());

                    count++;
                }

            }

            System.out.println(employeeList[0].getName());

            bufReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
