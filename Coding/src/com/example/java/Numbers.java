package com.example.java;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        int a=0,b=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            for(int i=0; i<=(n-2); i+=2){
                a = a+2;
                b=a/2;
            }
            System.out.println(b);
        }
        else
        {
            for(int i=0; i<(n-2); i+=2){
                a = a+2;
                b = a/2;
            }
            a = a+2;
            System.out.println(a);
        }
    }
}
