package com.ljy.java_practice.nowcoder.a.a5.a5_6;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22192
 * （1）题目描述：在1—n中、找出能同时满足用3除余2，用5除余3，用7除余2的所有整数。
 * （2）输入描述：输入一行，包含一个正整数n ，n在100000以内
 * （3）输出描述：输出若干行，每行一个整数。
 * （4）例如：
 * a.示例1
 * 输入：
 100
 * 输出：
 23
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
        if(n>=1&&n<=100000){
            String result=null;//回文
            for(int i=1;i<=n;i++){
                if(i%3==2&&i%5==3&&i%7==2){
                    System.out.println(i);
                }
            }
        }
    }
}

