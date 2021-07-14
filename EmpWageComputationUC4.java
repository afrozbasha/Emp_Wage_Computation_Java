package com.EmpWageComputationUC4;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Wage_HR = 20;
        int Day_HRs = 8;
        int Part_HRs = 8;

        Random random = new Random();
        int r = random.nextInt(2);
        switch (r){
            case 1:
                System.out.println("Employee Present");
                System.out.println("DayWage = " + Wage_HR * Day_HRs);
                break;
            case 2:
                System.out.println("Employee Present");
                System.out.println("DayWage with Part Time = " + Wage_HR * (Day_HRs + Part_HRs));
                break;
            case 0:
                System.out.println("Employee Absent");
        }
    }
}
