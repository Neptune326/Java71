package Java01;

import java.util.Arrays;
import java.util.Scanner;
/*
数组添加元素
 */
public class Test31ArrayInsertElement {
    public static void main(String[] args) {
        String[] names = {"one","two","three","four",null,"six"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
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
        }else {
            System.out.println("数组已满，无法添加");
        }
        System.out.println("添加后的数组为：" + Arrays.toString(names));
    }
}
