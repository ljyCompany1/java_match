package com.ljy.java_practice.nowcoder.a.a6.a6_6;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22205
 * （1）题目描述：计算S=1！+2！+3！+…+N！的值
 * （2）输入描述：输入一行，包含一个整数n (n <= 10)
 * （3）输出描述：输出一行，包含一个整数。
 * （4）例如：
 * a.示例1
 * 输入：
 2
 * 输出：
 3
 * 2.思路分析
 * 数学常识：3!表示3*2*1;5表示5*4*3*2*1
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();//表示有几层
            if(n<=10){
                int sum=0;//存储最终结果
                for(int i=1;i<=n;i++){
                    int sumCurrent=1;
                    for(int j=1;j<=i;j++){
                        sumCurrent*=j;
                    }
                    sum+=sumCurrent;
                }
                System.out.println(sum);
            }
        }
    }
}

