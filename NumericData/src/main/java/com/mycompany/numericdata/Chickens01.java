package com.mycompany.numericdata;

public class Chickens01 {

    public static void main(String[] args) {
        //Put yout code here
        
        int eggsPerChicken = 4;
        int chickenCount = 8;
        int totalEggs = eggsPerChicken * chickenCount;
        chickenCount += 1;
        totalEggs += eggsPerChicken * chickenCount;
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;
        
        

        System.out.println(totalEggs);
    }   
}
