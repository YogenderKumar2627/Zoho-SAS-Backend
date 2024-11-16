package day3;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Scanner;

public class EmployeeDetailJSON {
    public static void main(String[] args) {
        JSONObject employee1=new JSONObject();
        employee1.put("id",1);
        employee1.put("Name","Abhi");
        employee1.put("Role","Tester");
        employee1.put("Salary",40000);
        JSONObject employee2=new JSONObject();
        employee2.put("id",2);
        employee2.put("Name","Ajii");
        employee2.put("Role","Backend");
        employee2.put("Salary",60000);
        JSONObject employee3=new JSONObject();
        employee3.put("id",3);
        employee3.put("Name","Sandee");
        employee3.put("Role","Manager");
        employee3.put("Salary",70000);
        JSONArray Employees=new JSONArray();
        Employees.put(employee1);
        Employees.put(employee2);
        Employees.put(employee3);
        for(int i=0;i<Employees.length();i++) {
            System.out.println(Employees.get(i));
        }


    }
}
