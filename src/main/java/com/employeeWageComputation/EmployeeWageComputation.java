package com.employeeWageComputation;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        int PRESENT = 1;
        int FULLTIME = 1;
        int WAGE_PER_HOUR = 20;
        int workingHours = 8;
        int dailyWage = 0;

        System.out.println("Welcome to Employee Wage Computation");

        int checkPresentOrAbsent = (int) (Math.random() * 2); //check employee present or not using random function

        if (checkPresentOrAbsent == PRESENT) {

            int checkWorking = (int) (Math.random() * 2);

            if (checkWorking == FULLTIME)
                workingHours = 8;
            else
                workingHours = 4;

            dailyWage = (WAGE_PER_HOUR * workingHours);
            System.out.println("Daily Employee Wage:" + dailyWage);
        } else {
            System.out.print("Employee is absent");
        }
    }
}
