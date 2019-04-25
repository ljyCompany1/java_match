package com.ljy.java_practice.nowcoder.a.a6.a6_7;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22206
 * （1）题目描述：输出九九乘法表，输出格式见样例
 * （2）输入描述：此题没有输入
 * （3）输出描述：输出乘法表，对齐方式见样例输出
 * （4）例如：
 * a.示例1
 * 输入：
无
 * 输出：
 1*1= 1
 1*2= 2 2*2= 4
 1*3= 3 2*3= 6 3*3= 9
 1*4= 4 2*4= 8 3*4=12 4*4=16
 1*5= 5 2*5=10 3*5=15 4*5=20 5*5=25
 1*6= 6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36
 1*7= 7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49
 1*8= 8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=64
 1*9= 9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
 * 2.思路分析
 *关键在于输出的格式与评分一致，两个地方
 * （1）首先值为两位数，因此结果应该用%2d表示
 * （2）乘法表中每个式子之间的空格，通过观察可以知道，空格应该在每行除了第一个式子，每个式子前面都有一个空格
 if(j>1){
 System.out.printf(" ");
 }

 * 3.运行结果
 *通过
 *
 */

public class Main {
    public static void main(String [] args) {
       for(int i=1;i<=9;i++){
           for(int j=1;j<=i;j++){
               if(j>1){//解决乘法表中每个式子之间的空格
                   System.out.printf(" ");
               }
               System.out.printf("%d*%d=%2d",j,i,j*i);
               if(j==i){
                   System.out.printf("\n");
               }
           }
       }
    }
}

