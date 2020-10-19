package Java01;

import java.util.Arrays;

/*
数组倒置
 */
public class Test28ArrayUpAndDown {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(list));
        for (int min = 0, max = list.length - 1; min < max; min++, max--) {
            int temp = list[min];
            list[min] = list[max];
            list[max] = temp;
        }
        System.out.println(Arrays.toString(list));
    }
}
