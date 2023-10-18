package com.mycompany.numericdata;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        double dailyAverage = 0;
        double monthlyAverage = 0;
        double monthlyProfit = 0;
        //dayly average
        dailyAverage += 100;
        dailyAverage += 121;
        dailyAverage += 117;
        
        dailyAverage /= 3;
        //Monthly average
        monthlyAverage = dailyAverage * 30;
        
        //Monthly profit
        monthlyProfit = (double) (monthlyAverage * 0.18);
                
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
