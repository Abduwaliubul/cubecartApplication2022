package com.unitedcoder.dataypes;

public class StirngDemo3 {
    public static void main(String[] args) {
        String result=" All test passed ";
        System.out.println(result.length());
        System.out.println(result.trim().length());

        result=result.replace(" ","");
        System.out.println(result.length());

        //string format
        String course="united coder";
        String course1="selenium master";
        String course2="java selenium course";
          //welcome to
         System.out.println("welcome to "+course);

         System.out.println(String.format("welcome to %s",course1));

         int i1=100;
         int i2=200;
         int i3=i1+i2;
         System.out.println(i1+i2);
         System.out.println(String.format("%d + %d = %d",i1,i2,i3));

         

    }
}
