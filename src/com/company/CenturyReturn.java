package com.company;

public class CenturyReturn {
    int centuryReturn(int year){
        if(year<100){
            return 1;
        }else {
            return year%10>0?(year/100)+1:year/100;
        }
    }
}
