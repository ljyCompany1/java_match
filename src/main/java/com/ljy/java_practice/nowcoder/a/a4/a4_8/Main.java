package com.ljy.java_practice.nowcoder.a.a4.a4_8;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22163
 * （1）题目描述：有一个数字魔法，给你一个正整数n，如果n为偶数，就将他变为n/2, 如果n为奇数，就将他变为乘3加1
 不断重复这样的运算，经过有限步之后，一定可以得到1
 牛牛为了验证这个魔法，决定用一个整数来计算几步能变成1
 * （2）输入描述：输入一个正整数n,范围在100以内
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：3
 * 输出：7
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
            if(n>=1&&n<=100){
                int steps=0;//总共经过几步变成1
                while(n!=1){
                    if(n%2==0){//如果n为偶数
                        n=n/2;
                    }else{//如果n为奇数
                        n=n*3+1;
                    }
                    steps++;
                }
                System.out.println(steps);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
