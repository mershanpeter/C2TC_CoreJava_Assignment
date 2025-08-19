package com.mershanpeter.assignment1.utilities;

import com.mershanpeter.assignment1.employees.*;
public class EmployeeUtilities {

    // Print employee details
    public static void printEmployeeDetails(Employee e) {
        System.out.println(e.toString());
    }

    // Increase salary
    public static void increaseSalary(Employee e, double percentage) {
        double newSalary = e.getSalary() + (e.getSalary() * percentage / 100);
        e.setSalary(newSalary);
        System.out.println("Salary updated for " + e.getName() + ": " + newSalary);
    }
}