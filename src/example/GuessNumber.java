package example;

import java.util.Random;
import java.util.Scanner;

//猜数字（1-100）
public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        while (true) {
            int guessNum = sc.nextInt();
            if (guessNum > randomNum) {
                System.out.println("猜大了，请重试！");
            } else if (guessNum < randomNum) {
                System.out.println("猜小了，请重试！");
            } else {
                System.out.println("猜对了！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
