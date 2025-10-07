package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the name of the file employee file to process: ");
        String importName = keyboard.nextLine().trim();

        System.out.print("Enter the name of the payroll file to create: ");
        String exportName = keyboard.nextLine().trim();

        boolean csvFormat = true;

        if (exportName.endsWith(".json")) {
            csvFormat = false;
        }


        try {
            FileReader fileReader = new FileReader("src/main/resources/" + importName);
            BufferedReader bufReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("src/main/resources/" + exportName);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            String input;

            Employee[] employeeList = new Employee[30];

            int count = 0;

            /**
             * [
             * { "id": 111, "name" : "Cameron Tay", "grossPay" : 3277.65 },
             * { "id": 222, "name" : "James Tee", "grossPay" : 2150.00 }
             * ]
             */

            //FIgure out json v csv header

            if (csvFormat) {
                bufWriter.write("id|name|gross pay\n");
            } else {
                bufWriter.write("[");
                bufWriter.newLine();
            }


            while((input = bufReader.readLine()) != null) {
                String[] tokens = input.split("\\|");
                if (!tokens[0].equals("id")) { //Skipping the header row

                    int id = Integer.parseInt(tokens[0]); //id
                    String name = tokens[1];
                    double hoursWorked = Double.parseDouble(tokens[2]);
                    double payRate = Double.parseDouble(tokens[3]);

                    employeeList[count] = new Employee(id, name, hoursWorked, payRate);

                    /**
                     * The following code is one of two options to write json formatting, with correct commas
                    */

                    String comma = ",";

                    if(!bufReader.ready()) {
                        comma = "";
                    }

                    if(csvFormat) {
                        bufWriter.write(employeeList[count].getEmployeeId() + "|" + employeeList[count].getName() + "|" + employeeList[count].getGrossPay());
                        bufWriter.newLine();
                    } else {
                        bufWriter.write(String.format("{ \"id\": %d, \"name\": \"%s\", \"grossPay\": %.2f }%s", employeeList[count].getEmployeeId(), employeeList[count].getName(), employeeList[count].getGrossPay(), comma));
                        bufWriter.newLine();
                    }

                    count++;
                }
            }


            /**
             * The following code is one of two options to write json formatting, with correct commas
             */

//            int loadingCount = 0;

//            for (Employee employee : employeeList) {
//                if (employee != null && employee.getName() != null) {
//                    String comma = ",";
//
//                    if (count-1 == loadingCount) {
//                        comma = "";
//                    }
//
//                    if(csvFormat) {
//                        bufWriter.write(employee.getEmployeeId() + "|" + employee.getName() + "|" + employee.getGrossPay());
//                        bufWriter.newLine();
//                    } else {
//                        bufWriter.write(String.format("{ \"id\": %d, \"name\": \"%s\", \"grossPay\": %.2f }%s", employee.getEmployeeId(), employee.getName(), employee.getGrossPay(), comma));
//                        bufWriter.newLine();
//                    }
//                    loadingCount++;
//                }
//            }

            if (!csvFormat) {
                bufWriter.write("]");
                bufWriter.newLine();
            }

            bufReader.close();
            bufWriter.close(); //save the file
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
