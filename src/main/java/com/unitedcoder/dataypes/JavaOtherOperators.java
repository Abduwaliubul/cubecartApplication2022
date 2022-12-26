package com.unitedcoder.dataypes;

public class JavaOtherOperators {
    public static void main(String[] args) {
        //Assignment operators = += -+ *= /=
        int x1=100; //Assignment
        x1++;
        x1+=5; //x1=x1+5;
        System.out.println(x1);
        x1-=20; //x1=x1-20
        System.out.println(x1);
        x1*=2; //x1=x1*2;
        System.out.println(x1);
        x1/=2;
        System.out.println(x1);
        x1%=3;// x1=x1%3;
        System.out.println(x1);

        //comparison operators
        int i1=200;
        int i2=300;
        int i3=200;
        System.out.println(i1=i2);
        System.out.println(i1==i3);
        System.out.println(i1>i2);
        System.out.println(i2<i3);
        System.out.println(i1>=i3);
        System.out.println(i2>=i3);
        System.out.println(i1!=i2);
        System.out.println(i1<=i2);


        //logical operators
        boolean b1=true;
        boolean b2=false;
        boolean b3=true;

        System.out.println(b1&&b2);
        System.out.println(b1||b2);
        System.out.println(b1&&b3);
        System.out.println(b2||b3);
        System.out.println(b1&&b2);

        int i4=30;
        System.out.println(i4<100&&i4>80);
        System.out.println(i4<20||i4>10);
        System.out.println(i4>50);


        //bitwise operator
        byte d1=001;
        byte d2=110;
        System.out.println(d1&d2);
        System.out.println(d1|d2);

    }
}
