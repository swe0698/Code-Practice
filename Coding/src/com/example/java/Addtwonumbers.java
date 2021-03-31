package com.example.java;

import java.util.Scanner;

public class Addtwonumbers {

    public static void add(int k1, float k2){
        float sum =0;
        sum = k1 + k2;
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        float n2 = sc.nextFloat();
        add(n1,n2);
    }
}
