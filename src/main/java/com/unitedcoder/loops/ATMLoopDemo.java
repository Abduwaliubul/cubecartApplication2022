package com.unitedcoder.loops;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMLoopDemo {
    public static void main(String[] args) {
        // PIN number
        int correctPIN = 1234;

        int balance = 100000;

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your pin number");

        int chance = 3;
        int i = 0;
        do {
            i++;
            String pin = input.nextLine();
            if (StringUtils.isNumeric(pin) && Integer.parseInt(pin) == correctPIN) {

                System.out.println("please select the menu :Transer money,deposit money ,withdraw money");
                String selectedMenu = input.nextLine();
                if (selectedMenu.equalsIgnoreCase("withdraw money")) {
                    System.out.println("please select withdraw amount!!");
                    int withDrawAmount = input.nextInt();
                    if (withDrawAmount <= balance) ;
                    System.out.println("please take you money!!Enjoy!!!");
                    System.out.printf("you current balance is %d\n", balance - withDrawAmount);
                } else {
                    System.out.println("Insufficient amount");
                    System.out.println("withdraw amount is greater than your balance!!!");
                }

            } else {
                System.out.println("please enter valid 4 digit numbers ");
                System.out.println("please try again with correct digit pin number");


            System.out.println("you pin number is invalid ,please enter valid 4 digit numbers ");
            System.out.printf("Incorrect pin number , you can only try %d time", chance - i);
            System.out.printf("please enter your pin number again: ");

        }
    }while (i<chance);
    }
    }


