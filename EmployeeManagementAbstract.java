package day1;

abstract class Employee {
    protected String id;
    protected String name;
    protected int phoneNumber;
    protected int salary;

    public Employee(String id, String name, int phoneNumber, int salary) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public abstract String work();

    public void displayEmployeeInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary: $" + salary);
        System.out.println("Work: " + work());
    }
}

class Android extends Employee {
    public Android(String id, String name, int phoneNumber, int salary) {
        super(id, name, phoneNumber, salary);
    }

    public String work() {
        return "Developing Android applications";
    }
}

class IOS extends Employee {
    public IOS(String id, String name, int phoneNumber, int salary) {
        super(id, name, phoneNumber, salary);
    }

    public String work() {
        return "Developing iOS applications";
    }
}

public class EmployeeManagementAbstract {
    public static void main(String[] args) {
        Android androidDev = new Android("A101", "Steve", 1234567890, 85000);
        IOS iosDev = new IOS("I202", "John", 987654321, 90000);
        androidDev.displayEmployeeInfo();
        iosDev.displayEmployeeInfo();
    }
}

