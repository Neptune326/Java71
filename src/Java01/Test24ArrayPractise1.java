package Java01;

import java.util.Scanner;

public class Test24ArrayPractise1 {
    public static void main(String[] args) {
        int[] array = {8, 4, 2, 7, 45, 123};
        int sum = 0;
        for (int num : array) {
            System.out.print(num + "\t");
            sum += num;
        }
        System.out.println("\n所有数字和为：" + sum);
        Scanner scanner = new Scanner(System.in);
        outer:
        while (true) {
            System.out.print("请输入一个整数：");
            int num = scanner.nextInt();
            for (int j : array) {
                if (j == num) {
                    System.out.println("数组中包含" + num);
                    break outer;
                }
            }
        }
    }
}
