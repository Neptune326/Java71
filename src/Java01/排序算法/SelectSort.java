package Java01.排序算法;

import java.util.Arrays;
/*
选择排序：
算法思路：
首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
然后，再从剩余未排序元素中继续寻找最小（大）元素，
然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {4,3,7,9,6,1,5,8,2};
        System.out.println("选择排序前：" + Arrays.toString(arr));
        int minIndex = 0;
        int num = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;//假设最开始的元素为最小值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                   minIndex = j;
                }
            }
            num = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = num;
        }
        System.out.println("选择排序后：" + Arrays.toString(arr));
    }
}
