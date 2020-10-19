package Java01;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        int random = (int)(Math.random() * 10);
        System.out.println("请输入四位会员卡号：");
        Scanner input = new Scanner(System.in);
        int cardID = input.nextInt();

        int baiwei = cardID / 100 % 10;

        if (baiwei == random){
            System.out.println("恭喜你中奖了！！！");
        }else {
            System.out.println("没中奖，再接再厉！");
        }

    }
}
