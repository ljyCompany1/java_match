package com.ljy.java_practice.nowcoder.a.a9.a9_3;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22237
 * （1）题目描述：牛牛想要挑战一下自己的勇气，于是打算去玩牛村的刺激过山车，牛村的刺激过山车一排只坐一个人，牛牛胆子比较小，所以他要求必须坐在前面有人或者后面有人的空位置。
 牛牛上车前只知道这批过山车总共有n个位置，已经有k个人坐上去了，请帮助牛牛计算一下最少有多少个位置符合他的要求，最多有多少个位置符合他的要求。
 注：第一个位置的前面和最后一个位置的后面我们认为是没有人。
 * （2）输入描述：一行两个整数n,k。n≥k≥0
 * （3）输出描述：输出两个整数表示最少和最多的符合他要求的位置
 * （4）例如：
 * a.示例1
 * 输入：6 3
 * 输出：1 3
 *b.示例2
 * 输入：6 2
 * 输出：1 4
 * 2.思路分析
 *（1）首先，如果没有人坐车子（即k=0），则符合条件的位置为0
 *（2）其次，假设空位置足够（n-k>2*k）
 * 那么1个人就有最多2个位置符合条件，2个人最多有4个位置符合条件，3个人最多有6个位置符合条件
 * 如果超过这个最大位置，那么剩余再多的位置也没意义
 * （3）加入空位置不足够满足条件2（2*k），那么n-k就是可以坐的位置
 *
 * 3.运行结果
 *通过
 *
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(k>=0&&n>=k){
            int min=0,max=0;
            if(n>k){
                if(k!=0){//只有有人乘坐，才能算符合条件的位置
                    min=1;
                    if(n-k>2*k){
                        max=2*k;
                    }else{
                        max=n-k;
                    }
                }else{//如果没有人乘坐，则符合条件的位置为0
                    min=0;
                }
            }
            System.out.print(min+" "+max);
        }
    }
}
