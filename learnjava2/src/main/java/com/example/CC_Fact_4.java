package com.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by A0262 on 10/4/2016.
 */
public class CC_Fact_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()) {
            Integer No_of_inputs = sc.nextInt();
            int Output[] = new int[No_of_inputs];
            for (int i = 0; i < No_of_inputs; i++) {
                Output[i] = fact_zero(sc.nextInt());
            }
            for (int j = 0; j < No_of_inputs; j++) {
                System.out.println(Output[j]);
                ;
            }
        }
    }
    public static int fact_zero(int n){
        int val=0;
        Double Zero;
        for(int i=2;i<=n;i++){
            if(i % 5 == 0) {
                if(i% 25 == 0 ){
                    Zero = (Math.log(i)/Math.log(5));
                    val=val+Zero.intValue();
                }
                else val=val+1;
            }
        }
        return val;
    }
}
