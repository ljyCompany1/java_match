package com.ljy.java_practice.nowcoder.a.a2.a2_1;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/21994
 * （1）题目描述：给你一天里的两个时间(24小时制),求这两个时间内有多少分钟,保证第一个时间在第二个时间之前
 * （2）输入描述：输入两行,每行包含两个整数表示小时与分钟
 * （3）输出描述：输出分钟数
 * （4）例如：
 * a.示例1
 * 输入：
 * 10 10
 * 11 05
 * 输出：55
 * 2.思路分析
 * （1）如何从控制台拆分出两个时间
 * （2）如何将控制台的字符串格式化为时间
 * （3）如何计算时间差
 * 3.运行结果
 *通过
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String date1String=bf.readLine();//根据题目输入要求：获取控制台输入的两个日期
        String date2String=bf.readLine();//根据题目输入要求：获取控制台输入的两个日期
        SimpleDateFormat dateFormat=new SimpleDateFormat("HH mm");//日期格式化
        try {
            Date date1=dateFormat.parse(date1String);
            Date date2=dateFormat.parse(date2String);
            if(!date1.after(date2)){//如果时间1不在时间2之后
                long diff = (date2.getTime() - date1.getTime())/(1000 * 60);//计算相差的分钟
                System.out.println(diff);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
