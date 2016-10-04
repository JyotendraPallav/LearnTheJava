package com.example;

/**
 * Created by A0262 on 9/17/2016.
 */
public class Mycalls {
    public static void main(String[] args) {
        printName();
        printArea(10,5);
        int area = getArea (5,6);
    }

    public static void printName() {
        System.out.println("Hi, My name is ok, but its ok to ignore it");
    }

    public static void printArea(int length, int width) {
        System.out.println("Area: " + (length * width));
    }

    public static int getArea(int length, int width) {
        return length*width;
    }

}
