package com.unitedcoder.conditions;

import java.util.Scanner;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int month=input.nextInt();
        //3 4 5--spring  6 7 8--summer
        switch (month){
            case 3:
            case 4:
            case 5:
               System.out.println("it is spring");
               break;
            case 6:
            case 7:
            case 8:
                System.out.println("it is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("it is autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("it is winter");
                break;
        }
    }
}
