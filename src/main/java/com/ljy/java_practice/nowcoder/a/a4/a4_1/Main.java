package com.ljy.java_practice.nowcoder.a.a4.a4_1;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22156
 * （1）题目描述：牛牛开始学习数列啦,现在他想知道1-2+3-4...+n的值
 * （2）输入描述：输入一个整数n (1≤n≤100)
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：4
 * 输出：-2
 *
 * 2.思路分析
 *
 * 3.运行结果
 *通过
 *
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//可以用字符串：0100110001010001测试，答案是100
        int sum=0;//默认的总和
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum+=i;
            }else{
                sum-=i;
            }
        }
        System.out.println(sum);
    }
}
