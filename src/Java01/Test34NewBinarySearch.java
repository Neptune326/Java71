package Java01;

public class Test34NewBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 23, 45, 46, 57, 79, 98};
        int index = binarySearch(arr, 46);
        System.out.println("二分查找算法测试：");
        System.out.println("KEY=46的下标为：" + index);

    }

    public static int binarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (num == arr[mid]) {
                return mid;
            } else if (num < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
