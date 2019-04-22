package com.ljy.java_practice.nowcoder.a.a8.a8_1;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22222
 * （1）题目描述：给你n个数，有一个数的出现次数超过一半，请找出这个数。
 * （2）输入描述：
 输入两行。
 第一行包含一个整数n
 第二行包含n个整数ai
 1 <= n <= 1000, 1 <= ai <= 1e9
 * （3）输出描述：输出一行，包含一个整数。
 * （4）例如：
 * a.示例1
 * 输入：
 5
 1 2 2 3 2
 * 输出：
 2
 *
 * 2.思路分析
 *
 *
 * 3.运行结果
 *通过
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        int n = Integer.parseInt(bf.readLine());//根据题目输入要求：获取控制台录入的信息,表示几行数组
        if(n>=1&&n<=1000){
            long[] numbers=new long[n];
            String[] messages=bf.readLine().split(" ");
            boolean judge=true;//对数组中的数进行验证
            for(int i=0;i<n;i++){
                numbers[i]=Long.parseLong(messages[i]);
                if(!validate(numbers[i])){
                    judge=false;
                }
            }
            if(judge){//如果验证通过
                Map<Long,Integer> map=new HashMap<Long, Integer>();//key表示数组中的数，value表示重复的次数
                for(long number:numbers){
                    if(map.containsKey(number)){//先判断该数是否已经在集合中
                        map.put(number,map.get(number)+1);//将该数的次数加1
                    }else{
                        map.put(number,1);//将该数放入集合中
                    }
                }
                int size=map.size();//获取集合中元素数量，即有多少个不重复的数
                Set set=map.keySet();//获取集合中所有数的集合
                Iterator it=set.iterator();
                while(it.hasNext()){
                    long number=(long)it.next();
                    if(map.get(number)>size/2){
                        System.out.println(number);
                        break;
                    }
                }
            }
        }
    }

    private static boolean validate(long number){
        if(number>=1&&number<=Math.pow(10,9)){
            return true;
        }else{
            return false;
        }
    }
}
