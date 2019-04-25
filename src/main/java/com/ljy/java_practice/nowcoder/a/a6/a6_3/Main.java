package com.ljy.java_practice.nowcoder.a.a6.a6_3;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22202
 * （1）题目描述：输入一串字符，以“?”结束。统计其中字母个数，数字个数，其它符号个数。
 * （2）输入描述：输入一行，包含若干个字符，以”?”结尾。
 * （3）输出描述：输出三行，每行包含一个整数，依次为字母个数，数字个数，其他符号个数。
 * （4）例如：
 * a.示例1
 * 输入：
 ab123!?
 * 输出：
 Letters=2
 Digits=3
 Others=1
 *备注：空格也可能是一个字符
 * 2.思路分析
 *用正则表达式
 * 3.运行结果
 *通过
 *
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int letters,digits,others;
        letters=digits=others=0;
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(c=='?'){
                break;
            }
            String s=String.valueOf(c);
            if(isLetter(s)){
                letters++;
            }else if(isNumber(s)){
                digits++;
            }else{
                others++;
            }
        }
        System.out.println("Letters="+letters);
        System.out.println("Digits="+digits);
        System.out.println("Others="+others);
    }

    /**
     * 判断是否是数字
     * @param str
     * @return true表示是数字
     */
    private static boolean isNumber(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    /**
     * 判断是否是字母
     * @param str
     * @return true表示是数字
     */
    private static boolean isLetter(String str){
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        return pattern.matcher(str).matches();
    }

    private static boolean validate(int number){
        if(number>=1&&number<=Math.pow(10,5)){
            return true;
        }else{
            return false;
        }
    }
}

