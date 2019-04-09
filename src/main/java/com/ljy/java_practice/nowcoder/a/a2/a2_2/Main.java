package com.ljy.java_practice.nowcoder.a.a2.a2_2;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/21995
 * （1）题目描述：输入梯形的上边和下边边长,以及梯形的高度,求梯形的面积
 * （2）输入描述：输入三个整数up,down,height
 * （3）输出描述：输出面积,保留三位小数
 * （4）例如：
 * a.示例1
 * 输入：1 2 3
 * 输出：4.500
 * 2.思路分析
 * （1）如何从控制台拆分出三个整数
 * （2）用BigDecimal进行计算
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
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的三个整数
        String[] str = message.split(" ");//拆分这三个整数
        if(str.length==3){
            try {
                BigDecimal up = new BigDecimal(Integer.parseInt(str[0]));
                BigDecimal down = new BigDecimal(Integer.parseInt(str[1]));
                BigDecimal height = new BigDecimal(Integer.parseInt(str[2]));
                BigDecimal result=up.add(down).multiply(height).divide(new BigDecimal(2),3,BigDecimal.ROUND_HALF_UP);
                System.out.println(result);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
