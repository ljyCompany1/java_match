package com.ljy.java_practice.nowcoder.a.a6.a6_1;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22199
 * （1）题目描述：求一个整数的所有数位之和
 * （2）输入描述：输入一行，包含一个整数。
 * （3）输出描述：一个整数. int范围内
 * （4）例如：
 * a.示例1
 * 输入：
12
 * 输出：
3
 * 2.思路分析
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;//存储所有位数之和
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}

