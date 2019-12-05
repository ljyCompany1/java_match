package com.ljy.java_teach.lanqiaobei.one_jisuan;

import java.util.Scanner;

/**
 * 蓝桥杯培训题
 * 一、【问题描述】 我们知道第一个质数是 2、第二个质数是 3、第三个质数是 5……请你计算 第 2019 个质数是多少？
 *
 * 二、题解
 * 枚举i = 2, 3, 4, …
 * 判断i是不是质数
 * 如果是质数，计数器cnt++
 * 如果cnt==2019, 输出当前的i的值
 *
 * 一般我们要估计一下第2019个质数大概有多大
 * 如果答案非常大，上述枚举算法可能会TLE
 * 对上限的估计需要一点数论知识：N以内的质数大约有N/ln(N)个。
 * 根据上述公式我们可以估算出答案不超过201900。
 *
 */
public class A2 {

    /**
     * 判断是否是质数
     * @param number
     * @return true表示是质数
     */
    private static boolean isPrime(int number){
        for(int i=2;i<number;i++){
            if(i*i>number){//性能瓶颈关键：数学理论：判断一个数是否为质数 只需要观察在2到这个数平方根中间，是否含有约数即可。通过这个理论可以减少时间限制
                break;
            }else{
                if(number%i==0){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//表示要计算第n个质数
        int number=2;//因为质数从2算起，因此这里直接把第一个数取为2
        int i=0;//表示第i个质数
        while(true){
            if(isPrime(number)){//如果是质数
                i++;//计数器+1
            }
            number++;//每次数字也往后加
            if(i==n){//当已经把最后一个质数找到，则终止循环
                System.out.println(number);//输出最后一个质数的值
                break;
            }

        }
    }
}
