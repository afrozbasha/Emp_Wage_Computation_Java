package com.EmpWageComputationUC5;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Wage_HR = 20;
        int Day_HRs = 8;
        int Part_HRs = 8;
        int NumDays = 20;
        double daywage = 0;
        double monthwage = 0;

        Random random = new Random();

        for (int i =0; i<NumDays; i++){
            int r = random.nextInt(3);
            switch (r){
                case 1:
                    daywage = Wage_HR * Day_HRs * i;
                    break;
                case 2:
                    daywage = Wage_HR * (Day_HRs + Part_HRs) * i;
                    break;
                case 0:
                    break;

            }
            monthwage = monthwage + daywage;
        }
        System.out.println("Month Wage : " + monthwage);


    }
}
