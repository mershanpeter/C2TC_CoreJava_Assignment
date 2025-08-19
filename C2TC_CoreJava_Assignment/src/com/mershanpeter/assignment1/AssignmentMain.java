package com.mershanpeter.assignment1;

import com.mershanpeter.assignment1.*;
import com.mershanpeter.assignment1.employees.Developer;
import com.mershanpeter.assignment1.employees.Manager;
import com.mershanpeter.assignment1.utilities.*;


public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager and Developer objects
        Manager mgr = new Manager("Alice", "M101", 90000, "HR");
        Developer dev = new Developer("Bob", "D202", 75000, "Java");

        // Use utilities
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);

        // Update salary
        EmployeeUtilities.increaseSalary(mgr, 10);
        EmployeeUtilities.increaseSalary(dev, 15);
    }
}
