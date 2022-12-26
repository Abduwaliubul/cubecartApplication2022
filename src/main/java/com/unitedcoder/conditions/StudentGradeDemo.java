package com.unitedcoder.conditions;

import java.util.Scanner;

public class StudentGradeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your score");
        int score = input.nextInt();

        if (score <= 100) {

            if (score >= 90 && score <= 100) {
                System.out.println("Gret!! Good job!! you grade is 'A',you win an Ipad!!");
            } else if (score >= 80 && score < 90) {
                System.out.println("Good job!!! you grade is 'B',you win an iphone ");
            } else if (score >= 70 && score < 80) {
                System.out.println("you garden is 'C'");
            } else if (score >= 60 && score < 70) {
                System.out.println("you grade is 'D'");
            } else {
                System.out.println("you failed the exam ,please work hard!");
            }
        } else {
            System.out.println("wrong score!! please enter scores between 0-100!!");
        }
    }}





