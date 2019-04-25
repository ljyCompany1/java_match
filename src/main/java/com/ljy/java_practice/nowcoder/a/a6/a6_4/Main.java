package com.ljy.java_practice.nowcoder.a.a6.a6_4;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22203
 * （1）题目描述：请编写程序输出金字塔图形。
 * （2）输入描述：多个测试数据。每个测试数据输入一个整数n(1 <= n <= 9)
 * （3）输出描述：输出金字塔
 * （4）例如：
 * a.示例1
 * 输入：
 1
 3
 * 输出：
 *
   *
  ***
 *****
 * 2.思路分析
 *找规律
 * 首先可以找到每层的*数量，得出公式：n层的星号数量=1+2*(n-1)
 * 其次计算左边空格的数量。可以得出：（最大层的星号数量-当前层的星号数量）/2
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
            if(n>=1&&n<=9){
                StringBuilder stringBuilder=null;
                int max=1+2*(n-1);//最底层的星数
                int m=0;//存储当前层的星数
                for(int a=1;a<=n;a++){//对层进行循环
                    m=1+2*(a-1);
                    stringBuilder=new StringBuilder();
                    for(int c=1;c<=(max-m)/2;c++){//添加星号左边的空格
                        stringBuilder.append(" ");
                    }
                    for(int d=1;d<=m;d++){
                        stringBuilder.append("*");
                    }
                    System.out.printf("%s\n", stringBuilder.toString());
                }
            }
        }
    }
}

