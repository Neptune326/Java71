package example;

public class Test04 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        for (int num:
             array) {
            System.out.println(num);
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("==============");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
