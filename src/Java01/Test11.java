package Java01;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        System.out.println("请输入期末考试成绩：");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if ( score == 100){
            System.out.println("奖励BMW");
        }else  if (score > 80 && score <= 99){
            System.out.println("奖励iPhone12");
        }else if (score <= 80 && score >= 60){
            System.out.println("奖励IPad");
        }else {
            System.out.println("啥都没有");
        }
    }
}
