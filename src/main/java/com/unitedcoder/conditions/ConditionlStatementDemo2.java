package com.unitedcoder.conditions;

import java.util.Scanner;

public class ConditionlStatementDemo2 {
    public static void main(String[] args) {

        Scanner number=new Scanner(System.in);
        System.out.printf("Welcom to the game!!!");
        System.out.printf("please enter your age ");
        int age=number.nextInt();

        //if
        if (age>18){ //boolean data type
            //if block
            System.out.println("congratulation !!! you can continue with your game!!!");

        }
        else{
            System.out.printf("you are not qualified for this game");}
    }
}
