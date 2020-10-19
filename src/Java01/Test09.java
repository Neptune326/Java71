package Java01;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入Java成绩：");
        int Jscore = input.nextInt();
        System.out.println("请输入音乐成绩：");
        int Mscore = input.nextInt();

        if (Jscore >= 90 && Mscore >= 90){
            System.out.println("成绩优秀！！！");
        }else {
            System.out.println("有待努力");
            }
        }

}
