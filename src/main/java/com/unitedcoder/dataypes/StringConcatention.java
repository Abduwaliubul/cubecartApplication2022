package com.unitedcoder.dataypes;

public class StringConcatention {
    public static void main(String[] args) {
        // numeric non numeric
        String s1="java";
        String s2="test";
        String s3="100";
        String s4="200plus";
        String s5="500";
        int i1=200;
        int i2=300;
        String s6="";

        System.out.println(s1+s2);
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s1.concat(s2+s3));


        System.out.println(s3+s5);
        System.out.println(i1+i2);
        System.out.println(i1+s3);
        System.out.println(s1+i1*i2);
        System.out.println(i1+i2+s5+s1+s2);
        System.out.println(s2+s4);
        System.out.println(s3+s4);
        System.out.println(i1+i2);
        System.out.println(s1+i1+i2);
        System.out.println(i1+s6+i2);

        //hard keyword
        String message="customer added Successfully";
        System.out.println(message.contains("successfully"));
        System.out.println(message.toLowerCase().contains("successfully"));







    }
}
