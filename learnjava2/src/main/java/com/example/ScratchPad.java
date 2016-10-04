package com.example;

public class ScratchPad {
    public static void main(String[] args) {

        String Vehicle = "Truck";
        String make = "Chevy";
        String model = "Tahoe";

        String fullVehicledetails = Vehicle + " - " + make + " : " + model;
        System.out.println(fullVehicledetails);

        String upper = "CRAZY BEAST";
        String lower = upper.toLowerCase();

        System.out.println(lower);

        int accountbalance = 500;

        String printbalance = String.format("Your Account balance is %d",accountbalance);

        System.out.println(printbalance );
    }
}
