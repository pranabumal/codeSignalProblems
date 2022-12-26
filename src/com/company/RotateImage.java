package com.company;

public class RotateImage {
    int[][] solution(int[][] a) {
//      System.out.println(a.length);
        int [][] newArray=new int[a.length][a.length];
        for (int i=0;i<a.length;i++){
            int data=0;
            int data2=a.length-1;
            for (int j=a.length-1;j>=0;j--){
                newArray[i][data]=a[data2][i];
                data++;
                data2--;
            }
        }

        return newArray;
    }
}
