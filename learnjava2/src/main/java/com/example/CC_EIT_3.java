package com.example;

import java.util.Scanner;

/**
 * Created by A0262 on 9/28/2016.
 */
class CC_EIT_3 {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        Integer no_of_Inputs=sc.nextInt();
        Integer Divisor=sc.nextInt();
        Integer Counter=0;
            for(int i=1;i<=no_of_Inputs;i++){
                if(sc.hasNextInt()) {
                    Integer number = sc.nextInt();
                    if (number % Divisor == 0) Counter++;
                }
            }
        System.out.println(Counter);
    }
}
