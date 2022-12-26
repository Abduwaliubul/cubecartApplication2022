package com.unitedcoder.dataypes;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your school address:");
        String schoolName=input.next();
        System.out.println("please enter your school address");
        String address=input.next();
        System.out.println("please enter your school zipcode:");
        String zipcode=input.nextLine();
        System.out.printf("your school full address is %s %s %s",schoolName,address,zipcode);
    }
}
