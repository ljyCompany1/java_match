package com.ljy.java_practice.nowcoder.b.b1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1.题目
 * （1）题目描述：给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，
 * 要求时间复杂度：O(n)，空间复杂度：O(1)
 * （2）输入描述：无序整数数组A[n]
 * （3）输出描述：满足条件的最大乘积
 * （4）例如：
 * 输入：
 * 4
 * 3 4 1 2
 * 输出：24
 * 输入（结果容易溢出的int）
 * 输入：
 * 61
 * 3472 -7098 -9281 7789 7955 6101 5051 7778 3090 7423 -7151 5652 1595 -8094 677 -8324 8347 -2482 9313 -9338 -3157 8559 6945 3618 3087 121 -8468 3225 1356 6939 2799 -7231 -6309 -5453 633 -8689 -4776 2714 -2743 -1409 5918 -3333 1803 8330 -2206 -6117 -4486 -7903 -4375 -3739 2897 8056 -5864 -522 7451 -4541 -2813 5790 -532 -6517 925
 * 输出：807120253114
 *
 * 2.思路分析
 * （1）思路：
 * 选最大的三个正数；获两个最小的负数（负负得正）和最大的正数。注意0
 * 时间复杂度为O(n)，表明不能用传统的排序法先对数组进行排序
 *
 * （1）容易出错的思路：
 * a.选择数组最大的三个数来相乘
 * 原因：如1 -5 -2 3，最大三个数乘积是-5*-2*3=30
 *
 */

public class Main {

    public static void main(String[] args)  throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        int n = Integer.parseInt(bf.readLine());//根据题目输入要求：获取控制台录入的信息,表示数组里有几个数
        String message=bf.readLine();//根据题目输入要求：获取控制台录入的数组
        String[] str = message.split(" ");
        int[] nums=new int[str.length];
        for (int i=0;i<str.length;++i){
            nums[i]=Integer.parseInt(str[i]);
        }
        Main a1=new Main();
        System.out.println(a1.count(nums));
    }

    /**
     * 计算乘积最大
     * 说明：通过排序，获取最大的三个数
     * @param nums
     */
    public long count(int[] nums){
        long result=0;
        int max1,max2,max3,min1,min2;//max1表示最大的值；min1表示最小的值
        max1=max2=max3=Integer.MIN_VALUE;
        min1=min2=Integer.MAX_VALUE;
        for(int n:nums){
            if(max1<n){
                //当max1值变动时，max2和max3的值也要随之变动
                max3=max2;
                max2=max1;
                max1=n;
            }else if(max2<n){
                //当max2值变动时，max3的值也要随之变动
                max3=max2;
                max2=n;
            }else if(max3<n){
                max3=n;
            }
            if(min2>n){
                min1=min2;
                min2=n;
            }else if(min1>n){
                min1=n;
            }
        }
        result=Math.max(1L*max1*max2*max3,1L*max1*min1*min2);//用1L来相乘，表示为long类型计算，并且要放在计算第一个数才行。如果不加默认是int类型，这样相乘会结果溢出导致为负数
        return result;
    }
}
