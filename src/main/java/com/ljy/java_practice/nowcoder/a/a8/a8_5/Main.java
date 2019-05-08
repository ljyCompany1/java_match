package com.ljy.java_practice.nowcoder.a.a8.a8_5;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22227
 * （1）题目描述：n个人（0,1,2,3,4...n-1），围成一圈，从编号为k的人开始报数，报数报到m的人出队（报数是1,2,...m这样报的）。下次从出队的人之后开始重新报数，循环往复，当队伍中只剩最后一个人的时候，那个人就是大王。现在，给定n，k，m，
 请你求出大王的编号。
 * （2）输入描述：
 输入一行包含三个整数n,k,m
 1<=n<=100,1<=k<=n-1,1<=m<=100
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：
 5 1 2
 * 输出：
3

 * 2.思路分析
 *（1）
 *
 * 3.运行结果
 *通过。
 * 注意：在模拟系统中，如果加入 1<=n<=100,1<=k<=n-1,1<=m<=100的验证，则只能通过90%。初步认为是系统用例问题
 *
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//n个人
        int k=sc.nextInt();//从k开始计数
        int m=sc.nextInt();//报到m的人出队
        if(n>=1&&n<=100&&k>=1&&k<=n-1&&m>=1&&m<=100){
            List<Integer> list=new ArrayList<Integer>();//存储人员编号
            for(int i=0;i<n;i++){//将人的编号添加到集合李
                list.add(i);
            }
            while(true){
                int size=list.size();//计算剩余的人
                if(size==1){//当只剩下一个人时结束报数
                    System.out.println(list.get(0));
                    break;
                }
                int j=0;//用于对m进行技术，表示当前报数到几
                for(int i=k;i<size;){
                    j++;//报数
                    if(j==m){//如果报数达到m
                        list.remove(i);//报数的人出列
                        if(i==size-1){//如果队伍最后一个位置的人出列，则让i=0，即下一次从头开始数
                            i=0;
                        }
                        k=i;//获取当前的位置，让每次报数都从k开始
                        break;//一个报数循环结束（有人出列为一个循环）
                    }
                    if(i==size-1){//让i重复，保证每次到最后一个位置时都能重新回到第一个位置开始报数
                        i=0;//这里不需要i++
                    }else{
                        i++;//让报数位置往后移
                    }
                }
            }
        }
    }
}
