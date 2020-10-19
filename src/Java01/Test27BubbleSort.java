package Java01;

import java.util.Arrays;

/*
冒泡排序
 */
public class Test27BubbleSort {
    public static void main(String[] args) {
        int[] list = {4, 3, 8, 6, 0, 3, 1};
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
