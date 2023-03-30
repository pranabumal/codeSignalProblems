package com.company.ArrayTopics;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int buyingIndex=0;
        for(int i=1;i<prices.length;i++){
            if(prices[buyingIndex]<prices[i]){
                if(maxProfit<(prices[i]-prices[buyingIndex])){
                    maxProfit=prices[i]-prices[buyingIndex];
                }
            }else {
                buyingIndex=i;
            }
        }

        return maxProfit;
    }
}
