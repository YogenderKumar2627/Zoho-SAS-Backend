package day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class EmployeeDetailsHashmap {
    private static HashMap<Long, ArrayList<String>> employeeDetails = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Employee Details\n" +
                    "1. Display\n" +
                    "2. Add\n" +
                    "3. Delete\n" +
                    "4. Exit\n" +
                    "Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    display();
                    break;
                case "2":
                    add();
                    break;
                case "3":
                    delete();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    private static void display() {
        for (Long id : employeeDetails.keySet()) {
            System.out.println("Employee ID: " + id + "  Employee Details: " + employeeDetails.get(id));
        }
    }

    private static void add() {
        Random random = new Random();
        Long id = random.nextLong();
        while (employeeDetails.containsKey(id)) {
            id = random.nextLong();
        }
        ArrayList<String> details = new ArrayList<>();
        System.out.println("Enter employee name:");
        details.add(scanner.nextLine());
        System.out.println("Enter employee position:");
        details.add(scanner.nextLine());
        System.out.println("Enter employee salary:");
        details.add(scanner.nextLine());
        System.out.println("Enter employee phone number:");
        details.add(scanner.nextLine());
        employeeDetails.put(id, details);
        System.out.println("Added Successfully");
    }

    private static void delete() {
        System.out.println("Enter employee ID to delete:");
        Long id = scanner.nextLong();
        scanner.nextLine();
        if (employeeDetails.remove(id) != null) {
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("ID does not exist");
        }
    }
}
