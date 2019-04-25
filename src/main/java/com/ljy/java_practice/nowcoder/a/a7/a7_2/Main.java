package com.ljy.java_practice.nowcoder.a.a7.a7_2;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22212
 * （1）题目描述： 牛村的中央广场是一块5*5的矩阵空旷广场，广场上有且仅有一个救助箱，
 * 每天下班前，牛可乐都要把救助箱推回到广场的中心位置（第三行第三列），
 * 牛可乐可以向上下左右四个方向推箱子，一次只能推动一个单位，请问牛可乐要推几次才能把救助箱推回中心位置？
 * （2）输入描述：输入5行，每一行5个整数，以空格隔开，数据保证只有一个1，代表救助箱，而且其他数都是0
 * （3）输出描述：输出一行，包含一个整数，表示最少的推箱子次数。
 * （4）例如：
 * a.示例1
 * 输入：
 0 0 0 0 0
 0 0 0 0 1
 0 0 0 0 0
 0 0 0 0 0
 0 0 0 0 0
 * 输出：
 3

 * 2.思路分析
 *首先获取1所在的位置；
 * 其次计算1所在位置和中间位置array[2][2]的距离
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arrays=new int[5][5];//定义一个五行五列的二维数组
        Point point=null;
        int x=0;
        //获取数组
        for(int i=0;i<5;i++){//遍历行
            for(int j=0;j<5;j++){//遍历列
                x=sc.nextInt();
                if(x==1){
                    point=new Point(i,j);
                }
            }
        }
        int distance=Math.abs(point.getX()-2)+ Math.abs(point.getY()-2);
        System.out.println(distance);
    }
}
class Point{
    private Integer x;
    private Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}