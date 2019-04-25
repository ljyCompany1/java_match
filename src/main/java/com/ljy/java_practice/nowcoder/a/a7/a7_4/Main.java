package com.ljy.java_practice.nowcoder.a.a7.a7_4;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22214
 * （1）题目描述：牛可乐在牛牛商场买了一个帽子，要支付c元金币，牛牛商场一律不找零钱，
 * 牛可乐手里有不限数量的面值a元的金币和面值b元的金币，请问牛可乐可以用金币刚好凑出总价c元吗？
 * （2）输入描述：输入一行，包含三个整数a,b,c。a,b <= 100, c <= 10000
 * （3）输出描述：输出一行,如果可以输出”Yes”,否则输出”No”.
 * （4）例如：
 * a.示例1
 * 输入：
 3 2 7
 * 输出：
 Yes

 * 2.思路分析
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<=100&&b<=100&&c<=10000){
            boolean judge=false;//默认不能凑出
            outterLoop :
            for(int i=0;i<=Math.ceil(c*1f/a);i++){
                for(int j=0;j<=Math.ceil(c*1f/b);j++){
                    if(a*i+b*j==c){
                        judge=true;
                        break outterLoop;
                    }
                }
            }
            System.out.println(judge?"Yes":"No");
        }
    }
}