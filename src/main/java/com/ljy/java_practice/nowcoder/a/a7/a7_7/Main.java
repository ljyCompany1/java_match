package com.ljy.java_practice.nowcoder.a.a7.a7_7;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22218
 * （1）题目描述：草原上要举行男女混双的乒乓球比赛了，牛村要派出最强的队伍参加，我们假设男女组合战斗力值为男战斗力加上女战斗力的和，现在需要挑选组合战斗力最强的一对男女参赛。
 给你牛村所有男生和女生的乒乓球战斗力列表，请计算最大的组合战斗力。
 * （2）输入描述：
 * 输入三行。第一行输入两个整数n，m，表示男生数量和女生数量。
 * 第二行输入n个整数ai，表示所有男生的战斗力值
 * 第三行输入m个整数bi。，表示所有女生的战斗力值
 * 1 <= n,m <= 100, 1 <=ai,bi <= 100
 *（3）输出描述：最大的组合战斗力值
 * （4）例如：
 * a.示例1
 * 输入：
 2 3
 1 2
 1 2 3
 * 输出：
 5

 * 2.思路分析
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//男生数量
        int m=sc.nextInt();//女生数量
        if(validate(n)&&validate(m)){
            int[] man=new int[n];//男生战斗力组合
            int[] woman=new int[m];//女生战斗力组合
            for(int i=0;i<n;i++){
                man[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                woman[i]=sc.nextInt();
            }
            int max=0;//最大组合的战斗力
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(max<man[i]+woman[j]){
                        max=man[i]+woman[j];
                    }
                }
            }
            System.out.println(max);
        }
    }

    private static boolean validate(int number){
        if(number>=1&&number<=100){
            return true;
        }else{
            return false;
        }
    }
}