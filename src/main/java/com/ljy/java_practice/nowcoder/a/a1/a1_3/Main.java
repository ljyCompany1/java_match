package com.ljy.java_practice.nowcoder.a.a1.a1_3;



/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/21986
 * （1）题目描述：会说整数之后，牛牛开始尝试浮点数（小数）, 输入一个浮点数，输出这个浮点数。
 * （2）输入描述：输入一个浮点数
 * （3）输出描述：输出一个浮点数，保留三位小数
 * （4）例如：
 * a.示例1
 * 输入：1.359578
 * 输出：1.360
 * 2.思路分析
 * (1)从示例中可以看出是四舍五入
 * (2)使用BigDecimal处理
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
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的整数
        try {
            float number=Float.parseFloat(message);
            BigDecimal decimal = new BigDecimal(number);
            decimal = decimal.setScale(3,BigDecimal.ROUND_HALF_UP);//保留小数点后三位有效数字，四舍五入
            System.out.println(decimal);
        } catch (NumberFormatException e) {
            //e.printStackTrace();//转换异常的话不输出
        }
    }
}
