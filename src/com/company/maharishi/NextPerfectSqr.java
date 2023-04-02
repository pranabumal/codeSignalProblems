package com.company.maharishi;

public class NextPerfectSqr {

    public int nextPerfectSquare(int n){
        int nextNumber=n+1;
        if(nextNumber==0)
            return nextNumber;
        for(int d=1;d<nextNumber/2;d++){
            if(d*d==nextNumber){
                return nextNumber;
            }
        }
        return nextPerfectSquare(nextNumber);
    }
}
