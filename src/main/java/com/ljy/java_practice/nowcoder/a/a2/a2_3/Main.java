package com.ljy.java_practice.nowcoder.a.a2.a2_3;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/21997
 * （1）题目描述：已知圆的半径，求它的周长和面积。此题令pi=3.14159
 * （2）输入描述：输入一个实数a
 * （3）输出描述：输出两行，每行一个实数，第一行表示周长，第二行表示面积（结果均保留六位小数）
 * （4）例如：
 * a.示例1
 * 输入：4
 * 输出：
 * 25.132720
 * 50.265440
 * 2.思路分析
 * （1）用BigDecimal进行计算
 * 3.运行结果
 *通过
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的实数
        BigDecimal pi = new BigDecimal("3.14159");
        BigDecimal number=new BigDecimal(message);
        BigDecimal c=pi.multiply(new BigDecimal(2)).multiply(number).setScale(6,BigDecimal.ROUND_HALF_UP);
        BigDecimal s=pi.multiply(number.pow(2)).setScale(6,BigDecimal.ROUND_HALF_UP);
        System.out.println(c);
        System.out.println(s);
    }
}
