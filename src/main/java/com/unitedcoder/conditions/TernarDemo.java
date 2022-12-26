package com.unitedcoder.conditions;

import java.util.Scanner;

public class TernarDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pleas enter first digit number:");
        int number=input.nextInt();
        System.out.println("pleas enter second digit number:");
        int number1=input.nextInt();
        int maxNumber=number>number1?number:number1;
        System.out.println("max number is :"+maxNumber);
    }
}
