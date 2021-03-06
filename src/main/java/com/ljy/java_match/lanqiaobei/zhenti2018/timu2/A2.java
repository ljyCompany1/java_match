package com.ljy.java_match.lanqiaobei.zhenti2018.timu2;

import java.util.Scanner;

/**
 * 蓝桥杯培训题
 * 一、【问题描述】-填空题
 * 标题：猴子分香蕉
 *
 * 5只猴子是好朋友，在海边的椰子树上睡着了。这期间，有商船把一大堆香蕉忘记在沙滩上离去。
 * 第1只猴子醒来，把香蕉均分成5堆，还剩下1个，就吃掉并把自己的一份藏起来继续睡觉。
 * 第2只猴子醒来，重新把香蕉均分成5堆，还剩下2个，就吃掉并把自己的一份藏起来继续睡觉。
 * 第3只猴子醒来，重新把香蕉均分成5堆，还剩下3个，就吃掉并把自己的一份藏起来继续睡觉。
 * 第4只猴子醒来，重新把香蕉均分成5堆，还剩下4个，就吃掉并把自己的一份藏起来继续睡觉。
 * 第5只猴子醒来，重新把香蕉均分成5堆，哈哈，正好不剩！
 *
 * 请计算一开始最少有多少个香蕉。
 *
 * 需要提交的是一个整数，不要填写任何多余的内容。
 *
 * 二、题解
 * 思路，
 * （1）可以直接用数学方法在纸上计算
 * 假设n为原来的香蕉数量
 * 第一只猴子：5*x1+1=n  3
 * 第二只猴子：5*x2+2=4*x1 2
 * 第三只猴子：5*x3+3=4*x2 1
 * 第四只猴子：5*x4+4=4*x3 0
 * 第五只猴子：5*x5=4*x4
 * 将上述公式进行分析处理后,取最小值可以得出答案：3141
 * （2）利用程序求解
 *
 *
 */
public class A2 {

    //采用举证法一个一个数的尝试，暴力破解，找到一个数满足所有条件
    private static void count1(){
        int n=6;//从第1只猴子醒来，把香蕉均分成5堆，还剩下1个可以看出，至少有6个桃子
        while(true){
            if((n-1)%5==0) {//满足第1个条件
                int a=(n-1)*4/5;//第1轮剩下的桃子
                if((a-2)%5==0) {//满足第2个条件
                    int b=(a-2)*4/5;//第2轮剩下的桃子
                    if( (b-3)%5==0 ) { //满足第3个条件
                        int c=(b-3)*4/5;//第3轮剩下的桃子
                        if((c-4)%5==0) {//满足第4个条件
                            int d=(c-4)*4/5;//第4轮剩下的桃子
                            if(d%5==0&&d!=0) {//满足第5个条件，注意，如果用程序的话，可能会出现d为0的情况，因为0也可以分为5堆，程序可行，但是不符合常理
                                System.out.println(n);
                                break;
                            }
                        }
                    }
                }
            }
            n++;
        }
    }



    public static void main(String[] args) {
            count1();
    }
}
