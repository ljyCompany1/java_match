package com.ljy.java_teach.lanqiaobei.two_shulie;

import java.util.Scanner;

/**
 * 蓝桥杯培训题
 * 一、【问题描述】 给定数列 1, 1, 1, 3, 5, 9, 17, …，从第 4 项开始，每项都是前 3 项的和。求 第 20190324 项的最后 4 位数字。
 *
 * 二、题解
 * 通项公式:An = An-1 + An-2 + An-3
 * 问题1：An增长很快(明显比fib快)，很快超过long long范围
 * 幸好题目只需要我们就后4位，即 mod 10000的结果
 * 问题2：长度20190324的数组开不出来，暴内存限制
 * 滚动数组(变量)
 *
 */
public class A2 {

    /**
     * 求n位后的最后4位数字
     * @param n
     * @return
     */
    private static int count(int n){
        int[] array={1,1,1,0};//四位数字从低到高分别代表An-1，An-2，An-3，An
        for(int i=4;i<=n;i++){//从第4项开始计算
            array[3]=(array[0]+array[1]+array[2])%10000;//只取数字的最后4位
            array[0]=array[1];
            array[1]=array[2];
            array[2]=array[3];
        }
        return array[3];
    }



    public static void main(String[] args) {
        int n=20190324;
        System.out.println(count(n));
    }
}
