package Java01;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        System.out.println("学习合格了吗?(y/n)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        while (!"y".equals(answer)){
            System.out.println("继续学习！");
            System.out.println("学习合格了吗?(y/n)");
            answer = scanner.next();
        }
        System.out.println("完成学习任务");
    }
}
