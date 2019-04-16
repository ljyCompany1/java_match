package com.ljy.java_practice.nowcoder.a.a5.a5_1;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22166
 * （1）题目描述：计算a+b
 * （2）输入描述：第一行输入一个数据组数n，接下来n行每行输入两个整数
 * （3）输出描述：对于每组数据计算a+b的值
 * （4）例如：
 * a.示例1
 * 输入：
 2
 1 1
 2 2
 * 输出：
 2
 4
 *
 * 2.思路分析
 *主要考察对控制台数据的拆分
 * 3.运行结果
 *通过
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        int n = Integer.parseInt(bf.readLine());//根据题目输入要求：获取控制台录入的信息,表示几行数组
        String[] messages=new String[n];
        for(int i=0;i<n;i++){
            messages[i]=bf.readLine();
        }
        for(String message:messages){
            String[] strs=message.split(" ");
            if(strs.length==2){
                int a=Integer.parseInt(strs[0]);
                int b=Integer.parseInt(strs[1]);
                System.out.println(a+b);
            }
        }
    }
}
