package com.ljy.java_practice.nowcoder.a.a5.a5_10;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22198
 * （1）题目描述： 牛村正在进行村长选举，投票人一人一票，牛可乐是候选人A（投票代号为1）、
 * 牛能是候选人B（投票代号为2）和牛妹是候选人C（投票代号为3），其他投票代号无效。
 投票列表用以-1表示结束，请分别统计出他们的得票数。
 谁的得票超过全部投票人数的半数，就输出谁当选为村长，如“A-yes”表示A当选，全部不过半数，输出“all-NO”。
 * （2）输入描述：输入一行，若干个整数，以-1结尾
 * （3）输出描述：输出五行，前三行表示三个候选人的表票数，然后是总的有效票数，最后一行表示选举结果。
 * （4）例如：
 * a.示例1
 * 输入：
 1  1  3  2  1  3  2  1  3  3  1  2  4  1  4  1  2   1  2  1 1 -1
 * 输出：
 A=10
 B=5
 C=4
 Tot=19
 all-NO

 * 2.思路分析
 *如果要投票的角色多，可以使用map集合来进行记录：键表示被投票角色，值表示投票数量
 *
 *
 * 3.运行结果
 *通过
 *
 */

import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n!=-1){
                list.add(n);
            }else{
                break;
            }
        }
        int a,b,c;
        int total=list.size();//获取总的投票人数
        a=b=c=0;
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int number:list){
            if(number==1){
                a++;
            }else if(number==2){
                b++;
            }else if(number==3){
                c++;
            }
        }
        Iterator it=map.keySet().iterator();
        System.out.println("A="+a);
        System.out.println("B="+b);
        System.out.println("C="+c);
        System.out.println("Tot="+(a+b+c));
        if(a*2>total){
            System.out.println("A-yes");
        }else if(b*2>total){
            System.out.println("B-yes");
        }else if(c*2>total){
            System.out.println("C-yes");
        }else {
            System.out.println("all-NO");
        }
    }
}

