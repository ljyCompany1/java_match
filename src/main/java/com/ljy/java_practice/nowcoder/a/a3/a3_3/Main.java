package com.ljy.java_practice.nowcoder.a.a3.a3_3;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22007
 * （1）题目描述：牛牛渐入佳境，他准备做一个加法模拟器来玩玩，输入两个数，分别打印这两个数的横式和竖式运算式子。
 * （2）输入描述：输入两个整数a, b 以空格隔开。 0 <= a, b <= 1000
 * （3）输出描述：第一行打印横式运算式子，接下来四行打印竖式运算式子
 * （4）例如：
 * a.示例1
 * 输入：45 237
 * 输出：
 * 45+237=282
 *     45
 * +   237
 * -------
 *     282
 * 备注：注意printf的时候使用%xd来进行右对齐 ，x是一个数字(C语言)
 *
 * 2.思路分析
 * 本题主要考察控制台的输出
 * （1）通过-------可以知道，总共有7个字符长度
 * （2）使用%7d表示数字的长度为7，如果数据的位数小于7，则左端补以空格，若大于7，则按实际位数输出。
 * 在第二行因为有“+”号占去一个字符，所以为%6d
 *
 *(33)知识点：printf的格式控制的完整格式：
 %  -  0  m.n  l或h  格式字符
 下面对组成格式说明的各项加以说明：
 d格式：用来输出十进制整数。有以下几种用法：
 %d：按整型数据的实际长度输出。
 %md：m为指定的输出字段的宽度。如果数据的位数小于m，则左端补以空格，若大于m，则按实际位数输出。
 %ld：输出长整型数据

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
        String[] strs=message.split(" ");
        if(strs.length==2){
            try {
                int a=Integer.parseInt(strs[0]);
                int b=Integer.parseInt(strs[1]);
                if(validate(a)&&validate(b)){
                    int sum=a+b;
                    System.out.println(a+"+"+b+"="+sum);//输出第一行
                    System.out.printf("%7d\n", a);
                    System.out.printf("+%6d\n", b);
                    System.out.println("-------");
                    System.out.printf("%7d\n", sum);
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
