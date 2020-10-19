package Java01;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        System.out.println("请输入四位会员卡号：");
        Scanner input = new Scanner(System.in);
        int cardID = input.nextInt();

        int gewei = cardID % 10;
        int shiwei = cardID / 10 % 10;
        int baiwei = cardID /100 % 10;
        int qianwei = cardID / 1000;

        int sum = gewei + shiwei + baiwei +qianwei;
        System.out.println("您的会员卡号" + cardID + "各位之和为：" + sum);
        boolean isLuck = sum > 20;
        System.out.println("您是幸运用户吗：" + isLuck);


    }
}
