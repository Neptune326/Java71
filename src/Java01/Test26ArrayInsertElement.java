package Java01;

import java.util.Arrays;
import java.util.Scanner;

/*
数组：{22, 98, 33, 112, 65, 45}
在数组中插入一个数字，降序排列（多余的数字删除）
 */
public class Test26ArrayInsertElement {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 22;
        arr[1] = 98;
        arr[2] = 33;
        arr[3] = 112;
        arr[4] = 65;
        arr[5] = 45;
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));       //{112, 98, 65, 45, 33, 22}
        System.out.println("=========================");
        System.out.print("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (num > arr[i]) {
                index = i;
                break;
            }
        }
        for (int j = arr.length - 1; j > index; j--) {
            arr[j] = arr[j - 1];
        }
        arr[index] = num;
        System.out.println(Arrays.toString(arr));
    }
}
