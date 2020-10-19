package example.ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数，然后筛选其中的偶数元素，放好小集合中
要求使用自定义的方法来实现筛选
 */
public class ArrayListPracitse4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100) + 1);
        }
        System.out.println(list);
        ArrayList<Integer> smallList = getSmallList(list);
        System.out.println(smallList);
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
