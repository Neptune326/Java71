package Java01;

import java.util.Scanner;

/*
杨辉三角

 */
public class Test37YanghuiTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您想要的行数：");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= i - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
