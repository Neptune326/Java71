package Java01;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {

        System.out.println("请输入您的年龄：");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age < 0 || age >100){
            System.out.println("你输入的年龄不合法");
        }else if (age < 18){
            System.out.println("青少年时期");
        }else if (age < 35){
            System.out.println("青壮年时期");
        }else if (age < 68){
            System.out.println("中年时期");
        }else {
            System.out.println("老年时期");
        }

    }
}
