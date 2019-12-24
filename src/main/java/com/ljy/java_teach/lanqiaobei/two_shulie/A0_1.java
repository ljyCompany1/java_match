package com.ljy.java_teach.lanqiaobei.two_shulie;

/**
 * 题目：现在有35261个人，要求相互必须握1次手，总共握多少次
 * 思路，找题解方法：
 * 1.如果是1个人，握手0次
 * 2.如果是2个人，握手1次
 * 3.如果是3个人，握手3次:2+1
 * 4.如果是4个人，握手6次：3+2+1
 * 5.如果是5个人，握手10次：4+3+2+1=10
 *
 */
public class A0_1 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=35261-1;i>=1;i--){
            sum+=(i);
        }
        System.out.println(sum);
    }
}
