package com.ljy.java_practice.nowcoder.a.a8.a8_8;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22230
 * （1）题目描述：给你一个整数n，按要求输出n∗n的回型矩阵
 * （2）输入描述：输入一行，包含一个整数n。1<=n<=19
 * （3）输出描述：输出n行，每行包含n个正整数.
 * （4）例如：
 * a.示例1
 * 输入：
 4
 * 输出：
 1 2 3 4
 12 13 14 5
 11 16 15 6
 10 9 8 7

 * 2.思路分析
 *（1）质问题是画矩形线问题。
 第一圈：
 画上线的时候，y不变，x逐次加一
 画右线的时候，x不变，y逐次加一
 画下线的时候，y不变，x逐次减一
 画左线的时候，x不变，y逐次减一

 第二圈：
 画上线的时候，y+1不变，x+1逐次加一
 画右线的时候，x+1不变，y+1逐次加一
 画下线的时候，y+1不变，x+1逐次减一
 画左线的时候，x+1不变，y+1逐次减一
 *
 * 3.运行结果
 * 通过
 *
 */

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();//整数n
            if(n>=1&&n<=19) {
                int[] array=new int[n];
                for(int i=0;i<n;i++){
                    array[i]=i+1;
                }
                int m=1;//对n的计数
                int i=0;//二维数组的行坐标
                int j=0;//二维数组的列坐标
                int[][] arrays=new int[4][4];
                while(m<=20){
                    for(i=0,j=0;j<n;j++){//画回文的上边
                       arrays[i][j]=m++;
                    }
                    for(i=n-j;i<n;i++){//画回文的右边
                        arrays[i][j]=m++;
                    }
                    for(j=i;j>=0;j--){//画回文的下边
                        arrays[i][j]=m++;
                    }
                    for(i=n-j;i>0;j++){//画回文的左边
                        arrays[i][j]=m++;
                    }
                }
            }
        }
    }
}
