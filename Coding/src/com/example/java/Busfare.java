package com.example.java;

import java.util.Scanner;

import static java.lang.Math.ceil;

public class Busfare {
    public static void getFare(String s,String d){
        int path[] = {800, 600, 750, 900, 1400, 1200, 1100, 1500};
        String[] busStops = { "TH", "GA", "IC", "HA", "TE", "LU", "NI","CA"};
        int k =0,m=0,distance;
        float res=0;
        for(int i =0; i<busStops.length;i++){
            if(s.equalsIgnoreCase(busStops[i]))
                k = i;
            if(d.equalsIgnoreCase(busStops[i]))
                m = i;
        }
        if(s.equals(d))
            System.out.println("Invalid Input");
        else{
            int f = k+1;
            while(f!=(m+1)){
                res+=path[f];
                f = (f+1)%8;
            }
            res = (float) ((res/1000)*5);
            System.out.println(ceil(res)+" INR");
        }


    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String source = s.nextLine();
        String destination = s.nextLine();
        getFare(source, destination);
    }
}
