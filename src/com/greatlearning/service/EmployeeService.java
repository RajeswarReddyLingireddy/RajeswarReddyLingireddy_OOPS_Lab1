package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface EmployeeService {


    String generateEmailID(String firstName,String lastName,String deptName);

    String generatePassord();

    void showEmployeeDetails(Employee e);
}
