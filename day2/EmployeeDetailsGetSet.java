package day2;

import java.util.Scanner;

class Employee {
    private String name;
    private Long id;
    private String position;
    private double salary;

    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this  .id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeDetailsGetSet {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        employee.setName(scanner.nextLine());
        System.out.println("Enter Employee ID:");
        employee.setId(scanner.nextLong());
        scanner.nextLine();
        System.out.println("Enter Employee Position:");
        employee.setPosition(scanner.nextLine());
        System.out.println("Enter Employee Salary:");
        employee.setSalary(scanner.nextDouble());
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.getName() + "\n" +
                "ID: " + employee.getId() + "\n" +
                "Position: " + employee.getPosition() + "\n" +
                "Salary: " + employee.getSalary());
    }
}
