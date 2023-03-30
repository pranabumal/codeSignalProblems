package com.company;

import java.math.BigDecimal;

import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
//        int data = 3;
//        data++;
//        System.out.println(data);
//        System.out.println(data=data+3);
        System.out.println(calculatePercentageChange2(new BigDecimal(100),new BigDecimal(75)));
    }

    public static int calculatePercentageChange(BigDecimal oldVal, BigDecimal newVal) {
        return newVal.subtract(oldVal).divide(oldVal, 2, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100)).setScale(0, RoundingMode.DOWN).intValue();
    }
    public static BigDecimal calculatePercentageChange2(BigDecimal oldVal, BigDecimal newVal) {
        BigDecimal diff = newVal.subtract(oldVal);
        BigDecimal percentageChange = diff.divide(oldVal, 2, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));
        return percentageChange;
    }

}
