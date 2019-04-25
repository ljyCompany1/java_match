package com.ljy.java_practice.nowcoder.a.a6.a6_10;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22210
 * （1）题目描述：输入一个自然数N，按质数定义从小到大输出1~N（包含N）中所有的质数
 * （2）输入描述：输入一行，包含一个整数N。1 <= N <= 2000
 * （3）输出描述：输出一行，包含所有的质数，按照从小到大的顺序输出，以空格隔开。
 * （4）例如：
 * a.示例1
 * 输入：
 20
 * 输出：
 2 3 5 7 11 13 17 19

 * 2.思路分析
 *（1）常识：质数（prime number）又称素数，有无限个。质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数。
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//表示有几层
        if(n>=1&&n<=2000){
            int record=0;//用于计数
            for(int i=2;i<=n;i++){
                boolean judge=true;//默认是质数
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        judge=false;
                        break;
                    }
                }
                if(judge){
                    System.out.print(i+" ");
               }
            }
        }
    }
}