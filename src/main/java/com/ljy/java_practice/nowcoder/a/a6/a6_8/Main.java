package com.ljy.java_practice.nowcoder.a.a6.a6_8;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22208
 * （1）题目描述：打印数字三角形,从1开始输出，第i行输出i个数，每个数字按4个位置输出
 * 注：c语言中 %4d可以输出一个数，占据四个位置，右对齐。
 * （2）输入描述：输入一行，包含一个整数n。1 <= n <= 1000
 * （3）输出描述：输出n行，第i行，有i个数, 每个数占据四个位置。
 * （4）例如：
 * a.示例1
 * 输入：
 4
 * 输出：
   1
   2   3
   4   5   6
   7   8   9  10
 * 2.思路分析
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();//表示有几层
            if(n>=1&&n<=1000){
                int record=0;//用于计数
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        record++;
                        System.out.printf("%4d",record);
                        if(j==i){
                            System.out.printf("\n");
                        }
                    }
                }
            }
        }
    }
}