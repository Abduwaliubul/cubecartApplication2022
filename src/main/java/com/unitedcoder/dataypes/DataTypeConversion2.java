package com.unitedcoder.dataypes;

public class DataTypeConversion2 {
    public static void main(String[] args) {



    //cover string to primitive data type

    /*String s1="25";
    String s2="100$";

    System.out.println(s1+100);
    int i1=Integer.parseInt(s1);
    System.out.println(String.format("value after conversion is %d",(i1+100)));*/

    String price1="100$";
    String price2="110$";
    String price3="140$";
    int expectedTotalPrice=350;

        price1=price1.replace("$","");
        //int p1=Integer.parseInt(price1);
        int p1=Short.parseShort(price1);
        System.out.println(p1);

        price2=price2.replace("$","");
        int p2=Integer.parseInt(price2);

        price3=price3.replace("$","");
        int p3=Integer.parseInt(price3);

        int totalSumPrice=p1+p2+p3;
        System.out.println(expectedTotalPrice==totalSumPrice);


       //   convert primitive data type to string

        int i2=10000;
        int i3=9000;

        System.out.println(i2+i3);
        String s3=String.valueOf(i2);
        String s4=String.valueOf(i3);
        System.out.println(s3+s4);

    }
}
