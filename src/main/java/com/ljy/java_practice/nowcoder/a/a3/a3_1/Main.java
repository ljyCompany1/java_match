package com.ljy.java_practice.nowcoder.a.a3.a3_1;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22005
 * （1）题目描述：我们可以看到题目描述的上方有一个空间限制32M, 在计算机中一个整数占据4个字节的内存,
 * 1MB等于1024KB, 1KB等于1024B, 1B就代表1字节, 那么请问n MB的内存可以使用多少个整数呢?
 * （2）输入描述：输入一个整数n,表示内存大小(MB) 1<=n<=256
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：1
 * 输出：262144
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
            if(number>=1&&number<=256){
                long result=number*1024*1024/4;
                System.out.println(result);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
