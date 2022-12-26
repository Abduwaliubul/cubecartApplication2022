package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();

       // List<Integer> list=new ArrayList<>();

        arrayList.add(200);
        arrayList.add(500);
        arrayList.add(100);
        //size
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
        System.out.println(arrayList);
        arrayList.add(400);
        arrayList.add(900);

        System.out.println(arrayList.get(4));
        System.out.println(arrayList);
        arrayList.set(1,1000);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);

int sum=0;
        for (int i=0;i<arrayList.size();i++){
            sum+=arrayList.get(i);
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();
        System.out.println(sum);
        arrayList.remove(2);
        System.out.println(arrayList);



    }
}
