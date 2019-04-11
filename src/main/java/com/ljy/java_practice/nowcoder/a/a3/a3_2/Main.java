package com.ljy.java_practice.nowcoder.a.a3.a3_2;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22006
 * （1）题目描述：牛牛发明了一种新的四舍五入应用于整数，对个位四舍五入，规则如下
 * 12345->12350
 * 12399->12400
 * （2）输入描述：输入一个整数n,(0<=n<=10的9次方)
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：99
 * 输出：100
 *
 * 2.思路分析
 *将数值/10，然后对小数点进行四舍五入，再将结果*10
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
            int number=Integer.parseInt(message);
            if(number>=0&&number<=Math.pow(10,9)){
                BigDecimal result=new BigDecimal(number).divide(new BigDecimal(10),0,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(10));
                System.out.println(result);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
