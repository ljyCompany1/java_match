package com.ljy.java_practice.nowcoder.a.a4.a4_3;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22158
 * （1）题目描述：牛牛准备继续进阶，计算更难的数列
 *输入一个整数n,计算 1+1/（1-3）+1/（1-3+5）+...+1/(1-3+5-...+2n-1)的值
 * （2）输入描述：输入一个整数
 * （3）输出描述：输出一个浮点数，保留3位小数
 * （4）例如：
 * a.示例1
 * 输入：1
 * 输出：1.000
 *
 * 2.思路分析
 *对数列的规律进行了解
 * （1）首先，1/(2n-1)是计算的列式
 * （2）其次，要了解什么分母中什么时候是减法，什么时候是加法。
 * 通过观察可以知道，当n为奇数时，是加法；当n为偶数时，是减法。用-1的(n-1)次方，可以解决
 *
 * 3.运行结果
 *通过
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
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的数字
        try {
            int n=Integer.parseInt(message);
            BigDecimal sum=new BigDecimal(0);//所有分式的总和，默认为0
            for(int i=1;i<=n;i++){//计算有多少个分式
                BigDecimal sumTemp=new BigDecimal(0);//分母的总和，默认为0
                for(int j=1;j<=i;j++){//用于计算每个分式的值
                    //Math.pow(-1,j-1)可以计算分母中累加时，每个式子是加法还是减法
                    sumTemp=sumTemp.add(new BigDecimal((2*j-1)*Math.pow(-1,j-1))).setScale(6,BigDecimal.ROUND_HALF_UP);
                }
                //用1/分母，得出每个分式的值，然后计算入总和中
                sum=sum.add(new BigDecimal(1).divide(sumTemp,6,BigDecimal.ROUND_HALF_UP));
            }
            //对结果进行三位小数取舍
            sum=sum.setScale(3,BigDecimal.ROUND_HALF_UP);
            System.out.println(sum);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
