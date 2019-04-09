package com.ljy.java_teach;

/**
 * 排序算法
 *（1）算法选择：冒泡排序法
 *（2）算法说明：冒泡排序的思想是从左到右(从右到左)进行相邻元素的大小判定，
 * 如果后一个元素小于前一个元素，交换位置，一轮循环后最大值（最小值）将在最右边(最左边)　　
 * （3）示例：将数组按升序或降序排列
 */
public class Sort1_2 {
    /**
     * 将数组升序排列
     * 算法说明（举例有{3, 62, 1, 17, 9}）：
     * 冒泡排序的思想是从左到右(从右到左)进行相邻元素的大小判定，如果后一个元素小于前一个元素，交换位置，一轮循环后最大值将在最右边　　
     * 排序方向：从左到右
     * 1.第一轮循环（所有元素）：通过相邻元素比对，遍历后位置：{3,1,17,9,62}
     * 2.第二轮循环（左边4个元素）：通过相邻元素比对，遍历后位置：{1,3,9,17,62}
     * 3.第三轮循环（左边3个元素）：通过相邻元素比对，遍历后位置：{1,3,9,17,62}
     * 3.第四轮循环（左边2个元素）：通过相邻元素比对，遍历后位置：{1,3,9,17,62}
     * @param array 需要排序的数组
     */
    public void sortAsc(int[] array) {
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    /**
     * 降序排序
     * @param array
     */
    public void sortDesc(int[] array) {
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
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
        Sort1_2 sort = new Sort1_2();
        int[] array = {3, 62, 1, 17, 9, 13, 32, 55, 67, 17};
        //sort.sortAsc(array);
        //sort.print(array);
        sort.sortDesc(array);
        sort.print(array);
    }
}
