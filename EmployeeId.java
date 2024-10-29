package day2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class EmployeeId {
    public void hashMap(){
        HashMap<Integer,String> EmployeeDetails=new HashMap<>();
        try{
            EmployeeDetails.put(1, "Yogi");
            EmployeeDetails.put(2, "Sandee");
            EmployeeDetails.put(null, "Abhi");
            EmployeeDetails.put(3, null);
            EmployeeDetails.put(4, null);
            System.out.println(EmployeeDetails);
            System.out.println("No Error occurs has it allows null key and null Value but the order is auto arranged");
            System.out.println();

        } catch (Exception e) {
            System.out.println(EmployeeDetails);
            System.out.println("Error message: "+e.getMessage());
        }

    }
    public void hashTable(){
        Hashtable<Integer,String> EmployeeDetails=new Hashtable<>();
        try{
            EmployeeDetails.put(1, "Yogi");
            EmployeeDetails.put(2, "Sandee");
            EmployeeDetails.put(null, "Abhi");
            EmployeeDetails.put(3, null);
            EmployeeDetails.put(4, null);
            System.out.println(EmployeeDetails);
        } catch (Exception e) {
            System.out.println(EmployeeDetails);
            System.out.println("Error message: "+e.getMessage());
            System.out.println("Error occurs has it does not allows null key and null Value");
            System.out.println();
        }

    }
    public void linkedHashMap(){
        LinkedHashMap<Integer,String> EmployeeDetails=new LinkedHashMap<>();
        try{
            EmployeeDetails.put(1, "Yogi");
            EmployeeDetails.put(2, "Sandee");
            EmployeeDetails.put(null, "Abhi");
            EmployeeDetails.put(3, null);
            EmployeeDetails.put(4, null);
            System.out.println(EmployeeDetails);
            System.out.println("No Error occurs has it allows null key and null Value and the order is in inserted order");
            System.out.println();

        } catch (Exception e) {
            System.out.println(EmployeeDetails);
            System.out.println("Error message: "+e.getMessage());
        }

    }

    public static void main(String[] args) {
        EmployeeId employeeId=new EmployeeId();
        employeeId.hashMap();
        employeeId.hashTable();
        employeeId.linkedHashMap();
    }
}
