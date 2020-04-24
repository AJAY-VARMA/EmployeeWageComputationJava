package com.employeeWageComputation;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        final int FULLTIME = 1;
        final int PARTTIME = 0;
        int WORKINGDAYS_PER_MONTH = 20;
        int WAGE_PER_HOUR = 20;
        int TOTALHOURS = 100;
        int workingHours = 8;
        int montlyWage = 0;
        int totalDays = 0;
        int totalHours = 0;

        System.out.println("Welcome to Employee Wage Computation");

        while (totalDays < WORKINGDAYS_PER_MONTH && totalHours < TOTALHOURS) {
            totalDays++;

            int checkWorking = (int) (Math.random() * 3);

            switch (checkWorking) {
                case FULLTIME:
                    workingHours = 8;
                    break;
                case PARTTIME:
                    workingHours = 4;
                    break;
                default:
                    workingHours = 0;
            }
            totalHours += workingHours;
        }

        montlyWage = (WAGE_PER_HOUR * totalHours);
        System.out.println("Montly Employee Wage:" + montlyWage);
    }
}
