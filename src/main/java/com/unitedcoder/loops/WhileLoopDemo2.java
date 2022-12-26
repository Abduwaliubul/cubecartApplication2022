package com.unitedcoder.loops;

import java.util.Scanner;

public class WhileLoopDemo2 {
    public static void main(String[] args) {

        //scanner 0
        Scanner scanner=new Scanner(System.in);
        //int number=scanner.nextInt();
        int positiveNumberCount=0;
        int negativeNumberCount=0;
        while (true){

          int number = scanner.nextInt();
            if (number>0){
                negativeNumberCount++;
            }
            else {
                break;
            }
        }
        System.out.println("positive Number: "+positiveNumberCount);
        System.out.println("negative Number:"+negativeNumberCount);
    }
}
