package com.ljy.java_practice.nowcoder.a.a5.a5_9;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22197
 * （1）题目描述：n元人民币换成1元、2元、5元的零钱，请计算共有多少种兑换方法？
 * （2）输入描述：输入一行，包含一个整数n，1 <= n <= 200
 * （3）输出描述：输出一行，包含一个整数
 * （4）例如：
 * a.示例1
 * 输入：
100
 * 输出：
 541
 * 2.思路分析
 *用循环来模拟三元方程求解
 * 不足：但是该方法类似于暴力破解，效率很低，应尝试找更有效率的方法
 * 参考（找规律）：https://blog.csdn.net/marshal2004/article/details/47090537/
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1&&n<=200){
            int total=0;//存储兑换方法的数量
            for(int x=0;x<=n;x++){
                for(int y=0;y<=n/2;y++){
                    for(int z=0;z<=n/5;z++){
                        if( x+2*y+5*z==n){
                            total++;
                        }
                    }
                }
            }
            System.out.println(total);
        }
    }
}

