package com.ljy.java_practice.nowcoder.a.a5.a5_2;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22167
 * （1）题目描述：计算a+b
 * （2）输入描述：多组数据，每组输入两个整数，当两个整数都为0时表示输入结束
 * （3）输出描述：对于每组数据输出两个整数的和
 * （4）例如：
 * a.示例1
 * 输入：
 1 1
 2 2
 0 0
 * 输出：
 2
 4
 *
 * 2.思路分析
 *主要考察对控制台数据的拆分
 * 3.运行结果
 *通过
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        List<String> list=new ArrayList<String>();
        String message=null;
        while(true){
            message=bf.readLine();
            String[] strs=message.split(" ");
            if(strs.length==2){
                int a= 0;
                int b= 0;
                try {
                    a = Integer.parseInt(strs[0]);
                    b = Integer.parseInt(strs[1]);
                    if(a==0&&b==0){
                        break;
                    }else{
                        list.add(message);
                    }
                } catch (NumberFormatException e) {
                    break;
                }
            }
        }
        for(String s:list){
            String[] strs=s.split(" ");
            if(strs.length==2){
                int a=Integer.parseInt(strs[0]);
                int b=Integer.parseInt(strs[1]);
                System.out.println(a+b);
            }
        }
    }
}
