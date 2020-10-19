package Java01;

import java.util.Arrays;

/*
选择排序

思路：
首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
然后，再从剩余未排序元素中继续寻找最小（大）元素，
然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 */
public class Test35SelectSort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,4,7,6,1,9,8};
        System.out.println(Arrays.toString(arr));

        int minIndex = -1;  //最小值索引
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {  //找出arr[i]之后比arr[i]小的数的索引值
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){     //存在比arr[i]小的数，与arr[i]交换
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
