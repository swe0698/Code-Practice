package com.example.java;

import java.util.Objects;
import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pName = s.nextLine();
        String choice = s.nextLine();

        StringBuilder edits = new StringBuilder();

        if(choice=="Y" || choice=="y") {
            String cName = s.nextLine();
            if (cName.contains(",")) {
                edits.append(cName.split(","));
                System.out.println("Total Members = 3");
                System.out.println("Commission Details");
                System.out.println(pName + ": 1000INR");
                for (int j = 0; j < edits.length(); j++) {
                    System.out.println(edits.toString() + ": 250INR");
                }
            } else {
                System.out.println("Total Members = 2");
                System.out.println("Commission Details");
                System.out.println(pName + ": 500INR");
                System.out.println(cName + ": 250INR");
            }
        }
           else if (choice=="N"||choice=="n"){
                System.out.println("Total Members = 1");
                System.out.println("Commission Details");
                System.out.println(pName +": 250INR");
            }

           else{
               System.out.println("Invalid choice");
        }
            }

        }




