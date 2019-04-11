package com.ljy.java_practice.nowcoder.a.a3.a3_4;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22008
 * （1）题目描述：判断一个整数n是奇数还是偶数,如果是奇数,输出"odd", 否则输出"even"
 * （2）输入描述：输入一个整数n（1 <= n <= 100）
 * （3）输出描述：输出odd或者even
 * （4）例如：
 * a.示例1
 * 输入：2
 * 输出：even
 * b.示例2
 *输入：1
 * 输出：odd
 * 2.思路分析
 *将数字除以2取余数，就可以判断出奇偶数
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
                if(number%2==0){
                    System.out.println("even");
                }else{
                    System.out.println("odd");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
