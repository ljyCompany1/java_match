package com.ljy.java_practice.nowcoder.a.a4.a4_9;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22164
 * （1）题目描述：利用更相减损术求两个整数的最大公约数，即每次将较大的数变成大数减去小数的值
 * （2）输入描述：输入两个正整数，范围在1000000以内
 * （3）输出描述：输出一个整数
 * （4）例如：
 * a.示例1
 * 输入：4 6
 * 输出：2
 *
 * 2.思路分析
 *(1)更相减损法是出自《九章算术》的一种求最大公约数的算法，它原本是为约分而设计的，
 * 但它适用于任何需要求最大公约数的场合。又名“更相减损术”，辗转相减法，等值算法，尼考曼彻斯法。
 * 它广泛应用在数学和计算机上。
 * (2)　步骤
 * 第一步：任意给定两个正整数；判断它们是否都是偶数。若是，则用2约简（即是用两个整数都各自除以2）；若不是则执行第二步。
 * 第二步：以较大的数减较小的数，接着把所得的差与较小的数比较，并以大数减小数。继续这个操作，直到所得的减数和差相等为止。
 * 则第一步中约掉的若干个2与第二步中等数的乘积就是所求的最大公约数。
 * 其中所说的“等数”，就是最大公约数。求“等数”的办法是“更相减损”法。所以更相减损法也叫等值算法。
 * 3.运行结果
 *通过
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的数字
        String[] strs=message.split(" ");
        if(strs.length==2){
            int a=Integer.parseInt(strs[0]);
            int b=Integer.parseInt(strs[1]);
            if(validate(a)&&validate(b)){
                int ans=1;//表示约掉的若干个2,初始化默认1。
                int gcd=1;//最大公约数
                while(a%2==0&&b%2==0){//如果两个数都是偶数,用2约简
                    a/=2;
                    b/=2;
                    ans=ans*2;
                }
                if(a==b){//如果两个值相等，最大公约数为它本身，如7和7
                    gcd=a;
                }else{
                    if(a<b){//对a、b值进行交换，保证a>b
                        int temp=b;
                        b=a;
                        a=temp;
                    }
                    while(true){
                        gcd=a-b;//获取差
                        if(gcd==b){//所得的减数和差相等，则停止循环
                            break;
                        }else{//如果不相等，把所得的差与较小的数比较，并以其中的大数减小数
                            a=Math.max(b,gcd);
                            b=Math.min(b,gcd);
                        }
                    }
                }
                System.out.println(gcd*ans);//第一步中约掉的若干个2与第二步中等数的乘积就是所求的最大公约数。
            }
        }
    }

    private static boolean validate(int number){
        if(number>0&&number<=1000000){
            return true;
        }else{
            return false;
        }
    }
}
