package com.unitedcoder.loops;

public class MathimaticalChart {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d=%d \t", i, j, i * j);
            }
            System.out.println();
        }

      /* for (int i=1;i<=5;i++){
            int j=1;
            while (j<=i){
                System.out.printf("* ");
                j++;

            }
            System.out.println();*/
   // }
        }
    }

