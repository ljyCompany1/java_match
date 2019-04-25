package com.ljy.java_practice.nowcoder.a.a7.a7_1;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22211
 * （1）题目描述：现在已知Fibonacci(菲波那切)数列的前几项0、1、1、2、3、5、8……,编程求出第 N 项。
 * （2）输入描述：输入一行，包含一个正整数N。1 <= N <= 50
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：
 49
 * 输出：
 4807526976

 * 2.思路分析
 *菲波那切是常见的算法题，应该掌握f(n)=f(n-1)+f(n-2)的规律
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//表示有几层
        if (n >= 1 && n <= 50) {
            long fn = 0;
            long fn_1=0;
            long fn_2=0;
            for (int i = 1; i <= n; i++) {
                if (i == 1) {
                    fn=fn_2=0;
                }else if (i == 2) {
                    fn=fn_1=1;
                }else{
                    fn=fn_2+fn_1;
                    fn_2=fn_1;
                    fn_1=fn;
                }
            }
            System.out.println(fn);
        }
    }
}