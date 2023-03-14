package com.employeePayrollservices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayroll {

    public  static List<EmployeePayroll> empList = new ArrayList<>();

    public EmployeePayroll(int id, String name, double salary) {
    }

   public EmployeePayroll() {

    }

    public void readEmployeeData(Scanner scanner){
        System.out.println("Enter the id:");
        int id = scanner.nextInt();
        System.out.println("Enter the name:");
        String name = scanner.next();
        System.out.println("Enter the Salary:");
        double salary = scanner.nextInt();
        empList.add(new EmployeePayroll(id,name,salary));
    }
    public void writeEmployeeData(){
        empList.forEach(System.out::println);
    }
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        EmployeePayroll employeeObj= new EmployeePayroll();
        employeeObj.readEmployeeData(scanner);
        employeeObj.writeEmployeeData();
    }

}

