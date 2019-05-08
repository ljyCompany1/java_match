package com.ljy.java_practice.nowcoder.a.a8.a8_6;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22228
 * （1）题目描述：在给定的数组中删除一个数。
 * （2）输入描述：
 多组测试。
 每组第一行输入1个整数n（n<20),然后是n个整数 第二行输入1个整数m。
 * （3）输出描述：删除在第一行的n个整数中第一次出现数字m并删除，然后按照顺序输出剩下的数。
 * （4）例如：
 * a.示例1
 * 输入：
 4 1 2 3 4
 3
 * 输出：
 1 2 4

 * 2.思路分析
 *（1）
 *
 * 3.运行结果
 * 通过
 *
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();//整数m
            if(n<20){
                List<Integer> numbers=new ArrayList<Integer>();
                for(int i=0;i<n;i++){
                    numbers.add(sc.nextInt());
                }
                int m=sc.nextInt();
                for(int i=0;i<n;i++){
                    if(numbers.get(i)==m){
                        numbers.remove(i);
                        break;
                    }
                }
                for(int i=0;i< numbers.size();i++){
                    if(i!=0){
                        System.out.print(" ");
                    }
                    System.out.print(numbers.get(i));
                }
                System.out.println();
            }
        }
    }
}
