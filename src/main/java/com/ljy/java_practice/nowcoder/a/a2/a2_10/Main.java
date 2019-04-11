package com.ljy.java_practice.nowcoder.a.a2.a2_10;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22004
 * （1）题目描述：输入一个浮点数f, 表示华氏温度, 输出对应的摄氏温度c , c=5/9*(f-32)
 * （2）输入描述：输入一个浮点数f(1 <= f<= 100000)
 * （3）输出描述：输出浮点数,保留3位小数
 * （4）例如：
 * a.示例1
 * 输入：100
 * 输出：37.778
 *
 * 2.思路分析
 *注意浮点数使用Double，不要使用float。否则会因为精度问题导致无法通过所有测试用例
 * (1)使用BigDecimal进行计算，更适合实战算法
 * (2)使用System.out.printf("%1.3f",(5.0/9)*(number-32));进行控制台输出
 * 3.运行结果
 *通过
 *
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
            Double number=Double.parseDouble(message);
            if(number>=1&&number<=100000){
                BigDecimal f=new BigDecimal(String.valueOf(number));
                BigDecimal result=new BigDecimal(5).multiply(f.subtract(new BigDecimal(32))).divide(new BigDecimal(9),3,BigDecimal.ROUND_HALF_UP);
                System.out.println(result);
                //System.out.printf("%1.3f",(5.0/9)*(number-32));//该方法直接输出也可以获得结果

            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
