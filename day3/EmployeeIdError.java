package day3;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeIdError {
    public static void main(String[] args) {
        HashMap<Integer,String> Employee=new HashMap<>();
        Employee.put(1,"Abhi");
        Employee.put(2,"Sandee");
        Employee.put(3,"Yogi");
        Scanner scan =new Scanner(System.in);
        try{
            System.out.println("Enter thr Employee id:");
            int id=scan.nextInt();
            scan.nextLine();
            System.out.println("Emplyee Name: "+getName(Employee,id));
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());//GIVES ERROR When Enter ID in String
            System.out.println("Enter valid id..");
        }
        finally{
            System.out.println("End of employee searching process.");
        }

    }
    public static String getName(HashMap<Integer,String> Employee,int id){
        if(!Employee.containsKey(id)){
            throw new IllegalArgumentException("Id doesn't exist");
        }
        else{
            return Employee.get(id);
        }
    }
}
