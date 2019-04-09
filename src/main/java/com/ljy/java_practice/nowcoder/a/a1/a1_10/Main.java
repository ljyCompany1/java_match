package com.ljy.java_practice.nowcoder.a.a1.a1_10;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/21993
 * （1）题目描述：输入三个数，反序输出这三个数。
 * （2）输入描述：输入三个整数a, b , c 以空格隔开0<=a,b,c<=2(31)次方−1
 * （3）输出描述：输出一行，三个整数，以空格隔开
 * （4）例如：
 * a.示例1
 * 输入：2 6 9
 * 输出：9 6 2
 * 2.思路分析
 * (1)如何从控制台拆分出三个整数
 * (2)如何反序，这里选择标准的反序做法。——此题可以取巧，自行探讨
 * 3.运行结果
 *通过
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String message=bf.readLine();//根据题目输入要求：获取控制台输入的三个整数
        String[] str = message.split(" ");//拆分这三个整数
        if(str.length==3){
            List<String> stringList = Arrays.asList(str);
            Collections.reverse(stringList);
            str=(String[])stringList.toArray();
            try {
                int a=Integer.parseInt(str[0]);
                int b=Integer.parseInt(str[1]);
                int c=Integer.parseInt(str[2]);
                if(validate(a)&&validate(b)&&validate(c)){//如果数据有效
                    System.out.print(a+" "+b+" "+c);
                }
            } catch (NumberFormatException e) {
                //e.printStackTrace();//转换异常的话不输出
            }
        }
    }

    /**
     * 验证数字是否有效
     * @param number
     * @return true表示有效,false表示无效
     */
    private static boolean validate(int number){
        boolean judge=false;
        if(number>=0&&(number<=Math.pow(2,31)-1)){
            judge=true;
        }
        return judge;
    }
}
