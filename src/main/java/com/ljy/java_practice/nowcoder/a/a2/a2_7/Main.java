package com.ljy.java_practice.nowcoder.a.a2.a2_7;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22001
 * （1）题目描述：任意给出一个小数，编程求不小于它的最小整数与不大于它的最大整数。 即求出这个小数往下取整与往上取整的值。
 * （2）输入描述：输入一行，包含一个浮点数a
 * （3）输出描述：输出两行，第一行表示a往下取整,第二行表示a往上取整。
 * （4）例如：
 * a.示例1
 * 输入：3.5
 * 输出：
 * 3
 * 4
 *
 * 2.思路分析
 * 主要使用两个函数：
 * （1）Math.floor() 向下取整，即小于这个数的最大的那个整数。
 * （2）Math.ceil() 向上取整，即大于这个数的最小的那个整数。
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
            float number = Float.parseFloat(message);
            System.out.println((int)Math.floor(number));
            System.out.println((int)Math.ceil(number));
        } catch (NumberFormatException e) {
            //e.printStackTrace();
        }
    }
}
