package Java01;

import java.util.Scanner;

/*
二维数组

题目：
统计3个班级各5名学生的成绩,求出总分、平均分
 */
public class Test36DoubleArray {
    public static void main(String[] args) {
        int[][] scores = new int[3][5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("******第" + (i + 1) + "个班级的成绩******");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print("请输入第" + (j + 1) + "个学生的成绩：");
                scores[i][j] = sc.nextInt();
            }
        }

        System.out.println("=================================");
        System.out.println("******考试成绩统计******");
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            System.out.println("第" + (i + 1) + "个班级的总分为：" + sum
                    + "，第" + (i + 1) + "个班级的平均分为：" + sum / scores[i].length);
        }
    }
}
