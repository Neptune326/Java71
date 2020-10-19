package Java01;

import java.util.Scanner;

public class Test24ArrayPractise2 {
    public static void main(String[] args) {
        int[] scores = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位学生的成绩：");
            scores[i] = scanner.nextInt();
        }
        System.out.println("五位学生的成绩为：");
        for (int score : scores) {
            System.out.print(score + "\t");
        }
        System.out.println("\n========================");
        int max = scores[0];
        int min = scores[0];
        for (int score : scores) {
            if (score > max){
                max = score;
            }
            if (score < min){
                min = score;
            }
        }
        System.out.println("五位学生成绩的最高分为：" + max);
        System.out.println("五位学生成绩的最低分为：" + min);
    }
}
