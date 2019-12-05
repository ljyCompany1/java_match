package com.ljy.java_teach.lanqiaobei.two_shulie;

/**
 * 1.题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子
 * 假如兔子都不死，问第N个月的兔子总数为多少？
 *2.分析：
 * 兔子的规律为数列：1, 1, 2, 3, 5, 8, 13, 21 …
 * 通过规律数列可知
 * 本质就是斐波那契数列 f(0)=0,f(1)=1…f(n)=f(n-1)+f(n-2) (当前项等于前两项之和)。
 */
public class A1 {

    /**
     *返回n个月的兔子数量（单位：对）
     * @param n 第n个月
     * @return 第n个月的兔子数量
     */
    public int count(int n){
        int sum=0;//最后的总和，默认是1
        int a=0,b=0;//a表示第一个数f(n-2)，b表示第二个数f(n-1)
        for(int i=1;i<=n;i++){
            if(i==1||i==2){
                sum=1;
                a=b=1;
            }else{
                sum=a+b;
                a=b;
                b=sum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        A1 fibonacciSequence1=new A1();
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
