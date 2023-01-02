package com.company.ArrayTopics;

import java.util.HashMap;

public class IsCryptSolution {
    public boolean solution(String[] crypt, char[][] solution) {

        HashMap<Character, Integer> solutionHash= new HashMap<>();
        for(char[] data: solution){
            solutionHash.put(data[0],Integer.parseInt(String.valueOf(data[1])));
        }
        Integer[] array = new Integer[]{
                0,0,0
        };
        for(int k=0;crypt.length>k;k++){

            for (int i = 0; i < crypt[k].length(); i++) {
               if(i==0 && crypt[k].length()>1 && solutionHash.get(crypt[k].charAt(i))==0){
                   return false;
               }
               if(i==0){
                   array[k]=array[k]+solutionHash.get(crypt[k].charAt(i));
               }else {
                   array[k]=(array[k]*10)+solutionHash.get(crypt[k].charAt(i));
               }
            }
        }
        return array[0] + array[1] == array[2];
    }
}
