package com.example;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Created by A0262 on 9/18/2016.
 */
public class Copied {


        public static void main (String[] args) throws java.lang.Exception
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int test = Integer.parseInt(br.readLine());
            for(int i=1;i<=test;i++)
            {
                int zero=0,one = 0;
                String num = br.readLine();
//                num.trim();
                int flag=1;
                for(int j=0;j<num.length();j++)
                {
                    char  temp = num.charAt(j);
                    if(temp =='1')
                    {
                        one++;
                    }
                    else if(temp=='0')
                    {
                        zero++;
                    }
                    else
                    {
                        System.out.println("No");
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                {
                    if(one==1||zero==1)
                    {
                        System.out.println("Yes");
                    }
                    else
                    {
                        System.out.println("No");
                    }
                }

            }
        }
    }

