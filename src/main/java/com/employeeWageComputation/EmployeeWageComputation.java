package com.employeeWageComputation;

public class EmployeeWageComputation {

    public static int get_Working_Hours(int checkWorking) {
        final int FULL_TIME = 1;
        final int PART_TIME = 0;
        int workingHours = 0;
        switch (checkWorking) {
            case FULL_TIME:
                workingHours = 8;
                break;
            case PART_TIME:
                workingHours = 4;
                break;
            default:
                workingHours = 0;
        }
        return workingHours;
    }

    public static void main(String[] args) {
        int WORKING_DAYS_PER_MONTH = 20;
        int WAGE_PER_HOUR = 20;
        int TOTAL_HOURS = 100;
        int montlyWage = 0;
        int totalDays = 0;
        int totalHours = 0;
        int workingHours = 8;
        System.out.println("Welcome to Employee Wage Computation");

        while (totalDays < WORKING_DAYS_PER_MONTH && totalHours < TOTAL_HOURS) {
            totalDays++;
            int checkWorking = (int) (Math.random() * 3);
            workingHours = get_Working_Hours(checkWorking);
            totalHours += workingHours;
        }

        montlyWage = (WAGE_PER_HOUR * totalHours);
        System.out.println("Montly Wage :" + montlyWage);
    }
}

