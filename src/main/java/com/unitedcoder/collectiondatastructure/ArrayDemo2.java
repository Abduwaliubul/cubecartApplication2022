package com.unitedcoder.collectiondatastructure;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] a=new int[]{23,45,56,67,234,67,89};

        int[] b={12,34,65,65,23,47,89,12};

        System.out.println(a[5]);
        System.out.println(a.length);
        System.out.println(b[3]);
        System.out.println(b.length);


        int sum=0;
        for (int i=0;i<b.length;i++){
            sum+=b[i];
        }
        System.out.println(sum);

        //for each loop
        int sum1=0;
        for (int r:b){
            sum1+=r;
        }
System.out.println(sum1);

    }
}
