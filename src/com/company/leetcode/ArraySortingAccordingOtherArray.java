package com.company.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class ArraySortingAccordingOtherArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Stack data1= new Stack();
        Stack data2= new Stack();

        for(int j=0;j<arr2.length;j++){
            for(int i=0;i<arr1.length;i++){
                if(arr2[j]==arr1[i]){
                    data1.push(arr1[i]);
                    arr1[i]=-1;
                }
            }
        }
        int[]ddd= Arrays.stream(arr1).sorted().toArray();
        for(int l=0;l<ddd.length;l++){
            if(ddd[l]!=-1){
                data2.push(ddd[l]);
            }
        }
        int[] result = new int[arr1.length];
        int f=arr1.length-1;
        while (!data2.isEmpty()){
            result[f]= (int) data2.pop();
            f--;
        }
        while (!data1.isEmpty()){
            result[f]= (int) data1.pop();
            f--;
        }

        return result;
    }
}
