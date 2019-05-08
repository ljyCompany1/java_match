package com.ljy.java_practice.nowcoder.a.a9.a9_2;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22235
 * （1）题目描述：牛村新开了一个系列赛，一个系列赛有m场比赛，比赛规则是解题数越多排名越前，如果前几名队伍解题数一样则会并列第一。
 有n个神仙队伍完整参加了m场比赛，请问有几个队伍拿过第一名。
 * （2）输入描述：第一行输入两个整数n,m,表示队伍数量与m场比赛。
 接下来n行输入一个数字矩阵，每行m个数字字符表示每场比赛的解题数量
 1<=n,m<=100
 * （3）输出描述：输出一个整数表示拿过第一名的队伍数量
 * （4）例如：
 * a.示例1
 * 输入
 3 5
 91728
 11828
 11111
 * 输出：
 3

 * 2.思路分析
 *（1）输出分析：如果一个队伍拿过多次第一名，也只记为1次。
 *
 *
 * 3.运行结果
 *通过
 *
 */

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m>=1&&m<=100&&n>=1&&n<=100){
            String[] peoples=new String[n];//存储所有人的每场比赛的解题数量
            for(int i=0;i<peoples.length;i++){
                peoples[i]=sc.next();
            }
            Set<Integer> winers=new HashSet<Integer>();//存储队伍编号（获胜队伍），用set可以解决队伍重复获奖的问题
            //注意:下面存储的解题数量实际获取的是ASCII的值（非实际解题数），但是这里只是判断最大值，就没有问题
            Map<Integer,Integer> people_match=new LinkedHashMap<Integer, Integer>();//存储每次比赛的结果：队伍编号-解题数量
            for(int j=0;j<m;j++){//遍历每场比赛
                for(int i=0;i<peoples.length;i++) {//遍历每个选手
                    people_match.put(i,(int)peoples[i].charAt(j));
                }
                //通过遍历获取最大的解题数
                Set<Integer> values = new HashSet<>(people_match.values());//获取该次比赛的所有解题结果
                Iterator it=values.iterator();
                int max=0;//存储最大解题数
                while(it.hasNext()){//通过遍历获取最大值
                    int value=(int)it.next();
                    if(max<value){
                        max=value;
                    }
                }
                //通过遍历找出该次比赛获奖的所有队伍
                it=people_match.keySet().iterator();
                while(it.hasNext()) {//找出最大值的键
                    int key=(int)it.next();
                    if(people_match.get(key)==max){
                        winers.add(key);//将获胜的队伍存入
                    }
                }
            }
            people_match.clear();//将该次比赛结果清空，便于下次重新记录。——也可以不清空，下次添加会自动覆盖
            System.out.println(winers.size());
        }
    }
}
