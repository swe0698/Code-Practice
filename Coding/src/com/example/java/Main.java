package com.example.java;

import java.util.Scanner;

/***
 * There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers. JAR is never remain empty as when last k candies are left. JAR if refilled with new candies in such a way that JAR get full.
 * Write a code to implement above scenario. Display JAR at counter with available number of candies. Input should be the number of candies one customer can order at point of time. Update the JAR after each purchase and display JAR at Counter.
 *
 * Output should give number of Candies sold and updated number of Candies in JAR.
 *
 * If Input is more than candies in JAR, return: “INVALID INPUT”
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k =0;
        if(n<=5) {
            k = 10 - n;
            System.out.println("No of candies sold:" + n);
            System.out.println("No of candies available:" + k);
        }
        else {
            System.out.println("Invalid input");
            System.out.println("No of candies available:10");
        }

    }
}
