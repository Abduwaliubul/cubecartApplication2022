package com.unitedcoder.javamethodtorial;

public class FinMaxValueMethod {
    //method for find a max value in an array
    public int findMaxValue(int[] array){
        int maxValue=0;
        for (int i=0;i<array.length;i++){
            if (maxValue < array[i]){
                maxValue=array[i];
            }
        }
        return maxValue;
    }
}
