package com.ljy.java_practice.nowcoder.a.a3.a3_8;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22012
 * （1）题目描述：判断一个整数n是否是闰年
 * （2）输入描述：输入一个整数n (1 <= n <= 2018)
 * （3）输出描述：是闰年输出"yes" 否则输出"no"
 * （4）例如：
 * a.示例1
 * 输入：2000
 * 输出：yes
 * b.示例2
 * 输入：1900
 * 输出：no
 * 2.思路分析
 *闰年是公历中的名词。闰年分为普通闰年和世纪闰年。
 * 普通闰年:能被4整除但不能被100整除的年份为普通闰年。（如2004年就是闰年，1900年不是闰年）；
 * 世纪闰年:能被400整除的为世纪闰年。（如2000年是世纪闰年，1900年不是世纪闰年）；
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
            int number=Integer.parseInt(message);
            if(number>=1&&number<=2018){
                if((number%4==0&&number%100!=0)||(number%400==0)){//如果是闰年
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
