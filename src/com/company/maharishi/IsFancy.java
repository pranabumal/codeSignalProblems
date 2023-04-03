package com.company.maharishi;

import com.company.DataStructure.Stack;


public class IsFancy {
    public boolean isFancy(int n){

        int nextFancy=1;
        Stack data= new Stack(n/2);
        data.push(1);
        data.push(1);
        while (nextFancy<=n){
            int firstValue=data.pop();
            int secondValue=data.pop();
            int next = firstValue*3+secondValue*2;

            if(n==next){
                return true;
            }
            data.push(firstValue);
            data.push(next);
            nextFancy=next;
        }

        return false;
    }
}
