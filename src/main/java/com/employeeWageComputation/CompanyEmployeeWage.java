package com.employeeWageComputation;

import java.util.ArrayList;

public class CompanyEmployeeWage {
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 0;
    private String companyName;
    private int wagePerHour;
    private int workingDaysPerMonth;
    private int maxHours;

    public CompanyEmployeeWage(String companyName, int wagePerHour, int workingDaysPerMonth, int maxHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.maxHours = maxHours;
    }

    public ArrayList get_EmployeeWageForCompany() {
        ArrayList arrayList = new ArrayList();
        int totalWage = 0;
        int dailyWage = 0;
        int totalDays = 0;
        int totalHours = 0;
        int workingHours = 0;

        while (totalDays < workingDaysPerMonth && totalHours < maxHours) {
            totalDays++;
            int checkWorking = (int) (Math.random() * 3);
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
            dailyWage = (wagePerHour * workingHours);
            arrayList.add(dailyWage);
        }
        return arrayList;
    }
}
