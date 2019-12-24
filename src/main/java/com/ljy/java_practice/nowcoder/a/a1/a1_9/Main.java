package com.ljy.java_practice.nowcoder.a.a1.a1_9;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/21992
 * （1）题目描述：输入两个整数a, b, 输出a除以b的值，保留三位小数
 * （2）输入描述：输入两个整数，在int范围内
 * （3）输出描述：输出一个浮点数，保留三位小数
 * （4）例如：
 * a.示例1
 * 输入：5 2
 * 输出：2.500
 * 2.思路分析
 * (1)如何从控制台拆分出两个整数
 * (2)注意对除数0进行验证——很多选手因为题目没有就不进行验证
 *
 * 3.运行结果分析
 * 1.case通过率为90.00%，无法完全通过，这题是练习中唯一的BigDecimal不能保证100%计算正确的计算题
 * 2.在20191126重新分析，发现如果用DecimalFormat可以保证100%正确，故改为DecimalFormat实现
 * 至于为什么BigDecimal无法保证100%正确，原因不明
 *
 */
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(new DecimalFormat("#.###").format(a*1f/b));
    }
}
