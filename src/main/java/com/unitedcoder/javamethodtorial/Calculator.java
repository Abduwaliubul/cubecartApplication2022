package com.unitedcoder.javamethodtorial;

import org.apache.commons.lang3.StringUtils;

public class Calculator {
    //method for print calculator information

    public void calCulatorinfo(){
        System.out.println("sony simple Calculator");
        System.out.println("Hope you enjoy to use !!!");
    }
    //method for add two numbers
    public int sum(int i1,int i2){
        return i1+i2;
    }
    public long addTwoNumbers(String s1,String s2){
        if (StringUtils.isNumeric(s1)&&StringUtils.isNumeric(s2)){
            long sum=Long.parseLong(s1)+Long.parseLong(s2);
            return sum;

        }else {
            System.out.println("please provide numeric string !!");
            return 0;
        }
    }
    // add multiple numbers
    public long addMultipleNumbers(long...numbers){
        long sum=0;
        for (long eachNumber:numbers){
            sum+=eachNumber;
        }
        return sum;
    }

}
