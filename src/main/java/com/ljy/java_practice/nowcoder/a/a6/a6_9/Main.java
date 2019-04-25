package com.ljy.java_practice.nowcoder.a.a6.a6_9;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22209
 * （1）题目描述：请打印输出一个字符金字塔，字符金字塔的特征请参考样例
 * （2）输入描述：输入一个字母，保证是大写
 * （3）输出描述：输出一个字母金字塔。
 * （4）例如：
 * a.示例1
 * 输入：
 C
 * 输出：
   A
  ABA
 ABCBA
 * 2.思路分析
 *找规律
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String [] args) {
        String array="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc=new Scanner(System.in);
        String s=sc.next();//获取输入的字母
        if(isLetter(s)){//如果是大写字母
            char c=s.charAt(0);
            int n=array.indexOf(c);//获取字符所在的位置，即判断C就是2，然后得出是三行
            int max=1+2*n;//获取最大字符数
            for(int i=0;i<=n;i++){
                int current=1+2*i;//获取当前层字符数
                for(int j=1;j<=(max-current)/2;j++){//打印空格数
                    System.out.print(" ");
                }
                int j=0;//用于正反向打印字符
                for(;j<=i;j++){//正向打印字母，如ABC
                    System.out.print(array.charAt(j));
                }
                if(j>=1){
                    for(j=i-1;j>=0;j--){//逆向打印字母，如BC
                        System.out.print(array.charAt(j));
                    }
                }
                System.out.println();//最后换行
            }
        }
    }

    /**
     * 判断是否是大写字母
     * @param str
     * @return true表示是数字
     */
    private static boolean isLetter(String str){
        Pattern pattern = Pattern.compile("[A-Z]+");
        return pattern.matcher(str).matches();
    }
}