package com.unitedcoder.dataypes;

public class AriyhmaticOperators {
    public static void main(String[] args) {

        //+  - * / % ++ --
        //premier of Rectange w+h *2 h*w
        int width=45;
        int height=25;
        int area=width*height;
        int premier=(width+height)*2;
        System.out.println("Area of rectangle is:"+area);
        System.out.println("premier of rectange is:"+premier);

        float division=(float)width/height;
        System.out.println(division);

        System.out.println(5%3);
        System.out.println(9%8);

        //Increment & Decrement
        int i=2;
        int j=1;
        i++;
        j++;
        System.out.println(i);
        System.out.println(j);

        i++;
        j--;
        j--;// post increment
        ++i;// pre increment
        --j;
        System.out.println(i);
        System.out.println(j);
        i=i+2;
        j=j+2;
        System.out.println(i);
        System.out.println(j);
    }
}
