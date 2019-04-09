package com.ljy.java_teach;

/**
 * 排序算法
 *（1）算法选择：选择排序法
 *（2）算法说明：通过过内部循环第一次遍历数组找到最小的元素与数组的第一个元素交换位置，
 * 第二次遍历数组找到第二小的元素与数组的第二个元素交换位置，
 * 当内存循环找到最小的元素并交换位置后下次遍历时应该避开这个最小元素。
 * 这种排序方法对任何结构的数组都是O(n²)的时间复杂度
 * （3）示例：将数组按升序或降序排列
 */
public class Sort1_1 {

    /**
     * 将数组升序排列
     * 算法说明（举例有{3, 62, 1, 17, 9}）：
     * 1.第一轮循环（所有元素）：找到最小的元素与数组的第一个元素交换位置。遍历后位置：{1, 62, 3, 17, 9}
     * 2.第二轮循环（右边4个元素）：找到第二小的元素与数组的第二个元素交换位置。遍历后位置：{1, 3 ,62, 17, 9}
     * 3.第三轮循环（右边3个元素）：找到第三小的元素与数组的第三个元素交换位置。遍历后位置：{1, 3 ,9 17, 62}
     * 4.第四轮循环（右边2个元素）：找到第四小的元素与数组的第四个元素交换位置。遍历后位置：{1, 3 ,9 17, 62}
     * @param array 需要排序的数组
     */
    public void sortAsc(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * 数组降序排序
     * 算法说明：参照升序排序规则
     * @param array 需要排序的数组
     */
    public void sortDesc(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    public void print(int[] array){
        for(int temp:array){
            System.out.print(temp+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Sort1_1 sort= new Sort1_1();
        int[] array = {3, 62, 1, 17, 9, 13, 32, 55, 67, 17};
        sort.sortAsc(array);
        sort.print(array);
        sort.sortDesc(array);
        sort.print(array);
    }

}
