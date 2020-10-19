package example.String;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数
种类有：大写字母、小写字母、数字、其它
 */
public class StringPractise2 {
    public static void main(String[] args) {
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z'){
                countUpper++;
            }else if (c >= 'a' && c <= 'z'){
                countLower++;
            }else if (c >= '0' && c <= '9'){
                countNumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("字符串中大写字母的个数：" + countUpper);
        System.out.println("字符串中小写字母的个数：" + countLower);
        System.out.println("字符串中数字的个数：" + countNumber);
        System.out.println("字符串中其它字符的个数：" + countOther);
    }
}
