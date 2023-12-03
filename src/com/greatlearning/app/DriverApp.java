package com.greatlearning.app;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImpl;

import java.util.Locale;
import java.util.Scanner;

public class DriverApp {

    public static void main(String[] args) {
        
        EmployeeServiceImpl empImpl = new EmployeeServiceImpl();
        String genEmail ="";
        String genPassword="";

        Scanner sc = new Scanner(System.in);

        System.out.println(" Please enter first name");
        String firstName = sc.next().toLowerCase();

        System.out.println(" Please enter last name");
        String lastName = sc.next().toLowerCase();
        
        System.out.println("Please choose Dept");
        System.out.println("1. Technicle");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        int choice= sc.nextInt();
        sc.close();

        switch (choice){
            case 1 : genEmail =  empImpl.generateEmailID(firstName,lastName,"tech");break;
            case 2 :  genEmail = empImpl.generateEmailID(firstName,lastName,"admin");break;
            case 3 :  genEmail = empImpl.generateEmailID(firstName,lastName,"hr");break;
            case 4 :  genEmail = empImpl.generateEmailID(firstName,lastName,"legal");break;
            default : System.out.println("Please enter valid input");
        }
        genPassword = empImpl.generatePassord();

        Employee e1= new Employee();
        e1.setFirstName(firstName);
        e1.setLastName(lastName);
        e1.setEmail(genEmail);
        e1.setPassword(genPassword);

        empImpl.showEmployeeDetails(e1);
    }
}
