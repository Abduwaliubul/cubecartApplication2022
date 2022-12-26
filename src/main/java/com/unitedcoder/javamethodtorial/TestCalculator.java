package com.unitedcoder.javamethodtorial;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.calCulatorinfo();

        System.out.println(calculator.addMultipleNumbers(100,200,90,80,70,50,30,20,10));
        System.out.println(calculator.addTwoNumbers("100","300"));
        System.out.println( calculator.sum(30,40));

        FinMaxValueMethod method=new FinMaxValueMethod();
        System.out.println(method.findMaxValue(new int[]{30,10,70,20,50,90,40}));

    }
}
