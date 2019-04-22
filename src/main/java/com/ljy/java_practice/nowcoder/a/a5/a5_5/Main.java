package com.ljy.java_practice.nowcoder.a.a5.a5_5;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22189
 * （1）题目描述：输出1—n中能被3整除，且至少有一位数字是5的所有整数.
 * （2）输入描述：输入一行，包含一个整数n。(1 <= n <= 100000)
 * （3）输出描述：输出所有满足条件的数，以换行隔开，具体见样例。
 * （4）例如：
 * a.示例1
 * 输入：
 50
 * 输出：
 15
 45
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
            for(int i=1;i<=n;i++){
                if(i%3==0&&String.valueOf(i).contains("5")){
                    System.out.println(i);
                }
            }
        }
    }
}

