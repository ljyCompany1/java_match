package com.ljy.java_practice.nowcoder.a.a4.a4_2;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22157
 * （1）题目描述：这次牛牛又换了个数列，他想计算：1+1/2+1/3+…+1/N的值。(保留6位小数)
 * （2）输入描述：输入一个整数，范围在0到1000
 * （3）输出描述：输出一个浮点数
 * （4）例如：
 * a.示例1
 * 输入：2
 * 输出：1.500000
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
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的数字
        try {
            int n=Integer.parseInt(message);
            if(n>=0&&n<=1000){
                BigDecimal sum=new BigDecimal(0);//默认的总和
                for(int i=1;i<=n;i++){
                    sum=sum.add(new BigDecimal(1).divide(new BigDecimal(i),8,BigDecimal.ROUND_HALF_UP));
                }
                sum=sum.setScale(6,BigDecimal.ROUND_HALF_UP);
                System.out.println(sum);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
