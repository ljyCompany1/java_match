package com.ljy.java_practice.nowcoder.a.a3.a3_9;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22014
 * （1）题目描述：群众想要吃瓜，于是给你一个瓜让你切，但是作为考验。
 * 告诉你西瓜的重量，问你能否将这个西瓜分成两部分，每个部分都是偶数。
 * （2）输入描述：输入一行，包含一个整数weight,表示西瓜的重量1 <= weight <= 100
 * （3）输出描述：输出一行，见样例。
 * （4）例如：
 * a.示例1
 * 输入：8
 * 输出：YES, you can divide the watermelon into two even parts.
 * b.示例2
 * 输入：3
 * 输出：NO, you can't divide the watermelon into two even parts.
 * 2.思路分析
 * 第一种：完全的对偶数进行拆分（本例选择这个，可以举一反三，包括对奇数的拆分也可以采用这个方法）
 *（1）如果weight是奇数，那么肯定不能拆分为2个偶数
 * （2）如果weight是偶数，那么要逐步进行拆分。不能简单的/2，例如10/2=5
 * 第二种：根据常识
 * 只要不是2，即大于2的偶数一定是可以拆分为两个偶数部分的
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
            int weight=Integer.parseInt(message);
            if(weight>=1&&weight<=100){
                boolean status=false;//true表示可以拆分为两个偶数，默认不能拆分为两个偶数
                if(weight%2==0){//如果是偶数
                    if(weight>=4){//2的话肯定不行，所以从4开始
                        for(int i=2;i<weight;i=i+2){//i表示一部分，这里让i+2表示它是偶数。因为另一半不能为0，所以
                            if((weight-2)%2==0){//如果另一部分也是偶数
                                status=true;
                                break;
                            }
                        }
                    }
                }
                if(status){
                    System.out.println("YES, you can divide the watermelon into two even parts.");
                }else{
                    System.out.println("NO, you can't divide the watermelon into two even parts.");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
