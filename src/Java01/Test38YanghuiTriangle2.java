package Java01;

import java.util.Scanner;

/*
杨辉三角

 */
public class Test38YanghuiTriangle2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您想要的行数：");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            //由于只是给杨辉三角内的位置赋值，所以是j<=i
            for (int j = 0; j <= i; j++) {
                //根据规律，使用if else 赋值
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
				/*由于只是输出杨辉三角范围内的值，所以在内层循环就输出，这种方法不能全部赋值完之后再输出
					"\t"的原因是10和小于10的数组的宽度不同，所以使用\t制表符能使数与数之间距离相等
				*/
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
