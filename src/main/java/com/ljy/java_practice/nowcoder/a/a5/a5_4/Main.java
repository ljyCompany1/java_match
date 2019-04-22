package com.ljy.java_practice.nowcoder.a.a5.a5_4;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22169
 * （1）题目描述：今天牛牛学到了回文串，他想在数字里面找回文，即回文数，
 * 回文数是正着读与倒着读都一样的数，比如1221，343是回文数，433不是回文数。请输出不超过n的回文数。
 * （2）输入描述：输入一个整数n(1 <= n <= 100000)
 * （3）输出描述：从1开始按从小到大的顺序输出所有回文数
 * （4）例如：
 * a.示例1
 * 输入：
 10
 * 输出：
 1
 2
 3
 4
 5
 6
 7
 8
 9
 *
 * 2.思路分析
 *通过字符串对数字进行逆向转换
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int n=sc.nextInt();
            if(n>=1&&n<=100000){
                String result=null;//回文
                for(int i=1;i<=n;i++){
                    result=new StringBuilder(String.valueOf(i)).reverse().toString();//将数字转换
                    int m=Integer.valueOf(result);//获取回文数字
                    if(m==i){
                        System.out.println(m);
                    }
                }
            }
        }
    }
}

