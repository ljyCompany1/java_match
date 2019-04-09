package com.ljy.java_teach;

/**
 * 1.题目：一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个n级的台阶总共有多少种跳法？
 *2.分析：
 * 蛙每次只能跳上 1 级或 2 级台阶。
 * 一级楼梯：1种跳法
 * 二级楼梯：2种跳法（1+1,2）
 * 三级楼梯：3种跳法（1+1+1，1+2,2+1）
 * 四级楼梯：5种跳法（1+1+1+1，1+1+2,1+2+1,2+1+1,2+2）
 * 五级楼梯：8种跳法（1+1+1+1+1，1+1+1+2,1+1+2+1,1+2+1+1,2+1+1+1,2+2+1,2+1+2;1+2+2）
 * 可以看出，除了一级楼梯和二级楼梯的数量，其他楼梯都是等于前两项之和
 * 至此，就转化为求解斐波那契数列的第 n 项问题。
 * 即斐波那契数列 f(0)=0,f(1)=1…f(n)=f(n-1)+f(n-2) (当前项等于前两项之和)。
 */
public class FibonacciSequence2 {

    /**
     *返回n层楼梯的跳法数量
     * @param n 第n层
     * @return 第n个月的跳法数量
     */
    public int count(int n){
        int sum=0;//最后的总和，默认是1
        int a=0,b=0;//a表示第一个数f(n-2)，b表示第二个数f(n-1)
        for(int i=1;i<=n;i++){
            if(i==1){
                sum=1;
                a=1;
            }else if(i==2){
                sum=2;
                b=2;
            }else{
                sum=a+b;
                a=b;
                b=sum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        FibonacciSequence2 fibonacciSequence1=new FibonacciSequence2();
        System.out.println(fibonacciSequence1.count(1));
        System.out.println(fibonacciSequence1.count(2));
        System.out.println(fibonacciSequence1.count(3));
        System.out.println(fibonacciSequence1.count(4));
        System.out.println(fibonacciSequence1.count(5));
        System.out.println(fibonacciSequence1.count(6));
        System.out.println(fibonacciSequence1.count(7));
        System.out.println(fibonacciSequence1.count(8));
    }
}
