package com.ljy.java_practice.nowcoder.a.a2.a2_5;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/21999
 * （1）题目描述：输入长方体的长、宽、高，计算它的表面积和体积
 * （2）输入描述：输入一行，三个整数a,b,c，以空格隔开，分别表示长宽高。0 <= a, b,c <= 1000
 * （3）输出描述：输出两行，每行一个整数，分别表示表面积和体积
 * （4）例如：
 * a.示例1
 * 输入：1 1 1
 * 输出：
 * 6
 * 1
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
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的长宽高
        String[] str = message.split(" ");//拆分这三个整数
        if(str.length==3){
            try {
                int a = Integer.parseInt(str[0]);
                int b = Integer.parseInt(str[1]);
                int c = Integer.parseInt(str[2]);
                if(validate(a)&&validate(b)&&validate(c)){
                    int s=(a*b+a*c+b*c)*2;
                    int v=a*b*c;
                    System.out.println(s);
                    System.out.println(v);
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
