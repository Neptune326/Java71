package Java01.TestEveryDay;

import java.util.Scanner;

/*
二分查找
 */
public class Test10_16 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("*****二分查找算法*****");
        System.out.print("请输入数字：");
        int num = new Scanner(System.in).nextInt();
        int index = binarySearch(arr, num);
        System.out.println(num + "的下标为：" + index);
    }

    public static int binarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (num == arr[mid]) {
                return mid;
            } else if (num < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
