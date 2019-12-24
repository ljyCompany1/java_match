package com.ljy.java_practice.nowcoder.a.a8.a8_3;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22225
 * （1）题目描述：请统计一篇英文文章里所有小写字母各出现了几次。
 * （2）输入描述：输入若干行，处理到文件结尾。字符总数<=100000
 * （3）输出描述：输出若干行，按字符序输出每种小写字符的出现次数，没有出现的字符不用输出。
 * （4）例如：
 * a.示例1
 * 输入：
 abc abc def
 abab   ccc
 ccc ccc
 * 输出：
 a:4
 b:4
 c:11
 d:1
 e:1
 f:1
 *
 * 2.思路分析
 * 这个题目主要有两个问题要解决。
 * 一是如何在控制台判断是文件结尾
 * 经过查找资料后发现，在idea控制台，键盘上按Ctrl+D可以终止输入
 * 二、在答案结果测试中，测试一直无法保证100%正确率
 * 最终发现是题目的说明不是很清楚,
 * 按传统的认知，使用LinkedHashMap来按照插入顺序输入字母数量即可，如例题。
 * Map<String,Integer> map=new LinkedHashMap<>();
 * 结果发现不能完全正确，经过思考后，觉得会不会按照字典顺序排列（题目的示例无法看出是字典排列还是插入顺序排列）
 * 使用TreeMap试了下，即解决了问题
 *  Map<String,Integer> map=new TreeMap<String,Integer>();
 *
 * 3.运行结果
 * 通过
 *
 */

import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String,Integer> map=new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.next();
            for(int i=0;i<input.length();i++){
                String s=input.substring(i,i+1);
                if(isLetter(s)){
                    if(map.containsKey(s)){
                        map.put(s,map.get(s)+1);
                    }else{
                        map.put(s,1);
                    }
                }
            }
        }
        Iterator it=map.keySet().iterator();
        while(it.hasNext()){
            String s=(String)it.next();
            System.out.println(s+":"+map.get(s));
        }
    }

    /*public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder=new StringBuilder();
        while(sc.hasNext()){
            stringBuilder.append(sc.next());
        }
        if(stringBuilder.length()<=100000){
            Map<String,Integer> map=new LinkedHashMap<String,Integer>();
            String s=null;
            for(int i=0;i<stringBuilder.length();i++){
                s=stringBuilder.substring(i,i+1);
                if(isLetter(s)){
                    if(map.containsKey(s)){
                        map.put(s,map.get(s)+1);
                    }else{
                        map.put(s,1);
                    }
                }
            }
            Iterator it=map.keySet().iterator();
            while(it.hasNext()){
                s=(String)it.next();
                System.out.println(s+":"+map.get(s));
            }
        }
    }*/

    /**
     * 判断是否是小写字母
     * @param str
     * @return true表示是小写字母
     */
    private static boolean isLetter(String str){
        Pattern pattern = Pattern.compile("[a-z]+");
        return pattern.matcher(str).matches();
    }
}
