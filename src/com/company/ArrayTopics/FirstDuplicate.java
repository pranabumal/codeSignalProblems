package com.company.ArrayTopics;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    //0(N)
    public int firstDuplicateWithHashset(int [] a){
        Set<Integer> set = new HashSet<>();
        set.add(a[0]);
        for(int i=1;a.length>i;i++){
            if(set.contains(a[i])){
                return a[i];
            }else {
                set.add(a[i]);
            }
        }
        return -1;
    }

    // O(N^2)
    public int firstDuplicate(int [] a){
        int dif=a.length;
        int index = 0;
        for(int i=0; i< a.length;i++){
            if(index==i && i>0) break;
            for(int k=i+1; k<a.length;k++){
                if(a[i]==a[k]){
                    if(dif>(k-i)){
                        dif=k-i;
                        index=k;
                        break;
                    }
                }
                if(dif<k-i) break;
            }
            if(dif==0) break;
        }
        if(dif<a.length){
            return a[index];
        }else return -1;

    }
}
