package com.ljy.java_practice.nowcoder.a.a7.a7_6;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22216
 * （1）题目描述：在计算机里，数据结构栈的特点是先进后出。一批数据批量的出栈序列是入栈序列的逆序。
 * 给你一批入栈序列，请输出他们的出栈序列。
 * （2）输入描述：多组测试数据。第一行输入一个整数T表示测试数据组数 每组首先输入1个整数n,然后输入n个整数。n <= 100
 *（3）输出描述：对于每组测试数据按照输入相反的顺序输出n个数据
 * （4）例如：
 * a.示例1
 * 输入：
 2
 3
 1 2 3
 5
 2 3 1 4 5
 * 输出：
 3 2 1
 5 4 1 3 2

 * 2.思路分析
 *（1）常识最大公因数，也称最大公约数、最大公因子，指两个或多个整数共有约数中最大的一个
 *（2）如何处理控制台的输入输出
 * 3.运行结果
 *通过
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();//总的测试组数
        List<int[]> list=new ArrayList<int[]>();
        //第一步：先将所有值录入数组
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();//每组测试数字的个数
            if(n<=100){
                int[] array=new int[n];
                for(int j=0;j<n;j++){
                    array[j]=sc.nextInt();
                }
                list.add(array);
            }
        }
        //第二步：逆向输出所有数组
        for(int[] array:list){
            for(int i=array.length-1;i>=0;i--){
                if(i!=array.length-1){//不是一个数字的话，需要在前面加上空格
                    System.out.print(" ");
                }
                System.out.print(array[i]);
                if(i==0){//最后一个数字，换行
                    System.out.println();
                }
            }
        }
    }
}