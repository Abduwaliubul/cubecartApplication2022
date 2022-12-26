package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMDemo3 {
    public static void main(String[] args) {
        // PIN number
        int correctPIN=1234;

        int balance=100000;

        Scanner input=new Scanner(System.in);
        System.out.println("please enter your pin number");
        String pin=input.nextLine();
        if (StringUtils.isNumeric(pin)){
                if (Integer.parseInt(pin)==correctPIN){
                    System.out.println("please select the menu :Transer money,deposit money ,withdraw money");
                String selectedMenu=input.nextLine();
                if (selectedMenu.equalsIgnoreCase("withdraw money")){
                    System.out.println("please select withdraw amount!!");
                    int withDrawAmount=input.nextInt();
                    if (withDrawAmount<=balance);
                    System.out.println("please take you money!!Enjoy!!!");
                    System.out.printf("you current balance is %d\n",balance-withDrawAmount);
                }else {
                    System.out.println("Insufficient amount");
                    System.out.println("withdraw amount is greater than your balance!!!");
                }

            }
                else {
                    System.out.println("you enter wrong pin number,please try again with correct pin!!");
                }
        }
        else {
            System.out.println("please enter valid 4 digit numbers ");
            System.out.println("please try again with correct digit pin number");

        }
    }
}
