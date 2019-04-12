package com.ljy.java_practice.nowcoder.a.a7.a7_3;


/**
 * 1.题目地址：https://ac.nowcoder.com/acm/problem/22213
 * （1）题目描述：牛村村口要架设一个矩形的广告屏，村长要求广告屏的总像素必须为n，还要求广告屏的长和宽最大可能的接近，而且宽不能大于长，村长找你来计算一下宽和长分别为多少？
 * （2）输入描述：输入一行，包含一个正整数n表示像素点个数。(1 <= n <= 1000000)
 * （3）输出描述：宽和长，两个整数之间用空格隔开。
 * （4）例如：
 * a.示例1
 * 输入：8
 * 输出：2 4
 * <p>
 * 2.思路分析
 * <p>
 * 3.运行结果
 * 通过
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String message = bf.readLine();//根据题目输入要求：获取控制台输入的数字
        List<S> array = new ArrayList<S>();
        int n = 0;
        try {
            n = Integer.parseInt(message);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (n >= 1 && n <= 1000000) {
            for (int a = 1; a <= n; a++) {
                if (n / a == n * 1F / a) {//如果是整数，注意判断方式。
                    int b = n / a;
                    if (a <= b) {//宽不能大于长
                        array.add(new S(a, b));
                    } else {//如果宽已经大于长，则停止循环
                        break;
                    }
                }
            }
        }
        S s= Collections.min(array);//获取最小distance的对象
        System.out.printf("%d %d", s.getA(), s.getB());
    }
}

class S implements Comparable<S> {
    private Integer a;
    private Integer b;
    private Integer distance;

    public S(Integer a, Integer b) {
        this.a = a;
        this.b = b;
        distance=Math.abs(a-b);
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public Integer getDistance() {
        return distance;
    }

    @Override
    public int compareTo(S s) {
        //按distance默认排序，如1和10比较，10最大
        return this.getDistance().compareTo(s.getDistance());
    }
}