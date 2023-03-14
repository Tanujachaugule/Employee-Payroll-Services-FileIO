package com.employeePayrollservices;

public class EmployeePayrollServices {

    int id;
    String name;
    double salary;
    public EmployeePayrollServices(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CreateEmployeeDetails{" + "id=" + id + ", name='" + name + '\'' +
                ", salary=" + salary + '}';
    }
}


