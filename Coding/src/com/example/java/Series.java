package com.example.java;

import java.util.Scanner;

public class Series {
    public static void main(String[] args){
        int a=7, b=0,c;
        for(int i=1; i<8;i++){
            c = a*b;
            System.out.print(c+ "  "+(c-b)+"  ");
            b++;
        }
        c= a*b;
        System.out.println(c);
        }
    }

