package com.ljy.java_teach.lanqiaobei.one_jisuan;

import java.util.Scanner;

/**
 * 蓝桥杯培训题
 * 一、【问题描述】 小明对数位中含有 2、0、1、9 的数字很感兴趣，在 1 到 40 中这样的数包 括 1、2、9、10 至 32、39 和 40，共 28 个，他们的和是 574。
 * 1.请问，在 1 到 2019 中，所有这样的数的和是多少？
 * 2.在 1 到 2019 中，所有这样的数的平方和是多少？
 * 3.在 1 到 2019 中，所有这样的数的立方和是多少？
 * 4.在 1 到 n 中，所有这样的数的和是多少？(编程题)
 *
 * 二、题解
 * 枚举1~n所有的数，假设是X
 * 分解X的各位数字，判断是否包含2、0、1、9
 * 如果包含2019，累加X的值(或平方和/立方和)
 *
 */
public class A1 {

    /**
     * 判断数字是否包含2,0,1,9
     * 算法说明：
     * 1.从number的最低位（个位）开始查找是否包含数字2,0,1,9：如果包含则终止执行返回true；如果不包含则从十位开始判断是否包含数字2,0,1,9；以此类推……
     * @param number
     * @return true表示包含
     */
    private static boolean ok(int number){
        while(number!=0){
            int a=number%10;//取最低位数的数值
            if(a==2||a==0||a==1||a==9){//如果包含2,0,1,9四个数字
                return true;//终止循环，返回true
            }else{
                number/=10;//如果不包含则从高一位的数字判断是否包含数字2,0,1,9；以此类推……
            }
        }
        return false;//如果执行到这一步说明number数值为0
    }

    //请问，在 1 到 2019 中，所有这样的数的和是多少？
    private static int count1(int begin,int end){
        int sum=0;//获取总和
        for(int i=begin;i<=end;i++){
            if(ok(i)){
                sum+=i;
            }
        }
        return sum;
    }



    //在 1 到 2019 中，所有这样的数的平方和是多少？
    //特别提示：注意用Long来保持结果，否则会溢出造成数值错误
    private static long count2(int begin,int end){
        long sum=0;//获取总和
        for(int i=begin;i<=end;i++){
            if(ok(i)){
                sum+=Math.pow(i,2);
            }
        }
        return sum;
    }

    //在 1 到 2019 中，所有这样的数的立方和是多少？
    //特别提示：注意用Long来保持结果，否则会溢出造成数值错误
    private static long count3(int begin,int end){
        long sum=0;//获取总和
        for(int i=begin;i<=end;i++){
            if(ok(i)){
                sum+=Math.pow(i,3);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin=sc.nextInt();//获取开始的数
        int end=sc.nextInt();//获取结束的数
        System.out.println(count1(begin,end));
        System.out.println(count2(begin,end));
        System.out.println(count3(begin,end));
    }
}
