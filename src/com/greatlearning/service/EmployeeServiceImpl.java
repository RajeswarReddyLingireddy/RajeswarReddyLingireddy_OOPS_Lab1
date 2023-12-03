package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Random;

public class EmployeeServiceImpl implements EmployeeService{


    @Override
    public String generateEmailID(String firstName, String lastName, String deptName) {

        return firstName+lastName+"."+deptName+"@greatlearning.com";
    }

    @Override
    public String generatePassord() {
        String caps ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers ="0123456789";
        String splCahrs = "!@#$%^&*()";
        Random random = new Random();
        String myPass="";

        String combined = caps+lower+numbers+splCahrs;

        for(int i=1;i<=8;i++){
            myPass = myPass +String.valueOf(combined.charAt(random.nextInt(combined.length())));
        }
        return myPass;
    }

    @Override
    public void showEmployeeDetails(Employee e) {
        System.out.println("Employee First Name is : "+e.getFirstName());
        System.out.println("Employee Last Name is : "+e.getLastName());
          System.out.println("Employee Email id : "+e.getEmail());
          System.out.println("Employee Password : "+e.getPassword());

    }
}
