package com.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by A0262 on 10/4/2016.
 */
public class CC_Fact_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer No_of_inputs=sc.nextInt();
        int Inputs[]=new int[No_of_inputs];
        int Output[]= new int[No_of_inputs];
        for(int i=0;i<No_of_inputs;i++){
            Inputs[i] = sc.nextInt();
            Output[i]=fact_zero(Inputs[i]);
        }
        for(int j=0; j<No_of_inputs;j++){
            System.out.println(Inputs[j]+"! = "+Output[j]);
        }
    }
    public static int fact_zero(int n){
        int val=1;
        int counter=0;
        for(int i=2;i<=n;i++){
            val=val*i;
            System.out.println(val);
        }
        return val;
    }
}
