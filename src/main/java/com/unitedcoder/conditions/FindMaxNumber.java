package com.unitedcoder.conditions;

import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pleas enter first digit number:");
        int number1=input.nextInt();
        System.out.println("pleas enter second digit number:");
        int number2=input.nextInt();
        System.out.println("pleas enter third digit number:");
        int number3=input.nextInt();
        //100 200 300
        if (number1>number2&&number1>number3){
           System.out.printf("%d is biggest number ",number1);
        }
        else if (number2>number3){
            System.out.printf("%d is biggest number ",number2);
        }
        else {
            System.out.printf("%d is biggest number ",number3);
        }
    }
}
