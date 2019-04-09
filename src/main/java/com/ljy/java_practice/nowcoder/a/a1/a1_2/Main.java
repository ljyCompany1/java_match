package com.ljy.java_practice.nowcoder.a.a1.a1_2;


/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/21985
 * （1）题目描述：牛牛刚刚出生，嗷嗷待哺，一开始他只能学说简单的数字，你跟他说一个整数，他立刻就能学会。
 * （2）输入描述：输入一个整数，范围在32位有符号整数范围内
 * （3）输出描述：输出这个整数
 * （4）例如：
 * a.示例1
 * 输入：3
 * 输出：3
 * 2.思路分析
 * (1)熟悉如何从控制台获取数据
 * (2)32位整数即int类型;
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的整数
        try {
            System.out.println(Integer.parseInt(message));//输出转换的整数
        } catch (NumberFormatException e) {
            //e.printStackTrace();//转换异常的话不输出
        }
    }
}
