package com.example;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by A0262 on 9/28/2016.
 */
class CC_EIT_3 {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        Long no_of_Inputs=sc.nextLong();
        Long Divisor=sc.nextLong();
        Long Limit=(long) Math.pow(10,9);
        Integer Counter=0;
        if((Divisor >0) && (Divisor<=Math.pow(10,7))){
            for(int i=1;i<=no_of_Inputs;i++){
                Long number=sc.nextLong();
                if(number>Limit) break;
                if(number%Divisor==0 ) Counter++;
            }
        }
        System.out.println(Counter);
    }
}
