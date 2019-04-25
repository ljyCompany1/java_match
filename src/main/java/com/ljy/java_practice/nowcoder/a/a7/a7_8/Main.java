package com.ljy.java_practice.nowcoder.a.a7.a7_8;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22219
 * （1）题目描述：请在给定的数组中查找一个特定的数字，如果该数字出现多次，请输出第一次出现的位置。
 * （2）输入描述：多组测试，每组第一行输入1个整数n（n<20）,然后是n个整数 第二行输入1个整数m
 *（3）输出描述：查找在第一行的n个整数中第一次出现数字m的下标位置并输出，如果没有找到则输出No,下标从0开始
 * （4）例如：
 * a.示例1
 * 输入：
 3 4 5 6
 5
 4 2 2 2 2
 2
 * 输出：
 1
 0

 * 2.思路分析
 * 重点在如何处理控制台的输入输出
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n<20){
                int[] array=new int[n];
                for(int i=0;i<n;i++){
                    array[i]=sc.nextInt();
                }
                int m=sc.nextInt();//数字M
                boolean judge=false;//表示没有找到
                for(int i=0;i<n;i++){
                    if(m==array[i]){
                        judge=true;
                        System.out.println(i);
                        break;
                    }
                }
                if(judge==false){
                    System.out.println("No");
                }
            }
        }
    }
}