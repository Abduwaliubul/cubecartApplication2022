package com.unitedcoder.loops;

public class ForLoopDemo2 {


    public static void main(String[] args) {
        // 1-10 sun
        int sum=0;
        for (int i=1;i<=10;i++){
            sum+=i; //sum=sum+i
          //  System.out.printf("i=%d sum=%d\n",i,sum);
        }
        System.out.println("total sum"+sum);

        //1-5 factorial 1*2*3*5
        int factorial=1;
        for (int i=1;i<=5;i++){
            factorial*=i;
          //  System.out.printf("i=%d factorial=%d\n",i,factorial);

        }
        System.out.println("factorial:"+factorial);

        //count even number
        int evenNumberCounts=0;
        for (int j=0;j<=100;j++){
            if (j!=0&&j%2==0){
               // System.out.print(j+" ");
                evenNumberCounts++;

    }
}
        System.out.println("total even numbers is: "+evenNumberCounts);
    }}
