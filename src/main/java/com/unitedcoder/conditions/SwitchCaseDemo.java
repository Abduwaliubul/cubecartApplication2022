package com.unitedcoder.conditions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        // int month=1; // letter form january
     /*   if (month==1)
            System.out.println("it is january!");
        else if (month==6)
            System.out.println("it is june");*/

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number from 1 to 12 for a month");
        String month = input.next();
        if (StringUtils.isNumeric(month)) {
            switch (Integer.parseInt(month)) {
                case 1:
                    System.out.println("it is january");
                    break;
                case 2:
                    System.out.println("it is february");
                    break;
                case 3:
                    System.out.println("it is march");
                    break;
                case 4:
                    System.out.println("it is April!!");
                    break;
                case 5:
                    System.out.println("it is May!!");
                    break;
                case 6:
                    System.out.println("it is june!!");
                    break;
                case 7:
                    System.out.println("it is july!!");
                    break;
                case 8:
                    System.out.println("it is August!!");
                    break;
                case 9:
                    System.out.println("it is September");
                    break;
                case 10:
                    System.out.println("it is October!!");
                    break;
                case 11:
                    System.out.println("it is november");
                    break;
                case 12:
                    System.out.println("it is December");
                    break;
                default:
                    System.out.println("please enter a valid number for month!!!");

            }

        }
        else {
            System.out.println("please enter a valid digit number for month!!!");
        }
    }}
