package Java01;

import java.util.Arrays;
import java.util.Scanner;
/*
数组删除元素
 */
public class Test32ArrayRemoveElement {
    public static void main(String[] args) {
        String[] names = {"one","two","three","four","five","six"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的字符串：");
        String name = sc.next();
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                index = i;
                break;
            }
        }
        if (index != -1){
            for (int j = index; j < names.length - 1; j++){
                names[j] = names[j + 1];
            }
            names[names.length - 1] = null;
            System.out.println("删除后的数组为：" + Arrays.toString(names));
        }else {
            System.out.println("数组中没有该字符串，无法删除");
        }
    }
}
