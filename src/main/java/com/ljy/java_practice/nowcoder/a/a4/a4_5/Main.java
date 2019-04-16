package com.ljy.java_practice.nowcoder.a.a4.a4_5;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22160
 * （1）题目描述：求fib数列的第n项，前几项是1，1，2，3，5,每一项都等于前面两项的和
 * （2）输入描述：输入一个整数
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：2
 * 输出：1
 *
 * 2.思路分析
 *本题考查斐波那契数列 f(0)=0,f(1)=1…f(n)=f(n-1)+f(n-2) (当前项等于前两项之和)
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
            int result=0;//第n项默认为0
            int n_1=0,n_2=0;
            for(int i=1;i<=n;i++){//计算有多少个式子
               if(i==1||i==2){
                   result=1;
                   n_1=n_2=1;
               }else{
                   result=n_1+n_2;
                   n_1=n_2;
                   n_2=result;
               }
            }
            System.out.println(result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
