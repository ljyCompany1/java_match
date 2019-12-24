package com.ljy.java_practice.nowcoder.a.a8.a8_4;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22226
 * （1）题目描述：质数（prime number）又称素数，有无限个，质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数。
 例如小于10的质数有2，3，5，7。
 * （2）输入描述：
 第一行输入一个整数T，表示询问的个数
 接下来T行每行输入一个整数n.
 1<=T<=1e8,1<=n<=1000000
 * （3）输出描述：对于每个询问n输出小于等于n的的质数的个数。
 * （4）例如：
 * a.示例1
 * 输入：
 2
 10
 1000000
 * 输出：
 4
 78498

 * 2.思路分析
 *（1）提高质数判断的效率：int n = (int)Math.sqrt(number);
 * 判断一个数是否是质数时，只要试到它的平方根即可。
 * 一个合数分解质因数时，最大质因数不会大于它的平方根，所以循环从2到sqrt(n)即可。
 *
 * 3.运行结果
 *通过
 *
 */

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static Set<Integer> data=new HashSet<Integer>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int t = sc.nextInt();//获取要询问的个数
            int[] array = new int[t];
            for (int i = 0; i < t; i++) {//赋值
                array[i] = sc.nextInt();
            }
            for (int n : array) {
                int count=0;//小于等于n的的质数的个数
                for(int i=1;i<=n;i++){
                    if(data.contains(i)){
                        count++;
                    }else{
                        if(isPrime(i)){
                            count++;
                            data.add(i);
                        }
                    }
                }
                System.out.println(count);
            }
        }
    }

    //判断该数是否是质数
    private static boolean isPrime(int number){
        boolean judge=true;//默认是质数
        if(number>1){
            int n = (int)Math.sqrt(number);//一个合数分解质因数时，最大质因数不会大于它的平方根，所以循环从2到sqrt(n)即可
            for(int j=2;j<=n;j++){
                if(number%j==0){
                    judge=false;
                    break;
                }
            }
        }else{//1不是质数
            judge=false;
        }
        return judge;
    }
}
