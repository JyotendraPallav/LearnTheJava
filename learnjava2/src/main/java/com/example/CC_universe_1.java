package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by A0262 on 9/26/2016.
 */
class CC_universe_1 {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer number=Integer.parseInt(br.readLine());
        while(number != 42) {
            System.out.println(number);
            number = Integer.parseInt(br.readLine());
           /* if(number ==42) {
                break;
            }*/
        }
    }
}
