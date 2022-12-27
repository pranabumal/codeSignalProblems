package com.company;

public class PolygenCount {
    int polygenCount(int n) {
        return (int) Math.pow(n, 2) + (int) Math.pow(n-1, 2);
    }
}
