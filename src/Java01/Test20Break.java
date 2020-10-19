package Java01;

import java.util.Scanner;

/*
break:在循环中，终止当前次循环
      在switch中，终止switch

 */
public class Test20Break {
    public static void main(String[] args) {
        //输入五门课的成绩并求出平均分，输入不符合的数字终止循环
        int score;      //成绩
        int sum = 0;        //总分
        double avg;     //平均分
        boolean isTrue = true;     //输入的成绩是否正确
        System.out.println("=====学生成绩输入=====");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("请输入第" + (i + 1) + "门的成绩：");
            score = scanner.nextInt();
            //输入成绩不符合，跳出循环
            if (score < 0 || score > 100){
                isTrue = false;
                break;
            }
            sum += score;
        }
        //输入错误时执行
        if (!isTrue){
            System.out.println("输入成绩错误，无法录入！");
        }else {
            //五次输入全部正确，计算平均分
            avg = (double) sum / 5;
            System.out.println("平均分为：" + avg);
        }
    }
}
