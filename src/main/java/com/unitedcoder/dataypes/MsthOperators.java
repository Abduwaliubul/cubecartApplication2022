package com.unitedcoder.dataypes;

import java.util.Random;

public class MsthOperators {
    public static void main(String[] args) {

        int i1=100;
        System.out.println(Math.max(100,150));
        System.out.println(Math.min(200,400));
        System.out.println(Math.abs(-90));
        System.out.println(Math.pow(3,4));

        //random range 0.0----0.9999999
        //System.out.println(Math.random());
        //0-10
        int randomnumbers=(int) (Math.random()*11)+1;
        System.out.println(randomnumbers);


        //random class
        Random random=new Random();
        System.out.println(random.nextInt());

    }
}
