package com.employeeWageComputation;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        int PRESENT = 1;

        System.out.println("Welcome to Employee Wage Computation");

        int checkPresentOrAbsent = (int) (Math.random() * 2); //check employee present or not using random function

        if (checkPresentOrAbsent == PRESENT)
            System.out.print("Employee is present");
        else
            System.out.print("Employee is absent");
    }
}
