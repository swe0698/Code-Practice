package com.example.java;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j;
        int n = s.nextInt();
        int[][] a = new int [n][n];
        for(i = 0; i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        int sum=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j)
                    sum+=a[i][j];

            }
        }
        System.out.println(sum);
        int sum1=0;
        for(i=(n-1);i>=0;i--){
            for(j=(n-1);j>=0;j--){
                if(i==j)
                    sum1+=a[i][j];
            }
        }
        System.out.println(sum1);
        int res = sum-sum1;
        System.out.println(res);
    }
}
