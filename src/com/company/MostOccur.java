package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostOccur {
    int[] solution(int[] a) {

        Map<Integer,Integer> hash= new HashMap<>();
        for(int j=0;j<a.length;j++){
            if(a[j]/10==0){
                if(hash.containsKey(a[j])){
                    hash.put(a[j] , hash.get(a[j]) + 1);
                }else{
                    hash.put(a[j], 1);
                }
            }else{
                int first = a[j]/10;
                if(hash.containsKey(first)){
                    hash.put(first , hash.get(first) + 1);
                }else{
                    hash.put(first, 1);
                }

                int second = a[j]%10;
                if(hash.containsKey(second)){
                    hash.put(second , hash.get(second) + 1);
                }else{
                    hash.put(second, 1);
                }
            }
        }
        int max=0;
        for (Map.Entry<Integer, Integer> data :  hash.entrySet()) {
            if(data.getValue()>max){
                max=data.getValue();
            }
        }
        int[] result= new int[10];
        int index=0;
        for (Map.Entry<Integer, Integer> data :  hash.entrySet()) {
            if(data.getValue()==max){
                if(data.getKey()==0){
                    result[index]=10;
                }else{
                    result[index]=data.getKey();
                }
                index++;
            }
        }
        result=Arrays.stream(result).filter(num -> num != 0).toArray();
        for(int i=0; i<result.length;i++){
            if(result[i]==10){
                result[i]=0;
            }
        }
        return result;
    }

}
