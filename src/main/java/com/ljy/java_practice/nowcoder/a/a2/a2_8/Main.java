package com.ljy.java_practice.nowcoder.a.a2.a2_8;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22002
 * （1）题目描述：输入三个数，计算并输出它们的平均数。(保留小数点后6位)
 * （2）输入描述：输入一行，包含三个整数a, b, c,在int范围内
 * （3）输出描述：输出一行， 包含一个浮点数，小数点后保留六位
 * （4）例如：
 * a.示例1
 * 输入：4 5 6
 * 输出：5.000000
 *
 * 2.思路分析
 *（1）本方法错误，无法通过所有测试用例
 * System.out.println(new BigDecimal((a+b+c)/3L).setScale(6,BigDecimal.ROUND_HALF_UP));
 *
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
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的数字
        String[] str = message.split(" ");//拆分这三个整数
        if(str.length==3){
            try {
                BigDecimal a = new BigDecimal(Integer.parseInt(str[0]));
                BigDecimal b = new BigDecimal(Integer.parseInt(str[1]));
                BigDecimal c = new BigDecimal(Integer.parseInt(str[2]));
                System.out.println(a.add(b).add(c).divide(new BigDecimal(3),6,BigDecimal.ROUND_HALF_UP));
            } catch (NumberFormatException e) {
                //e.printStackTrace();
            }
        }
    }
}
