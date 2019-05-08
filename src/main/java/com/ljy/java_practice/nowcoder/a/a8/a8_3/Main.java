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
 *
 * 3.运行结果
 *不通过，原因未知。猜测是在输入环节出问题
 *
 */

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder=new StringBuilder();
        if(sc.hasNext()){
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
    }

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
