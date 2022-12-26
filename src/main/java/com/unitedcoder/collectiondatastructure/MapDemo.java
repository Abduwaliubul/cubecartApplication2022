package com.unitedcoder.collectiondatastructure;

//import com.sun.org.apache.xpath.internal.operations.String;
// zadi nima bu

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<java.lang.String,Integer> age=new HashMap<>();
       age.put("Alim",35);
       age.put("aynur",25);
       age.put("adil",40);
       System.out.println(age.get("aynur"));
       age.replace("Alim",50);
       System.out.println(age.get("Alim"));
       //keySet
        Set<String> keys=age.keySet();
        System.out.println(keys);

        for(Map.Entry entry:age.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }





    }
}
