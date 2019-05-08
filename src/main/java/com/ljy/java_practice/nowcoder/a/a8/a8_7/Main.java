package com.ljy.java_practice.nowcoder.a.a8.a8_7;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22229
 * （1）题目描述：找出一个数组中出现次数最多的那个元素
 * （2）输入描述：第一行输入一个整数n(不大于20） 第二行输入n个整数。
 * （3）输出描述：找出n个整数中出现次数最多的那个整数,如果有多个,输出最先出现的那个。
 * （4）例如：
 * a.示例1
 * 输入：
 4
 1 2 2 3
 * 输出：
 2

 * 2.思路分析
 *（1）
 *
 * 3.运行结果
 * 通过
 *
 */

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();//整数n
            if(n<=20){
                Map<Integer,Integer> map=new LinkedHashMap<Integer, Integer>();//有序map集合，用于存储“数字-》出现次数”
                for(int i=0;i<n;i++){
                    int number=sc.nextInt();
                    if(map.containsKey(number)){
                        map.put(number,map.get(number)+1);
                    }else{
                        map.put(number,1);
                    }
                }
                Set<Integer> values = new HashSet<>(map.values());//获取所有值
                Iterator it=values.iterator();
                int max=0;//存储最大次数
                while(it.hasNext()){//通过遍历获取最大值
                    int m=(int)it.next();
                    if(max<m){
                        max=m;
                    }
                }
                it=map.keySet().iterator();
                while(it.hasNext()) {//找出最大值的键
                    int number=(int)it.next();
                    if(map.get(number)==max){
                        System.out.println(number);
                        break;//只输出最先出现的那个
                    }
                }
            }
        }
    }
}
