package com.ljy.java_practice.nowcoder.a.a5.a5_3;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22168
 * （1）题目描述：求出a到b之间有多少个数数位之和为5的倍数
 * （2）输入描述：输入一行包含两个整数x,y ((0≤x,y≤1000000)
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：
 10 20
 * 输出：
 2
 *
 * 题目说明：14和19的数位和为5和10，符合条件
 *
 * 2.思路分析
 *主要考察对控制台数据的拆分，容易出错的地方在于理解错位数，注意是所有位数的累加
 * 3.运行结果（题目描述不清，通过多次测试才得出规律，此题参考价值小）
 *通过
 *
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String message=bf.readLine();
        String[] strs=message.split(" ");
        if(strs.length==2){
            int a=Integer.parseInt(strs[0]);
            int b=Integer.parseInt(strs[1]);
            if(validate(a)&&validate(b)){
                if(a<b){//保证a的值最大
                    int temp=a;
                    a=b;
                    b=temp;
                }
                int n=0;//存储a到b之间有多少个数数位之和为5的倍数
                for(;b<=a;b++){
                    int sum=0;//存储当前数的所有位数之和
                    int i=b;
                    while(i!=0){//循环获取所有位数
                        sum+=i%10;
                        i/=10;//将位数减少
                    }
                    if(sum%5==0){//如果数位之和是5的倍数
                        n++;
                    }
                }
                System.out.println(n);
            }
        }
    }

    private static boolean validate(int number){
        if(number>=0&&number<=1000000){
            return true;
        }else{
            return false;
        }
    }
}
