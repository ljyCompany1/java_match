package com.ljy.java_practice.nowcoder.a.a3.a3_7;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22011
 * （1）题目描述：如果一个数是一个偶数或者大于50,我们称它为牛可乐数
 * （2）输入描述：输入一个整数n (1 <= n <= 100)
 * （3）输出描述：如果是牛可乐数,输出"yes", 否则输出"no"
 * （4）例如：
 * a.示例1
 * 输入：50
 * 输出：yes
 * b.示例2
 * 输入：2
 * 输出：yes
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
            if(number>=1&&number<=100){
                if(number%2==0||number>50){//如果一个数是一个偶数或者大于50
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
