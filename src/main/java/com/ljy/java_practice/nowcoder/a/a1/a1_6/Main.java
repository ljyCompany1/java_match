package com.ljy.java_practice.nowcoder.a.a1.a1_6;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/21989
 * （1）题目描述：输入两个整数a, b, 输出a 除以b的余数，5除以2的余数为1，10除以4的余数为2
 * （2）输入描述：输入两个整数，在int范围内
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：5 2
 * 输出：1
 * 2.思路分析
 * (1)如何从控制台拆分出两个整数
 * (2)注意对除数0进行验证——很多选手因为题目没有就不进行验证
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
        String[] str = message.split(" ");//拆分这两个整数
        if(str.length==2){
            try {
                int a=Integer.parseInt(str[0]);
                int b=Integer.parseInt(str[1]);
                if(b!=0){
                    System.out.println(a%b);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();//转换异常的话不输出
            }
        }
    }
}
