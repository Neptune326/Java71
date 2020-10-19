package Java01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入行数：");
        int n = new Scanner(System.in).nextInt();
        int[][] arr = new int[n+1][n+1];

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i -1][j] + arr[i -1 ][j-1];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
