package Java01;

import java.util.Arrays;

/*
Arrays类相关的方法：
equals(array1,array2):比较两个数组是否相等，返回值类型：boolean
sort(array):对数组进行升序排列， 返回值类型：void
toString(array):将数组转换成字符串，返回值类型：String
fill(array,val):将数组元素赋值为val，返回值类型：void
copyOf(array,length):把数组复制成一个长度为length的新数组，返回值类型：和原数组数据类型一样
binarySearch(array,val):查询元素值val在数组中的下标，返回值类型：int

 */
public class Test29ArraysMethod {
    public static void main(String[] args) {
        int[] arr1 ={10,30,50};
        int[] arr2 ={10,40,50};
        int[] arr3 ={10,50,30};
        System.out.println("arr1和arr2是否相等：" + Arrays.equals(arr1,arr2));
        System.out.println("arr1和arr3是否相等：" + Arrays.equals(arr1,arr3));
        System.out.println("======================");

        int[] arr4 = {2,4,3,7,5,5,6,9,1};
        Arrays.sort(arr4);
        System.out.println("将数组升序后转换成字符串输出：" + Arrays.toString(arr4));
        System.out.println("======================");

        int[] arr5 = {4,3,6,7,8,4,5,};
        System.out.println("原数组：" + Arrays.toString(arr5));
        Arrays.fill(arr5,2);
        System.out.println("将数组所有数赋值为2：" + Arrays.toString(arr5));
        System.out.println("======================");

        int[] arr6 = {1,2,3,4,5,6,7};
        int[] newArr6 = Arrays.copyOf(arr6, 9);
        System.out.println("原数组：" + Arrays.toString(arr6));
        System.out.println("将原数组copy成一个长度为9的新数组：" + Arrays.toString(newArr6));
        System.out.println("======================");

        int[] arr7 = {1,2,3,4,5,6,7};
        System.out.println("数组：" + Arrays.toString(arr7));
        System.out.println("数组中元素4的下标为：" + Arrays.binarySearch(arr7,4));

    }
}
