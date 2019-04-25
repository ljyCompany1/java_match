package com.ljy.java_practice.nowcoder.a.a7.a7_10;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22221
 *（1）题目描述：牛村村口有一排防护塔，建的越高防护范围越广。
 牛可乐被村长安排去建塔，他每天的工作是给连续的几个塔都建高X米，
 请问等他工作了m天以后每个防护塔的高度分别是多少？
 *（2）输入描述：
 第一行输入一个整数n,表示防护塔的数量。
 第二行输入n个数，表示每个防护塔的初始高度。
 第三行输入一个整数m，表示牛可乐的工作天数。
 接下来m行每行三个整数a,b,c，表示给第a个塔到第b个塔增建c的高度。
 1 <= n,m <= 100, 1 <= a, b <= n, 1 <= c <= 1000
 *（3）输出描述：输出一行，包含n个整数，以空格隔开，表示各个防护塔最终的高度。
 * （4）例如：
 * a.示例1
 * 输入：
 4
 1 2 3 4
 3
 1 2 1
 2 3 1
 4 4 1
 * 输出：
 2 4 4 5

 * 2.思路分析
 *（1）如何处理控制台的输入输出
 * （2）容易出错的地方：
 * a.如输入用例的4 4 1，表示第4个塔+11次，而不是2次即+2.
 * b（严重中招）.a塔到b塔，表示范围，比如1-3塔，就是1,2,3。另外a的值必定小于或等于b的值
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();//获取塔的数量
            if(n>=1&&n<=100){
                int[] array=new int[n];
                for(int i=0;i<n;i++){//获取每个塔的值
                    array[i]=sc.nextInt();
                }
                int m=sc.nextInt();//获取工作天数
                if(m>=1&&m<=100){
                    for(int i=1;i<=m;i++){//计算每天的工作量
                        int a=sc.nextInt();//第a个塔
                        int b=sc.nextInt();//第b个塔
                        if(a>=1&&a<=n&&b>=1&&b<=n){
                            int c=sc.nextInt();//第b个塔
                            if(c>=1&&c<=1000){
                                for(int ii=a;ii<=b;ii++){
                                    array[ii-1]=array[ii-1]+c;
                                }
                            }
                        }
                    }
                    for(int i=0;i<array.length;i++){//输出每个塔的值
                        if(i>0){
                            System.out.print(" ");
                        }
                        System.out.print(array[i]);
                    }
                }
            }
        }
    }
}