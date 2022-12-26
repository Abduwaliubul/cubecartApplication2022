package com.unitedcoder.dataypes;

public class PrePostIncrementAndDecrement {
    public static void main(String[] args) {
        // post increment-  first execute the operation and then plus one
        //pro increment --first plus  one and the execute operation

        int a=30;
        int b=50+(++a);
        int c=++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
System.out.println("*************");
        int a1=30;
        int b1=50+(a1++);
        int c1=a1++;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);

        System.out.println("----------------");
        //pre decrement
        //post decrement

        int x1=10;
        int y1=--x1;
        System.out.println(x1);
        System.out.println(y1);

        int x2=20;
        int y2=(x2--)+90;
        int y3=(--x2)-20;
        int y4=--y3;
        int y5=y4--;
        System.out.println(x2);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);
        System.out.println(y5);




    }
}
