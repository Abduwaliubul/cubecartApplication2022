package com.unitedcoder.collectiondatastructure;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //integer array , fixed length
        int[] arr=new int[13];  //can story 12 value / element
        arr[0]=10;          arr[1]=80;
        arr[2]=20;          arr[3]=90;
        arr[4]=30;          arr[5]=100;
        arr[6]=40;          arr[7]=1056;
        arr[8]=50;          arr[9]=1045;
        arr[10]=60;          arr[11]=15678;
        arr[12]=70;
        System.out.println(arr[8]);
        System.out.println(arr[12]);
        System.out.println(arr.length);
        //System.out.println(arr[13]);//hata
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
System.out.println();
        //for each loop
        for (int a:arr){
            System.out.print(a+" ");
        }

System.out.println();
        String[] s=new  String[2];
        s[1]="name";
        System.out.println(s[1]);
        System.out.println(s[0]);



    }}