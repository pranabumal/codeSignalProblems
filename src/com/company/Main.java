package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String string = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
        int [] array = new int[]{
          2, 3, 2, 5, 3, 2, 4, 6, 6
        };
        int [][] multiDimensionArray = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        RotateImage rotateImage = new RotateImage();
        System.out.println((Arrays.deepToString(rotateImage.solution(multiDimensionArray))));
    }

}
