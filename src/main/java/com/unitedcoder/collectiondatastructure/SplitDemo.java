package com.unitedcoder.collectiondatastructure;

public class SplitDemo {
    public static void main(String[] args) {
        String school="united-coder";
        String s="hello,world";

        String[] arr1=school.split("-");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        for (String a:arr1){
            System.out.println(a);
        }

        String[] s1=s.split(",");
        for (String b:s1){
            System.out.println(b);
        }


    }
}
