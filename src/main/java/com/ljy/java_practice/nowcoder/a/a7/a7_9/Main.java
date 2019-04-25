package com.ljy.java_practice.nowcoder.a.a7.a7_9;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22220
 *（1）题目描述：牛可乐打算对班里成绩低于平均分的同学进行定向的课程辅导，请输出所有低于平均分的分数。
 *（2）输入描述：多个测试数据每个测试数据一行，在这行中先输入分数的个数n(1<=n<=100),
 * 然后紧跟着输入n个整数（代表分数）
 *（3）输出描述：对于每个测试数据，输出一行按照输入顺序输出所有低于(<)平均分的分数，中间用一个空格隔开，如果没有低于平均分的那么只输出一个空行
 * （4）例如：
 * a.示例1
 * 输入：
 3 40 50 60
 2 90 80
 5 10 10 90 80 80
 * 输出：
 40
 80
 10 10

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
            if(n>=1&&n<=100){
                int[] array=new int[n];
                int sum=0;//获取输入数字总和
                for(int i=0;i<n;i++){
                    array[i]=sc.nextInt();
                    sum+=array[i];
                }
                double average=sum*1F/n;//获取平均分
                boolean exists=false;//表示是否出现过该数，如果出现过则要在数字前面加空格
                for(int i=0;i<n;i++){
                    if(array[i]<average){
                        if(exists==true){
                            System.out.print(" ");
                        }
                        exists=true;
                        System.out.print(array[i]);
                    }
                }
                System.out.println();
            }
        }
    }
}