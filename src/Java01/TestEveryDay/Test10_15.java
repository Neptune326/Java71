package Java01.TestEveryDay;

import java.util.Arrays;
import java.util.Scanner;
/*
数组增操作
 */
public class Test10_15 {
    public static void main(String[] args) {
        String[] names = {"Alice",null,"Tom","Jack","Tone","Mike"};
        System.out.println(Arrays.toString(names));
        System.out.print("请输入需要添加的姓名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null){
                index = i;
                break;
            }
        }
        if (index != -1){
            names[index] = name;
            System.out.println(Arrays.toString(names));
        }else {
            System.out.println("数组已满，无法插入");
        }
    }
}
