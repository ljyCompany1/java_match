package com.ljy.java_practice.nowcoder.a.a4.a4_4;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22159
 * （1）题目描述：帮助牛牛计算 1+（1+2）+（1+2+3）+...+(1+2+3+...+n)
 * （2）输入描述：输入一个整数
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：4
 * 输出：20
 *
 * 2.思路分析
 *对数列的规律进行了解
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
            int sum=0;//所有式子的总和，默认为0
            for(int i=1;i<=n;i++){//计算有多少个式子
                int sumTemp=0;//每个式子的综合，默认为0
                for(int j=1;j<=i;j++){//用于计算每个分式的值
                    sumTemp+=j;
                }
                //累加每个分式的值，然后计算入总和中
                sum+=sumTemp;
            }
            System.out.println(sum);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
