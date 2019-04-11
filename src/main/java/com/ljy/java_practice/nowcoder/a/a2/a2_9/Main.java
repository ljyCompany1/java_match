package com.ljy.java_practice.nowcoder.a.a2.a2_9;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22003
 * （1）题目描述：输入一个整数, 求它的平方根,输出答案往下取整.比如5的平方根=2，16的平方根=4
 * （2）输入描述：输入一个整数n (1 <= n <= 100000)
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：5
 * 输出：2
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
            int number=Integer.parseInt(message);
            if(number>=1&&number<=100000){
                System.out.println((int)Math.sqrt(number));
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
