package com.ljy.java_practice.nowcoder.a.a4.a4_6;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22161
 * （1）题目描述：有一个数列
 已知
 A1=0
 A2=1
 A3=1
 A4=A1+2*A2+A3
 A5=A2+2*A3+A4
 ……
求An
 * （2）输入描述：输入一个整数n (1≤n≤20)
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：4
 * 输出：3
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
            int result=0;//相当于An，也可以作为An-1
            int n_1=0,n_2=0,n_3=0;
            for(int i=1;i<=n;i++){
               if(i==1){
                   result=0;
                   n_1=0;
               }else if(i==2||i==3){
                   n_2=n_3=result=1;
                }else{
                   result=n_1+2*n_2+n_3;
                   n_1=n_2;
                   n_2=n_3;
                   n_3=result;
               }
            }
            System.out.println(result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
