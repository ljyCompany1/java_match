package com.ljy.java_practice.nowcoder.a.a4.a4_7;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22162
 * （1）题目描述：7是牛牛的幸运数字，现在牛牛想要完成以下任务
 将1~n之间（含n）所有能被7整除的数累加并输出结果
 * （2）输入描述：输入一行，包含一个整数n（1 <= n <= 1000）
 * （3）输出描述：输出一行，包含一个整数
 * （4）例如：
 * a.示例1
 * 输入：14
 * 输出：21
 *
 * 2.思路分析
 *
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
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的数字
        try {
            int n=Integer.parseInt(message);
            if(n>=1&&n<=1000){
                int sum=0;//总和
                for(int i=1;i<=n;i++) {
                    if(i%7==0) {
                        sum+=i;
                    }
                }
                System.out.println(sum);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
