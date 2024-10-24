package day1;
class EmployeeDetails {
    protected String name;
    public EmployeeDetails(String name) {
        this.name = name;
    }
    public void displayRole() {
        System.out.println(name + " is a general employee.");
    }
}

class Manager extends EmployeeDetails {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Manager,head of the team");
    }
}

class Developer extends EmployeeDetails {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Developer, developing the program.");
    }
}

public class EmployeeManagementInheritance {
    public static void main(String[] args) {
        EmployeeDetails emp1 = new Manager("Sandeep");
        EmployeeDetails emp2 = new Developer("Abhi");
        emp1.displayRole();
        emp2.displayRole();
    }
}
