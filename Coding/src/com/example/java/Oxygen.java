package com.example.java;
/*Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record their oxygen level after every round. After trainee are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, they all need to be selected.

Display the most fit trainee (or trainees) and the highest average oxygen level.*/

import java.util.Scanner;

public class Oxygen {
 public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     int[][] a = new int[3][3];
     int[] b = new int[3];
     int max =0;
     for(int i =0; i<3; i++){
         for(int j =0; j<3; j++){
            a[i][j] = s.nextInt();
            if(a[i][j]==0 || a[i][j]==100)
                a[i][j]=0;
         }
     }
     for(int i =0; i<3;i++){
         int average = 0;
         for(int j=0;j<3;j++){
             average+=a[j][i];
         }
         b[i]=average/3;
     }
    // max = b[0];
     for (int i = 0; i<3; i++){
         if(max<b[i])
             max = b[i];
     }
     for(int i = 0; i<3; i++){
         if(b[i]==max)
             System.out.println("Trainee Number:"+(i+1));

     }
 }
}
