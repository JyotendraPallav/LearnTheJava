package com.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by A0262 on 10/6/2016.
 */
class CC_Sort_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()) {
            int No_of_inputs = sc.nextInt();
            int input[]=new int[No_of_inputs];
            for(int K=0;K<No_of_inputs;K++){
                input[K]=sc.nextInt();
            }
            Arrays.sort(input);
            for(int number: input){
                System.out.println(number);
            }
        }
    }
}
