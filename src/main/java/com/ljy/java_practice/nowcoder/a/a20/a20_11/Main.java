package com.ljy.java_practice.nowcoder.a.a20.a20_11;




/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/16783?&headNav=acm
 * （1）题目描述：设有n个正整数（n ≤ 20），将它们联接成一排，组成一个最大的多位整数。
 例如：n=3时，3个整数13，312，343联接成的最大整数为：34331213
 又如：n=4时，4个整数7，13，4，246联接成的最大整数为：7424613
 * （2）输入描述：第一行，一个正整数n。第二行，n个正整数。
 * （3）输出描述：一个正整数，表示最大的整数
 * （4）例如：
 * a.示例1
 * 输入：
 3
 13 312 343
 * 输出：
 34331213


 * 2.思路分析
 * 实现重点：了解字符串比较大小的方法compareTo
 * （1）对数字进行分析可以知道：
 * 13 312 343
 * 首先，这几个数字组成的最终数字的位数是不变的
 * 在上面的前提下，选择数字当中最高位数字最大的数放在最前面
 * 如果最高位数字一样，则判断次高位的，依次类推

 * (2)用字符串排序。
 * Collections.sort(list);
 * 字符串排序会按照：首字母的数字大小进行升序排序，如果首字母相同，则由第二个字母判断，依次类推
 * 但是在特例中，例如：312 31
 * 按照上述算法的结果是：31231，但是这个值很明显<31312
 * 因此可以对312和31进行判断，如比较a+b和b+a的大小就可以解决这个问题。
 * 最终思路：通过重写compare方法来实现
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
        if(n>0&&n<=20){
            List<String> list=new ArrayList<String>();//存储要录入的正整数集合
            for(int i=0;i<n;i++){
                int m=sc.nextInt();
                list.add(String.valueOf(m));
            }
            Comparator<String> comparator = new Comparator<String>(){//自定义字符串比较方法
                @Override
                public int compare(String s1, String s2) {
                    return (s1+s2).compareTo(s2+s1);
                }
            };
            Collections.sort(list,comparator);
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=list.size()-1;i>=0;i--){//原排序好的集合是升序的，这里就逆向取值
                stringBuilder.append(list.get(i));
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
