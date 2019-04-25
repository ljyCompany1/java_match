package com.ljy.java_practice.nowcoder.a.a6.a6_2;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22200
 * （1）题目描述：给你一个整数n, 判断它是否是素数。注意1不是素数。
 * （2）输入描述：第一行输入一个整数T,表示需要判断的数的个数,
 * 接下来T行每行一个整数n,表示需要判断的数。1<=n<=1e5,1<=T<=10
 * （3）输出描述：输出T行，判断是否是素数。是，输出“Yes”，否则输出“No”
 * （4）例如：
 * a.示例1
 * 输入：
 2
 1
 2
 * 输出：
 No
 Yes
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
        int t=sc.nextInt();
        int[] numbers=new int[t];
        for(int i=0;i<t;i++){
            numbers[i]=sc.nextInt();
        }
        for(int number:numbers){
            if(validate(number)){
                if(number==1){
                    System.out.println("No");
                }else{
                    boolean status=true;//默认该数是素数
                    for(int j=2;j<number;j++){
                        if(number%j==0){
                            status=false;
                        }
                    }
                    System.out.println(status?"Yes":"No");
                }
            }
        }
    }

    private static boolean validate(int number){
        if(number>=1&&number<=Math.pow(10,5)){
            return true;
        }else{
            return false;
        }
    }
}

