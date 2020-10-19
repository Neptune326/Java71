package Java01;

import java.util.Scanner;

/*
二分查找
 */
public class Test33BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,6,12,34,45,57,69,87,94};

        System.out.print("请输入需要的查询的数：");
        Scanner sc = new Scanner(System.in);
        int searchNum = sc.nextInt();//查找的数

        int searchIndex = -1;//查找的数所在索引
        int endIndex = arr.length - 1;//结束索引
        int startIndex = 0;//开始索引

        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            if (searchNum == arr[midIndex]) {
                searchIndex = midIndex;
                System.out.println("存在" + searchNum + ",索引：" + searchIndex);
                break;
            } else if (searchNum < arr[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
        if (searchIndex == -1) {
            System.out.println("没有该数！");
        }
    }
}
