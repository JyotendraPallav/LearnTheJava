package com.example;

import java.util.ArrayList;

/**
 * Created by A0262 on 9/17/2016.
 */
public class Array {

    public static void main(String[] args) {

        ArrayList idiot = new ArrayList();

        idiot.add("Appy");
        idiot.add("Anni");

        System.out.println(idiot.get(0));
        idiot.remove("Appy");
        System.out.println(idiot.get(0));
    }

    }


