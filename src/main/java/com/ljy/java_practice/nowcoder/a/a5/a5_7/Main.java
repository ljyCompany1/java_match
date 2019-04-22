package com.ljy.java_practice.nowcoder.a.a5.a5_7;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22194
 * （1）题目描述：编程找出小于n的四位数ABCD中满足下述关系的数：（ＡＢ＋ＣＤ）∗（ＡＢ＋ＣＤ）＝ＡＢＣＤ
 * （2）输入描述：输入一行，包含一个整数n，1000<=n<=9999
 * （3）输出描述：输出若干行。每行包含一个整数
 * （4）例如：
 * a.示例1
 * 输入：
 3000
 * 输出：
 2025
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
        if(n>=1000&&n<=9999){
            for(int i=1000;i<=n;i++){
                int a=(i/1000)%10;//千位数
                int b=(i/100)%10;//百位数
                int c=(i/10)%10;//十位数
                int d=i%10;//个位数
                int ab=a*10+b;
                int cd=c*10+d;
                if((ab+cd)*(ab+cd)==i){
                    System.out.println(i);
                }
            }
        }
    }
}

