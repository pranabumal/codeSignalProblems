package com.company;

import java.util.Arrays;

public class StatueSortGap {
    int statueSortGap(int[] statues) {
        int statueNeed=0;
        Arrays.sort(statues);
        for(int i=0; statues.length-1>i;i++){
            statueNeed=statueNeed+(statues[i+1]-statues[i]>1?(statues[i+1]-statues[i])-1:0);
        }
        System.out.println(Arrays.toString(statues));
        return statueNeed;
    }
}
