package com.unitedcoder.conditions;

import java.util.Scanner;

public class ATMDemo1 {
    public static void main(String[] args) {
        // PIN number
        int correctPIN=1234;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your pin number");
        int pin=input.nextInt();

        if (pin==correctPIN){
            System.out.println(" you account number is 78654688");
            System.out.println("please account balance is 10000$");
        }
        else {
            System.out.println("you entered wrong pin number ");
            System.out.println("please try again with correct pin number");

        }
    }
}
