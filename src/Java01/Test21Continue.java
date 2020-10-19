package Java01;

import java.util.Scanner;

/*
continue: 跳出当前次循环（不执行当前次循环continue之后的语句），执行剩余次循环
 */
public class Test21Continue {
    public static void main(String[] args) {
        //总计班级成绩大于80分的人数和比例
        int score;      //成绩
        int total;        //班级总人数
        int num = 0;        //大于80分的人数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入班级的总人数：");
        total = scanner.nextInt();
        for (int i = 0; i < total; i++) {
            System.out.print("请输入第" + (i + 1) + "位学生的成绩：");
            score = scanner.nextInt();
            if (score < 80){
                continue;
            }
            num++;
        }
        double rate = (double) num / total * 100;
        System.out.print("班级成绩大于80分的人数为：" + num);
        System.out.print("80分占班级的比例为：" + rate + "%");
    }
}
