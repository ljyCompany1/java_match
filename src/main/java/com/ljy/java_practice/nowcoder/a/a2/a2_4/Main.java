package com.ljy.java_practice.nowcoder.a.a2.a2_4;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/21998
 * （1）题目描述：已知长方形的长和宽，求它的周长和面积。
 * （2）输入描述：输入一行，包含两个正整数a, b ，以空格隔开0 <= a, b <= 1000
 * （3）输出描述：出两行，每行一个整数，第一行表示周长，第二行表示面积
 * （4）例如：
 * a.示例1
 * 输入：9 19
 * 输出：
 * 56
 * 171
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
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的实数
        String[] str = message.split(" ");//拆分这两个整数
        if(str.length==2){
            try {
                int a = Integer.parseInt(str[0]);
                int b = Integer.parseInt(str[1]);
                if(validate(a)&&validate(b)){
                    int c=(a+b)*2;
                    int s=a*b;
                    System.out.println(c);
                    System.out.println(s);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean validate(int number){
        if(number>=0&&number<=1000){
            return true;
        }else{
            return false;
        }
    }
}
