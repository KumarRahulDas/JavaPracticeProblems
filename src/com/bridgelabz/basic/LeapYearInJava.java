package com.bridgelabz.basic;

public class LeapYearInJava {
    public static void main (String[]args)
    {

        int year = 2023;

        if (year % 400 == 0)
            System.out.println (year + " is a Leap Year");

        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println (year + " is a Leap Year");

        else
            System.out.println (year + " is not a Leap Year");

    }
}