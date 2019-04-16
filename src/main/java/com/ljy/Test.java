package com.ljy;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        System.out.println(3*1F/7);
        System.out.println(8==8.0);
        double s=3.56344f;
        BigDecimal b=new BigDecimal(String.valueOf(s));
        System.out.println(Math.pow(2,4));
    }
}
