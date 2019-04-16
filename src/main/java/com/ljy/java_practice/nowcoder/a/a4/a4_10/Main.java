package com.ljy.java_practice.nowcoder.a.a4.a4_10;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22165
 * （1）题目描述：计算a+b
 * （2）输入描述：输入包含多组数据，每组数据输入一行，包含两个整数
 * （3）输出描述：对于每组数据输出一行包含一个整数表示两个整数的和
 * （4）例如：
 * a.示例1
 * 输入：
 * 1 2
 * 3 4
 * 输出：
 * 3
 * 7
 *
 * 2.思路分析
 *主要考察对控制台数据的拆分
 * 3.运行结果
 *通过
 *
 */

import java.util.*;
public class Main{
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            long m=sc.nextLong();
            long n=sc.nextLong();
            System.out.println(m+n);
        }
    }
}

