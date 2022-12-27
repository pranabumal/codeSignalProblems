package com.company;

public class LargestAdjacentProduct {
    int largestAdjacentProduct(int[] inputArray) {
        int largestAdjacentProduct=inputArray[0]*inputArray[1];

        for( int i = 0; inputArray.length > i; i++){
            if(i+1<inputArray.length){
                largestAdjacentProduct= Math.max(largestAdjacentProduct, inputArray[i] * inputArray[i + 1]);
            }
        }

        return largestAdjacentProduct;
    }
}
