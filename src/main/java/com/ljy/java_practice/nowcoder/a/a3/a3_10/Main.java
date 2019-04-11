package com.ljy.java_practice.nowcoder.a.a3.a3_10;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22015
 * （1）题目描述：输入三个数，输出最大数，最小数
 * （2）输入描述：输入一行，包含三个整数a, b , c  （1≤a,b,c≤10000001≤a,b,c≤1000000）
 * （3）输出描述：输出两行，第一行输出最大数，第二行输出最小数。具体格式见样例输出。
 * （4）例如：
 * a.示例1
 * 输入：1 2 3
 * 输出：
 * The maximum number is : 3
 * The minimum number is : 1
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
        String[] strs=message.split(" ");
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(String s:strs){
            int number=Integer.parseInt(s);
            if(max<number){
                max=number;
            }
            if(min>number){
                min=number;
            }
        }
        System.out.println("The maximum number is : "+max);
        System.out.println("The minimum number is : "+min);
    }

    private static boolean validate(int number){
        if(number>=1&&number<=1000000){
            return true;
        }else{
            return false;
        }
    }
}
