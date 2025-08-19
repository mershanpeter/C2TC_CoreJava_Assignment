package com.mershanpeter.assignment2;

public class Assignment2Main {
    public static void main(String[] args) {
        // Create Student object to test default constructor
        Student s1 = new Student();

        // Create Commission object
        Commission c1 = new Commission();
        c1.acceptDetails();       // Input employee details
        c1.calculateCommission(); // Calculate and display commission
    }
}