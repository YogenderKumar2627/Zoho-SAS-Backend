package day2;

public class EmployeePayRollExtend {
    public static void main(String[] args) {
        FrontEnd frontEnd=new FrontEnd("Sandee",1500000);
        BackEnd backEnd=new BackEnd("Abhi",220000);
        System.out.println("EmployeeName: "+frontEnd.getName()+"\n"+
                "EmployeeTask: "+frontEnd.getTask()+"\n"+
                "EmployeeSalary: "+frontEnd.getSalary()+"\n");
        System.out.println("EmployeeName: "+backEnd.getName()+"\n"+
                "EmployeeTask: "+backEnd.getTask()+"\n"+
                "EmployeeSalary: "+backEnd.getSalary()+"\n");
    }
}
class Salary{
    private String name;
     private int Salary;

    public Salary(String name, int salary) {
        this.name=name;
        this.Salary=salary;
    }
    public Salary(){}

    public String getName(){
        return name;
    }
    public int getSalary(){
        return Salary;
    }
}
class FrontEnd extends Salary {
    public FrontEnd(String name, int salary) {
        super(name, salary);

    }
    public String getTask() {
        return "Designing and creating UI";
    }
}
class BackEnd extends Salary {
    public BackEnd(String name, int salary) {
        super(name, salary);

    }
    public String getTask() {
        return "Making Server side strong";
    }
}

