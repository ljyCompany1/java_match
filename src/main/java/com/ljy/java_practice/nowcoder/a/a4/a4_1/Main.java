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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的数字
        try {
            int n=Integer.parseInt(message);
            int sum=0;//默认的总和
            for(int i=1;i<=n;i++){
                if(i%2==1){
                    sum+=i;
                }else{
                    sum-=i;
                }
            }
            System.out.println(sum);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
