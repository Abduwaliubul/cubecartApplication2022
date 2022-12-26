package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class ArraysObjectDemo {
    public static void main(String[] args) {
        int[]  arr1={12,67,78,98,64,73};
        int[]  arr2={34,46,69,27,39,19};
        //int[]  arr3={12,67,78,98,64,73};
        int[] arr3=Arrays.copyOf(arr1,6);

       boolean result1=Arrays.equals(arr1,arr2);
        boolean result2=Arrays.equals(arr1,arr3);
        System.out.println(result1);
        System.out.println(result2);


        Arrays.fill(arr2,20);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        //copy of two array
        int[] arr4=new  int[arr1.length];
        for (int i=0;i<arr1.length;i++){
            arr4[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr4));


    }

}
