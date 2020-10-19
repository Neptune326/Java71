package Java01.TestEveryDay;

import java.util.Scanner;

/*
杨辉三角
 */
public class Test10_19 {
    public static void main(String[] args) {
        System.out.println("请输入需要的行数：");
        int n = new Scanner(System.in).nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
