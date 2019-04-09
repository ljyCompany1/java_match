package com.ljy.java_practice.nowcoder.a.a1.a1_4;


/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/21987
 * （1）题目描述：给你两个整数，要求输出这两个整数的和
 * （2）输入描述：输入两个整数 a, b （0 <= a, b <= 1000）
 * （3）输出描述：输出一个整数.
 * （4）例如：
 * a.示例1
 * 输入：1 2
 * 输出：3
 * 2.思路分析
 * (1)如何从控制台拆分出两个整数
 * (2)要根据题目要求进行验证
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的两个整数
        String[] str = message.split(" ");//拆分这两个整数
        if(str.length==2){
            try {
                int a=Integer.parseInt(str[0]);
                int b=Integer.parseInt(str[1]);
                if(a>=0&&b<=1000){
                    System.out.println(a+b);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();//转换异常的话不输出
            }
        }
    }
}
