package Java01;

import java.util.Scanner;

public class Test22Array {
    public static void main(String[] args) {
        double[] score = new double[5];
        double sum = 0;
        double avg = 0;
        System.out.println("班级成绩统计");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位学生的成绩：");
            score[i] = scanner.nextDouble();
            sum += score[i];
        }
        avg = sum / 5;
        System.out.println("班级总分为：" + sum);
        System.out.println("班级平均分为：" + avg);

        System.out.println("========================");

        for (double sc : score){
            System.out.print(sc + "\t");
        }
    }
}
