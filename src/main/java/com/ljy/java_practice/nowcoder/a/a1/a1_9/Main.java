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
 * 3.运行结果
 * case通过率为90.00%，无法完全通过，初步考虑是java运行时间较长，超过时间限制。暂无解决思路
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
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的两个整数
        String[] str = message.split(" ");//拆分这两个整数
        if(str.length==2){
            try {
                int a=Integer.parseInt(str[0]);
                int b=Integer.parseInt(str[1]);
                if(b!=0){
                    //System.out.println(String.format("%.3f", (double)a/b));//该方法也可以计算
                    BigDecimal decimall = new BigDecimal(a);
                    BigDecimal decimal2 = new BigDecimal(b);
                    BigDecimal decimal = decimall.divide(decimal2,3,BigDecimal.ROUND_HALF_UP);
                    System.out.println(decimal);
                }
            } catch (NumberFormatException e) {
                //e.printStackTrace();//转换异常的话不输出
            }
        }
    }
}
