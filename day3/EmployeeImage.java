package day3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeImage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Employee Name: ");
        String name=scanner.nextLine();
        boolean flag=false;
        for (int i = 0; i<5; i++){
            System.out.println("Enter the image name(with extension): ");
            String image= scanner.nextLine();
            String imagePattern="([^\\s]+(\\.(?i)(jpg|jpeg|png|gif|bmp|tiff|webp))$)";
            if(Pattern.matches(imagePattern,image)){
                flag=true;
                break;
            }
            System.out.println("Enter valid image");
        }
        if(flag) {
            System.out.println("Record inserted...");
        }
        else {
            System.out.println("Try again...");
        }
    }
}
