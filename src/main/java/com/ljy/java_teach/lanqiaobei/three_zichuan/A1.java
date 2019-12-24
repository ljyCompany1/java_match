package com.ljy.java_teach.lanqiaobei.three_zichuan;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 蓝桥杯培训题
 * 一、【问题描述】 一个字符串的非空子串是指字符串中长度至少为 1 的连续的一段字符组成 的串。
 * 例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共 7 个。
 * 注意在计算时，只算本质不同的串的个数。 请问，字符串0100110001010001 有多少个不同的非空子串？
 *
 * 二、题解
 * 枚举开始和结束位置(i, j)即可确定一个子串S[i, j]
 * 对所有S[i, j]去重即可
 * Java：在java中，可以利用set集合来去重
 *
 * 三、题目扩展（ljy）
 * 1.输入一串字符，以“?”结束。统计其中字母个数，数字个数，其它符号个数
 * 本题在项目的地址：com.ljy.java_practice.nowcoder.a.a6.a6_3
 * 2.牛村正在进行村长选举，投票人一人一票，牛可乐是候选人A（投票代号为1）、
 *  牛能是候选人B（投票代号为2）和牛妹是候选人C（投票代号为3），其他投票代号无效。
 *  投票列表用以-1表示结束，请分别统计出他们的得票数。
 * 本题在项目的地址：com.ljy.java_practice.nowcoder.a.a5.a5_10
 *
 *
 *
 */
public class A1 {

    /**
     * 计算指定字符串有几个不同的非空子串
     */
    private static int count(String s){
        Set<String> set=new HashSet<String>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                set.add(s.substring(i,j+1));//注意：substring方法它是从指定的 beginIndex 处开始， endIndex:到指定的 endIndex-1处结束。因此j需要+1，才能到j的位置
            }
        }
        return set.size();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();//可以用字符串：0100110001010001测试，答案是100
        System.out.println(count(s));
    }
}
