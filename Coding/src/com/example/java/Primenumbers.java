package com.example.java;

import java.util.Scanner;

public class Primenumbers {

    public static void primenumber(int m){
        int choice = 0;
        for(int i=2; i<=m; i++){
            if(m%i==0){
                choice++;
            }
        }
        if(choice==1)
            System.out.print("Prime number");
        else
            System.out.println("Composite");
    }

    public static void check(int k){
        if(k>=0)
            primenumber(k);
        else
            System.out.println("Enter a positive number");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
}
