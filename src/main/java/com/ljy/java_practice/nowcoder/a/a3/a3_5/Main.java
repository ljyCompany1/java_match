package com.ljy.java_practice.nowcoder.a.a3.a3_5;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22009
 * （1）题目描述：输入两个整数X，Y，通过交换将大的数放在X中，小的数放在Y中。
 * （2）输入描述：输入一行，包含两个整数X,Y
 * （3）输出描述：输出两行，每行一个整数，输出交换后的X, Y
 * （4）例如：
 * a.示例1
 * 输入：4 5
 * 输出：
 * 5
 * 4
 *
 * 2.思路分析
 *
 *  *
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
                int x=Integer.parseInt(strs[0]);
                int y=Integer.parseInt(strs[1]);
                int temp=x;
                x=y;
                y=temp;
                System.out.println(x);
                System.out.println(y);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
