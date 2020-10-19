package Java01;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {

        int score;
        int sum = 0;
        double avg = 0.0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入第" + (i + 1) + "门的成绩：");
            score = scanner.nextInt();
            sum += score;
        }
        avg = sum / 5;
        System.out.print("\n五门成绩的平均分为：" + avg);

    }
}
