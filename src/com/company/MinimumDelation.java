package com.company;

public class MinimumDelation {
    public int minDeletionSize(String[] strs) {
        int index=0;

        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.length;j++){
                if (j  < strs.length-1) {
                    if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                        index++;
                        break;
                    }
                }
            }
        }

        return index;
    }
}
