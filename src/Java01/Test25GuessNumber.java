package Java01;

import java.util.Scanner;

/*
数列：8,4,2,1,23,344,12
题目：
1、循环输出数列的值
2、求出数列中的数字和
3、猜数字
 */
public class Test25GuessNumber {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {8, 4, 2, 1, 23, 344, 12};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n数列之和为：" + sum);
        System.out.println("猜数字：");
        Scanner sc = new Scanner(System.in);
        int guessNum = sc.nextInt();
        boolean flag = false;
        for (int num : arr) {
            if (guessNum == num) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("猜对了！");
        } else {
            System.out.println("猜错了！");
        }
    }
}
