package com.ljy.java_teach.lanqiaobei.three_zichuan;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ljy
 * 20190325
 * 来源：2019蓝桥杯省赛填空题
 * 1.题目：
 * 现已知A值为1，Z值为26；AA值为27，AZ值为52；LQ值为329，请问：2019对应的字符是什么？
 * 2.分析：
 * 通过对数值的规律进行推理，可以得出规律，假设abcd为字符串（其中a、b、c、d为未知数），那么它的数值结果=a*26*26*26+b*26*26+c*26+d
 * 如果有再高位数可以依次类推
 * 3.做题（程序思路基于此处设计）：2019
 * （1）首先通过26*26<2019<26*26*26得出位数是三位
 * （2）然后计算最高位（记为百位）：2019/26*26=2.98,记为2，即B
 * （3）计算十位的字母：(2019-2*26*26)/26=25.65，记为25，即Y
 * （3）计算个位的字母：2019-2*26*26-25*26=17，即Q
 */
public class A2 {
    //char[] array={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private final String ARRAY="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final int N=ARRAY.length();//获取字符串长度作为计算基准
    /**
     * 计算字符串对应的数值
     * @param input 只能是大写字母A-Z
     * @return
     */
    public long count(String input){
        long sum=0;//最终要返回的数
        int length=input.length();//获取录入的字符串长度
        for (int i = 0; i<length ; i++) {//从最高位开始计算
            char temp=input.charAt(i);//获取录入字符串的指定位置字符
            sum+=(ARRAY.indexOf(temp)+1)*Math.pow(N,length-i-1);
        }
        return sum;
    }

    /**
     * 根据值获取指定的字符串
     * @param number 值，必须>0
     * @return
     */
    public String getString(int number){
        StringBuilder stringBuilder=new StringBuilder();
        while (true){
            stringBuilder.insert(0,ARRAY.charAt(N-1));//将数组最后一个值（Z），添加到字符串最前面——从低位计算到高位
            if(count(stringBuilder.toString())>=number){//检测字符串长度多少时会超出值，用数组最大值，类似Z、ZZ、ZZZ的值即可以计算
                int length=stringBuilder.toString().length();//获取对应字符串的最大位数
                stringBuilder.delete( 0, length);//清空字符串，之前用于计算最大位数；现在用于获取值对应的字符串
                for (int i = 0; i<length ; i++) {//从字符串高位开始添加
                    int index=(int)(number/Math.pow(N,length-i-1));//只保留整数位，小数点直接去掉,如2.98=2。1表示A，2表示B……
                    if(i!=length-1){//括号内算法是针对高位计算的，不能在最低位时使用
                        if(number==index*Math.pow(N,length-i-1)){//防止类似AZ的值为52，结果B值就是2*26=52，导致个位数字母因为差值为0无法计算
                            index--;//通过回减，达成目的：比如52对应的值应该是AZ，但是通过计算却变为B*，*会因为值为0计算出错
                        }
                    }
                    stringBuilder.append(ARRAY.charAt(index-1));//位置-1。即让值为1时显示A，值为2时显示B
                    number-=index*Math.pow(N,length-i-1);
                }
                break;
            }
        }
        return stringBuilder.toString();
    }

    /**
     * 第二种方法，不用之前的指定字符串，用ASCII配合26进制实现，更简洁高效
     * 根据值获取指定的字符串
     * @param number 值，必须>0
     * @return
     */
   /* public String getString2(int number){
        List<String> s=new ArrayList<String>();
        char begin='a';
        while(number>0){
            int remainder=number%10;//获取最低位的数字

        }

    }*/


    public static void main(String[] args) {
        A2 a1=new A2();
        System.out.println(a1.getString(1));
        System.out.println(a1.getString(26));
        System.out.println(a1.getString(27));
        System.out.println(a1.getString(52));
        System.out.println(a1.getString(329));
        System.out.println(a1.getString(2019));
    }

    @Test
    public void testCount() {
        A2 a1=new A2();
        System.out.println(a1.count("A"));
        System.out.println(a1.count("Z"));
        System.out.println(a1.count("AA"));
        System.out.println(a1.count("AZ"));
        System.out.println(a1.count("ZZ"));
        System.out.println(a1.count("AAA"));
        System.out.println(a1.count("LQ"));
        System.out.println(a1.count("BYQ"));
        System.out.println(a1.count("LANQIAO"));
    }

    @Test
    public void testGetString() {
        A2 a1=new A2();
        System.out.println(a1.getString(702));
        System.out.println(a1.getString(703));
        System.out.println(a1.getString(2019));
    }



}
