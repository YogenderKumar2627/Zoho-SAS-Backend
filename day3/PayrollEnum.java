package day3;

enum Salary {
    MANAGER("Manager", 70000),
    TEAMLEADER("Team Leader", 60000),
    DEVELOPER("Developer", 40000),
    TESTER("Tester", 30000);

    private final String position;
    private final int salary;

    Salary(String position, int salary) {
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
}

class Employee {
    private String name;
    private Salary position;

    Employee(String name, Salary position) {
        this.name = name;
        this.position = position;
    }

    public void displaySalary() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position.getPosition());
        System.out.println("Salary: " + position.getSalary());
        System.out.println("");
    }
}

public class PayrollEnum {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sandee", Salary.MANAGER);
        Employee emp2 = new Employee("Abhi", Salary.DEVELOPER);

        emp1.displaySalary();
        emp2.displaySalary();
    }
}
