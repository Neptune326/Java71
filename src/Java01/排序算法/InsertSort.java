package Java01.排序算法;

import java.util.Arrays;

/*
插入排序：

算法思路：
1、从第一个元素开始，该元素可以认为已经被排序；
2、取出下一个元素，在已经排序的元素序列中从后向前扫描；
3、如果该元素（已排序）大于新元素，将该元素移到下一位置；
4、重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
5、将新元素插入到该位置后；
6、重复步骤2~5。
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {4,3,7,9,6,1,5,8,2};
        System.out.println("插入排序前：" + Arrays.toString(array));

        int index = 0;
        int current = 0;

        for (int i = 1; i < array.length; i++) {
            index = i - 1;        //左边的排是排好序的
            current = array[i];   //表示当前取到的扑克牌
            while (index >= 0 && array[index] > current) {   //如果左边的排比取到的排大则右移
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = current;  //直到该手牌比抓到的牌小(或二者相等)，将抓到的牌插入到该手牌右边
        }

        System.out.println("插入排序后：" + Arrays.toString(array));
    }
}
