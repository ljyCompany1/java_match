package com.ljy.java_practice.nowcoder.a.a5.a5_8;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22196
 * （1）题目描述：求自然数N的所有约数之和。
 * （2）输入描述：输入一行，包含一个正整数n，范围在10000以内
 * （3）输出描述：输出一行，包含一个整数.
 * （4）例如：
 * a.示例1
 * 输入：
10
 * 输出：
18
 * 2.思路分析
 *
 * 3.运行结果
 *不通过，但是只要把对值的限制if(n>=1&&n<=10000)删掉就正确了，说明题目的测试用例有误
 * 本题算法实际为正确的
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1&&n<=10000){
            int sum=0;//存储约数之和
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    sum+=i;
                }
            }
            System.out.println(sum);
        }
    }
}

