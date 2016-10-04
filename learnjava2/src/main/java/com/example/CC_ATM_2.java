package com.example;


import java.util.Scanner;

/**
 * Created by A0262 on 9/27/2016.
 */
class CC_ATM_2 {
    public static void main(String[] args) {
        Scanner WD = new Scanner(System.in);
        System.out.println("Please enter withdrawl amount:");
        double Withdrawl = WD.nextInt();

        System.out.println("Please enter your balance amount:");
        double Balance = WD.nextDouble();

        double Bank_Charge = 0.50;
        double Display =Balance;

        if(Withdrawl%5==0){
            if(Withdrawl<=(Balance-0.50)){
                System.out.println("Please take your money!!");
                Display=Balance-Withdrawl-0.5;
            }
            else
                System.out.println("You don't have enough money in your account");
        }
        else
            System.out.println("Your withdrawl is not in multiple of 5");

        System.out.printf( "Your current balance is: %.2f",Display);
    }
}
