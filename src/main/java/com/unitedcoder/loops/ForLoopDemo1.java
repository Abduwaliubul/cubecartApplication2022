package com.unitedcoder.loops;

public class ForLoopDemo1 {
    public static void main(String[] args) {
       // for (int i=0;i<100;i++){
       //     System.out.println(i);
       // }
        for (int i=1;i<=1000;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        //1000-1 starting 1000 condition i<=1
        for (int i=1000;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        //1-100 jup san
        for (int j=0;j<=100;j=j+2){
            System.out.print(j+" ");
        }
        System.out.println();
        for (int j=0;j<100;j++){
            if (j!=0&&j%2==0){
                System.out.print(j+" ");
            }
        }
    }
}
