package com.ljy.java_practice.nowcoder.a.a1.a1_8;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/21991
 * （1）题目描述：输入一个整数，求其十位数
 * （2）输入描述：输入一个整数,在int范围内
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：123
 * 输出：2
 * 2.思路分析
 *
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
        try {
            int a=Integer.parseInt(message);
            System.out.println((a/10)%10);
        } catch (NumberFormatException e) {
            //e.printStackTrace();//转换异常的话不输出
        }
    }
}
