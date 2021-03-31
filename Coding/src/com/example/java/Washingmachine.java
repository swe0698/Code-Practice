package com.example.java;

import java.util.Scanner;

/* A washing machine works on the principle of Fuzzy System, the weight of clothes put inside it for washing is uncertain But based on weight measured by sensors, it decides time and water level which can be changed by menus given on the machine control area.

For low level water, the time estimate is 25 minutes, where approximately weight is between 2000 grams or any nonzero positive number below that.

For medium level water, the time estimate is 35 minutes, where approximately weight is between 2001 grams and 4000 grams.

For high level water, the time estimate is 45 minutes, where approximately weight is above 4000 grams.

Assume the capacity of machine is maximum 7000 grams

Where approximately weight is zero, time estimate is 0 minutes.

Write a function which takes a numeric weight in the range [0,7000] as input and produces estimated time as output is: “OVERLOADED”, and for all other inputs, the output statement is

“INVALID INPUT”.*/
public class Washingmachine {
    public static void calculateTime(int k){
        if(k<=2000)
            System.out.println("Time estimate is 25min");
        else if(k>2000 && k<=4000)
            System.out.println("Time estimate is 35min");
        else
            System.out.println("Time estimate is 45min");

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n<0 || n>=7000){
            System.out.println("Invalid input");}
        else {
            calculateTime(n);
        }
    }

}
