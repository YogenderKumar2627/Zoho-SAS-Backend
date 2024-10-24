package day1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeFile {
    public static void main(String[] args) throws IOException {
        boolean flag=true;
        while(flag) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Employee Description\n" +
                    "1.Display Employee Description\n" +
                    "2.Add Employee Description\n" +
                    "3.Delete Employee Description\n" +
                    "4.Exit\n" +
                    "Enter your choice:");
            String ch = scan.nextLine();

            File file = new File("Employee.txt");
            file.createNewFile();
            if (ch.equals("1")) {
                ArrayList<String> EmployeeDetails = readEmployee(file);
                for (String s : EmployeeDetails) {
                    System.out.println(s);
                }
            }
            else if (ch.equals("2")) {
                Scanner obj=new Scanner(System.in);
                System.out.println("Enter the EmployeeName:");
                String name= obj.nextLine();
                System.out.println("Enter the EmployeeDescription:");
                String description= obj.nextLine();
                addEmployee(file,name,description);
                System.out.println("Employee description added successfully");
            }
            else if (ch.equals("3")) {
                Scanner obj=new Scanner(System.in);
                System.out.println("Enter the EmployeeName to delete:");
                String name= obj.nextLine();
                deleteEmployee(file,name);

            }
            else if (ch.equals("4")) {
                flag=false;
            }
            else{
                System.out.println("Invalid input");
            }
        }

    }
    public static ArrayList<String> readEmployee(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        ArrayList<String> EmployeeDetails = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            EmployeeDetails.add(line);
        }
        reader.close();
        return EmployeeDetails;
    }
    public static void addEmployee(File file,String name,String description) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
        writer.write(name);
        writer.newLine();
        writer.write(description);
        writer.newLine();
        writer.newLine();
        writer.close();
    }
    public static void deleteEmployee(File file, String name) throws IOException {
        try{
            ArrayList<String> EmployeeDetails = readEmployee(file);
            int index = EmployeeDetails.indexOf(name);
            if (index==-1){
                System.out.println("Id doesn't exists");
            }
            else{
                BufferedWriter writer1 = new BufferedWriter(new FileWriter(file));
                writer1.close();
                BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
                for(int i=0;i<EmployeeDetails.size()-3;i=i+3){
                    if (index==i){
                        System.out.println("Deleted Succesfully");
                        continue;
                    }
                    else{
                        writer.write(EmployeeDetails.get(i));
                        writer.newLine();
                        writer.write(EmployeeDetails.get(i+1));
                        writer.newLine();
                        writer.newLine();
                    }

                }
                writer.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }


}
