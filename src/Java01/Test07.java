package Java01;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {

        System.out.println("请输入一个数字：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("该数字为：" + ((num / 2 == 0) ? "偶数" : "奇数"));

    }
}
