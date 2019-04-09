package com.ljy.java_practice.nowcoder.a.a2.a2_6;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22000
 * （1）题目描述：给定一个三位数的整数。然后提取百位，十位和个位，反转输出。
 * （2）输入描述：输入一个3位整数n （100<= n<= 999）
 * （3）输出描述：一个正整数
 * （4）例如：
 * a.示例1
 * 输入：120
 * 输出：021
 * 2.思路分析
 * 无
 * 3.运行结果
 *通过
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的数字
        try {
            int number = Integer.parseInt(message);
            if(validate(number)){//如果数字有效，是三位数
                message=new StringBuilder(message).reverse().toString();
                System.out.println(message);
            }
        } catch (NumberFormatException e) {
            //e.printStackTrace();
        }
    }

    private static boolean validate(int number){
        if(number>=100&&number<=999){
            return true;
        }else{
            return false;
        }
    }
}
