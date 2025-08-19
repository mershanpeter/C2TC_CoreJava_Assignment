package com.mershanpeter.assignment1.employees;


public class Employee {
    private String name;
    private String employeeId;
    private double salary;

    // Constructor
    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    protected void setName(String name) {   // protected so subclasses/utilities can use
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    protected void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {  // public so accessible outside
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [Name=" + name + ", ID=" + employeeId + ", Salary=" + salary + "]";
    }
}
