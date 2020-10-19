package Java01;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score = input.nextInt();
        if (score < 10){
            System.out.println("请输入你的性别：");
            String sex = input.next();
            if (sex.equals("男")){
                System.out.println("进入男子决赛");
            }else if (sex.equals("女")){
                System.out.println("进入女子决赛");
            }else {
                System.out.println("输入有误");
            }

        }else {
            System.out.println("无缘进入决赛");
        }


    }
}
