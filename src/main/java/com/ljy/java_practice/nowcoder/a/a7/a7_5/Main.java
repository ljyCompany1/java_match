package com.ljy.java_practice.nowcoder.a.a7.a7_5;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22215
 * （1）题目描述：最大公因数，也称最大公约数、最大公因子，指两个或多个整数共有约数中最大的一个。
 * 给你两个数，请输出他们的最大公约数。
 * （2）输入描述：输入一行，包含两个正整数A,B。1 <= A,B <= 1e9
 * （3）输出描述：输出一行，包含一个正整数
 * （4）例如：
 * a.示例1
 * 输入：
 4 6
 * 输出：
2

 * 2.思路分析
 *最大公因数，也称最大公约数、最大公因子，指两个或多个整数共有约数中最大的一个
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        if(validate(a)&&validate(b)){
            long min=Math.min(a,b);//获取两个数中最小的数，用于循环结束的判断
            long max=0;//存储最大的公约数
            for(int i=1;i<=min;i++){
                if(a%i==0&&b%i==0){
                    max=i;
                }
            }
            System.out.println(max);
        }
    }

    private static boolean validate(long number){
        if(number>=1&&number<=Math.pow(10,9)){
            return true;
        }else{
            return false;
        }
    }
}