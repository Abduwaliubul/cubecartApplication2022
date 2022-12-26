package com.unitedcoder.dataypes;

import java.util.Scanner;

public class ScannerObject {
    public static void main(String[] args) {
        //define scanner object
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the second digit number");
        int x=scanner.nextInt();
        System.out.println("please enter the second digit number");
        int y=scanner.nextInt();
        System.out.printf("please enter the result of %d + %d\n",x,y);
        int z=scanner.nextInt();

        if (z==x+y){
            System.out.printf("your answer is correct!!!");
        }
        else {
            System.out.printf("wrong answer");
        }
    }
}
