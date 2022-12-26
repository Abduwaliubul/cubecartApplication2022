package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String number=input.next();
        if (StringUtils.isNumeric(number)){
            switch (number.length()){
                case 1:
                    System.out.println("one digit");
                    break;
                case 2:
                    System.out.println("two digit");
                    break;
                case 3:
                    System.out.println("three digit");
                    break;
                default:
                    System.out.println("number is equal to or greated than 1000");

            }
        }
        else {
            System.out.println("pleas inter digit number");
        }
    /* int number=input.nextInt();
      if (number>0&&number<10){
          System.out.println("one digit");
      }
      else  if (number>=10&&number<100){
          System.out.println("tow digit");
      }
      else if (number>=100&&number<1000){
          System.out.println("three digits");
      }
      else {
          System.out.println("number is great tan 1000");
      }*/

    }
}
