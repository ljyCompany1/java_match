package com.ljy.java_teach;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 排序法
 * 使用Java集合自带的外比较器和集合进行排序
 */
public class Sort2_1 {

    public void print( Integer[] array){
        for(int temp:array){
            System.out.print(temp+"\t");
        }
    }

    public static void main(String[] args) {
        Sort2_1 sort= new Sort2_1();
        Integer[] array = {3, 62, 1, 17, 9, 13, 32, 55, 67, 17};
        //比对其
        Comparator<Integer> cmp = new Comparator<Integer>() {
            //方法说明：compareTo就是比较两个值，如果当前对象大于方法中的参数，返回1，等于返回0，小于返回-1
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        };
        Arrays.sort(array,cmp);
        sort.print(array);

    }
}
