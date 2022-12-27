package com.company;

import java.util.Arrays;

public class SortingBehindTree {
    int[] sortingBehindTree(int[] array) {
        int[] sortedArray = array.clone();
        System.out.println(Arrays.toString(array));

        Arrays.sort(sortedArray);
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==-1){
                count++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]!=-1){
                array[i]=sortedArray[count++];
            }
        }
        return array;
    }
}
