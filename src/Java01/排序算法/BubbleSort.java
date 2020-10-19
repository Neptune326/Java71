package Java01.排序算法;

import java.util.Arrays;

/*
冒泡排序：

算法思路：
1、比较相邻的元素。如果第一个比第二个大，就交换它们两个；
2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
3、针对所有的元素重复以上的步骤，除了最后一个；
4、重复步骤1~3，直到排序完成。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,7,9,6,1,5,8,2};
        System.out.println("冒泡排序前：" + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("冒泡排序后：" + Arrays.toString(arr));
    }
}
