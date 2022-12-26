package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateElement {
    public static void main(String[] args) {
        List<String>  fruitLists=new ArrayList<>();
        fruitLists.add("Banana");
        fruitLists.add("Apple");
        fruitLists.add("pear");
        fruitLists.add("Strawberry");
        fruitLists.add("grape");
        fruitLists.add("Apple");
        fruitLists.add("Banana");
        fruitLists.add("orange");
        HashSet<String> set=new HashSet<>();
        for (int i=0; i<fruitLists.size();i++){
        String fruits=fruitLists.get(i);
        if ( set.add(fruits)==false){
            System.out.println(fruits+"is duplicated");
        }
    }
}}
